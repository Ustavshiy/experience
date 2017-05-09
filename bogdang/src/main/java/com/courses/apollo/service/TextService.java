package com.courses.apollo.service;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by on 07.05.2017.
 */
public class TextService {

    public int findSumNumber(String text){
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(text);
        int count = 0;
            while (m.find()) {
                int number = new Integer(m.group());
                count += number;
            }
        return count;
    }

    public String noComments(String text){
        String replacement = "";
        String newText = Pattern.compile("/\\*|/").matcher(text).replaceAll(replacement);
        return newText;
    }

    public static String findOneWord(String text) {
        List<String> words = Arrays.asList(text.split("\\W+"));
        Integer quantity = words.size();
        String wordResult = "No coincidence";
        Integer result = 0;
        for (String comparable : words) {
            for (String word : words) {
                if (!comparable.equalsIgnoreCase(word)){
                    result += 1;
                }
            }
            if (result == (quantity - 1)){
                wordResult = comparable;
            }
            result = 0;
        }
        return wordResult;
    }

    public static int findSumEvenNumber(String text){
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text);
        int count = 0;
        while (m.find()) {
            int number = new Integer(m.group());
            int remainder = number % 2;
            if (remainder == 0) {
                count += number;
            }
        }
        return count;
    }


    public static String removeSpace(String text) {
        String replacement = " ";
        text = Pattern.compile("\\s{2,}").matcher(text).replaceAll(replacement);
        Pattern p = Pattern.compile("\\w+\\p{P}\\s+\\p{P}");
        Matcher m = p.matcher(text);
        while (m.find()) {
            String tempOne = m.group();
            String tempTwo = tempOne.replace(" ","");
            text = text.replace(tempOne, tempTwo);
        }
        return text;
    }
}
