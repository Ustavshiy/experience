package com.courses.apollo.service.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Util class.
 */
public final class StringSorter {

    private StringSorter() {
    }

    /**
     * Method find the repeatable words in each line and sort it by frequency of repetition.
     *
     * @param input  way to file which need to sort.
     * @param output way to file with result.
     */
    public static void sortStringInFile(String input, String output) throws IOException {
        Arrays.stream(IOFileString.readFromFile(input).split("\n"))
                .flatMap(o -> createListWordCounter(o.split("[^A-ZА-Яa-zа-яІіЇїЄє\\'\\-]\\s*\\n*")).stream())
                .sorted(Comparator.comparing(WordCounter::getCounter))
                .forEach((q) -> IOFileString.writeToFile(output, q.getWord() + " ", true));
    }

    /**
     * Method create a List of WordCounters from list of Strings.
     *
     * @param words is array of words.
     * @return List of objects WordCounter type.
     */
    public static List<WordCounter> createListWordCounter(String[] words) {
        List<WordCounter> wordsWithCounter = new ArrayList<>();
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
        return wordsWithCounter;
    }

    /**
     * Nested class in order to calculate quantity of words.
     */
    public static class WordCounter {

        /**
         * Word.
         */
        private String word;

        /**
         * Counter of word.
         */
        private int counter;

        public WordCounter(String word, int counter) {
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

        public int getCounter() {
            return counter;
        }

        public String getWord() {
            return word;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            WordCounter that = (WordCounter) o;
            return counter == that.counter
                    && Objects.equals(word, that.word);
        }

        @Override
        public int hashCode() {
            return Objects.hash(word, counter);
        }
    }
}