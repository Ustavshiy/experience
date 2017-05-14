package com.courses.apollo.service.io;

import java.io.*;
import java.util.*;

/**
 * Util class.
 */
public class StringSorter {


    /**
     * WORKING!
     *
     * @param input
     * @param output
     */
    public static void sortStringInFile(String input, String output) {

        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(new File(output), true));
            bufferedReader = new BufferedReader(new FileReader(new File(input)));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(sortStringByNumberOfWords(line) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     * @param text
     * @return
     */
    public static String sortStringByNumberOfWords(String text) {
        String[] words = text.split("[^A-ZА-Яa-zа-яІіЇїЄє]\\s*\\n*");
        ArrayList<WordCounter> wordsWithCounter = new ArrayList<>();
        for (String word : words) {
            boolean hasWord = false;
            for (WordCounter wWC : wordsWithCounter) {
                if (wWC.isMatchWord(word)) {
                    hasWord = true;
                }
            }
            if (!hasWord) {
                wordsWithCounter.add(new WordCounter(word, 0));
            }
        }
        Collections.sort(wordsWithCounter, new Comparator<WordCounter>() {
            @Override
            public int compare(WordCounter o1, WordCounter o2) {
                return o1.getCounter().compareTo(o2.getCounter());
            }
        });
        StringBuffer answer = new StringBuffer();
        for (WordCounter i : wordsWithCounter) {
            answer.append(i.getWord()).append(" ");
        }
        return answer.toString();
    }



    /**
     * Nested class in order to calculate quantity of words.
     */
    private static class WordCounter{

        /**
         *
         */
        private String word;

        /**
         *
         */
        private Integer counter;

        public WordCounter() {}

        public WordCounter(String word, Integer counter) {
            this.word = word;
            this.counter = counter;
        }

        /**
         *
         * @param word
         * @return
         */
        public boolean isMatchWord(String word) {
            if (this.word.toLowerCase().equals(word.toLowerCase())) {
                counter++;
                return true;
            }
            return false;
        }

        /**
         *
         * @return
         */
        public Integer getCounter() {
            return counter;
        }

        /**
         *
         * @return
         */
        public String getWord() {
            return word;
        }
    }
}