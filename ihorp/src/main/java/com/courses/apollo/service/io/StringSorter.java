package com.courses.apollo.service.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Util class.
 */
public final class StringSorter {

    private StringSorter() {}

    /**
     * Method find the repeatable words in each line and sort it by frequency of repetition.
     *
     * @param input  way to file which need to sort.
     * @param output way to file with result.
     */
    public static void sortStringInFile(String input, String output) throws IOException {
        String[] lines = IOFileString.readFromFile(input).split("\n");
        for (String line : lines) {
            IOFileString.writeToFile(output, sortStringByNumberOfWords(line) + "\n", true);
        }
    }

    /**
     * Method get string and sort it by frequency of repetition each word in line.
     *
     * @param text text to sort
     * @return String - sorted text.
     */
    public static String sortStringByNumberOfWords(String text) {
        String[] words = text.split("[^A-ZА-Яa-zа-яІіЇїЄє\\'\\-]\\s*\\n*");
        ArrayList<WordCounter> wordsWithCounter = new ArrayList<>();
        // Create a ArrayList of WordCounter.
        for (String word : words) {
            boolean hasWord = false;
            for (WordCounter wordWithCounter : wordsWithCounter) {
                if (wordWithCounter.isMatchWord(word)) {
                    hasWord = true;
                }
            }
            if (!hasWord) {
                wordsWithCounter.add(new WordCounter(word, 0));
            }
        }
        // Sort a List of WordCounter by counter and add words to StringBuilder.
        StringBuilder answer = new StringBuilder();
        wordsWithCounter.stream()
                .sorted(Comparator.comparing(WordCounter::getCounter))
                .forEach((p) -> answer.append(p.getWord()).append(" "));
        return answer.toString();
    }

    /**
     * Nested class in order to calculate quantity of words.
     */
    private static class WordCounter {

        /**
         * Word.
         */
        private String word;

        /**
         * Counter of word.
         */
        private Integer counter;

        WordCounter(String word, Integer counter) {
            this.word = word;
            this.counter = counter;
        }

        /**
         * Method check is word math in object. If matched - counter add.
         *
         * @param word word to check.
         * @return boolean.
         */
        public boolean isMatchWord(String word) {
            if (this.word.toLowerCase().equals(word.toLowerCase())) {
                counter++;
                return true;
            }
            return false;
        }

        public Integer getCounter() {
            return counter;
        }

        public String getWord() {
            return word;
        }
    }
}