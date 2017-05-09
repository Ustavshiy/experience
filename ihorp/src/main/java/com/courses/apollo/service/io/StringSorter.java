package com.courses.apollo.service.io;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Util class.
 * В задании 1 требуется ввести последовательность строк из текстового потока и выполнить указанные действия. При этом могут рассматриваться два варианта:
 • каждая строка состоит из одного слова;
 • каждая строка состоит из нескольких слов.
 Имена входного и выходного файлов, а также абсолютный путь к ним могут
 быть введены как аргументы метода.
 */
public class StringSorter {



    public static void sortStringInFile(String input, String output) {

        File inputFile = new File(input);
        File outputFile = new File(output);
        Writer writeFile = null;
        Reader readFile = null;
        try {
            writeFile = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writeFile);
            readFile = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(readFile);
            String line;
            while((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(sortString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String sortString(String line) {

        String[] words = line.split("[^\\w]");

        Stream<String> wordsStream = Arrays.stream(words);
        Comparator<String> compare = (one, two) -> Integer.compare(one.length(), two.length());
        String answer = wordsStream.sorted(compare).toString();
        wordsStream.close();
        return answer;
    }
}

