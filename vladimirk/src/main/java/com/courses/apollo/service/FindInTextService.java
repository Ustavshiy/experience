package com.courses.apollo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class fof methods, wich work with texts..
 */
public class FindInTextService {

    /**
     * Method to find what kind of letters: vowels or consonants more in every sentence in given text.
     * @param text indicate given text.
     * @return List of Strings, which indicate which sentences longer vowel letters, and in which - consonants.
     */
    public List<String> findWhichLettersMore(String text) {
        List<String> result = new ArrayList<>();
        List<String> sentenses = Arrays.asList(text.split("[\\.\\!\\?\\.+]"));
        for (int i = 0; i < sentenses.size(); i++) {
            Matcher vowel = Pattern.compile("(?i)[aeiouy]").matcher(sentenses.get(i));
            Matcher letter = Pattern.compile("[A-Za-z]").matcher(sentenses.get(i));
            int lettersCounter = 0;
            int vowelCounter = 0;
            while (letter.find()) {
                lettersCounter++;
                if (vowel.find()) {
                    vowelCounter++;
                }
            }
            if (lettersCounter - vowelCounter > vowelCounter) {
                result.add("In the sentence " + (i + 1) + " more consonants");
            } else if (lettersCounter - vowelCounter < vowelCounter) {
                result.add("In the sentence " + (i + 1) + " more vowels");
            } else {
                result.add("The same number of vowels and consonants in sentense " + (i + 1));
            }
        }
        return result;
    }

    /**
     * Method that return quantity of words that begin with vowels in text(poem).
     * @param text to indicate given text.
     * @return quantity of words that begin with vowels.
     */
    public int findNumberOfWordsBgnAndEndWithVowels(String text) {
        List<String> words = Arrays.asList(text.split("\\W+"));
        int counter = 0;
        for (int i = 0; i < words.size(); i++) {
            Pattern pattern = Pattern.compile("^[aeiouy].*");
            if (pattern.matcher(words.get(i).toLowerCase()).find()) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Method that return words with the same first and last letters (without repeat) from given text.
     * @param text to indicate given text.
     * @return List of words.
     */
    public List<String> findWrdSameFstLstLttr(String text) {
        List<String> result = new ArrayList<>();
        List<String> words = Arrays.asList(text.split("\\W+"));
        for (int i = 0; i < words.size(); i++) {
            Pattern pattern = Pattern.compile("^(\\w+).*(\\1)");
            Matcher matcher = pattern.matcher(words.get(i).toLowerCase());
            if (matcher.find() && !(result.contains(words.get(i)))) {
                result.add(words.get(i));
            }
        }
        return result;
    }

    /**
     * Method that return all words with minimal and maximal length from given text.
     * @param text to indicate given text.
     * @return list of words (first - min length, than - max).
     */
    public List<String> returnWordsMaxMinLength(String text) {
        List<String> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<String> words = Arrays.asList(text.split("\\W+"));
        for (int i = 0; i < words.size(); i++) {
            Integer wordLenght = words.get(i).length();
            temp.add(wordLenght);
        }
        temp.sort(Comparator.comparing(Integer::intValue));
        int min = temp.get(0);
        int max = temp.get(temp.size() - 1);
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == min || words.get(i).length() == max) {
                result.add(words.get(i));
            }
        }
        return result;
    }

    /**
     * Method that return a receipt for the payment of a telegram for a given word cost.
     * @param text to indicate given text.
     * @param wordCost to indicate cost by sending 1 word.
     * @return String text of receipt with price.
     */
    public int returnReceiptForPaymentOFTelegram(String text, int wordCost) {
        List<String> words = Arrays.asList(text.split("\\W+"));
        return words.size() * wordCost;
    }
}