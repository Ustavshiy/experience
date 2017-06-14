package com.courses.apollo.util.stringutils;

import static java.util.stream.IntStream.range;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Class for String utils.
 */
public class StringUtils {

    /**
     * Method removes longest substring which begins and ends with the same symbol.
     *
     * @param string input String.
     * @return edited String.
     */
    public String maxSubstringDelete(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        AtomicInteger substringStart = new AtomicInteger(0);
        AtomicInteger substringEnd = new AtomicInteger(0);
        AtomicInteger maxSubstring = new AtomicInteger(0);
        string.chars()
                .forEach(c -> {
                    range(0, string.length()).forEach(i -> range(0, string.length())
                            .forEach(j -> {
                                if (string.charAt(i) == string.charAt(j) && j - i > maxSubstring.get()) {
                                    maxSubstring.set(j - i);
                                    substringStart.set(i);
                                    substringEnd.set(j + 1);
                                }
                            }));
                });
        stringBuilder = stringBuilder.delete(substringStart.get(), substringEnd.get());
        return stringBuilder.toString();
    }

    /**
     * Method removes all sentences that have no same words in any other sentences.
     *
     * @param textToEdit Input String.
     * @return Edited String.
     */
    public String sentencesWithoutSameWordsDelete(String textToEdit) {
        List<String> origSentences = new ArrayList<>(Arrays.asList(textToEdit.split("\\.")));
        textToEdit = textToEdit.toLowerCase();
        List<String> checkSentences = new ArrayList<>(Arrays.asList(textToEdit.split("\\. ")));
        range(0, origSentences.size())
                .forEach(s -> {
                    if (!isWordRepeats(checkSentences.get(s), s, checkSentences)) {
                        origSentences.remove(s);
                    }
                });

        return origSentences.stream().collect(Collectors.joining(".")) + ".";
    }

    /**
     * Check if any word in sentence repeats in other sentences.
     *
     * @param checkSentence       Sentence to check.
     * @param checkSentenceNumber number of sentence in list.
     * @param sentences           List of sentences.
     * @return answer boolean.
     */
    public boolean isWordRepeats(String checkSentence, int checkSentenceNumber, List<String> sentences) {
        String[] words = checkSentence.split(" ");
        AtomicBoolean flag = new AtomicBoolean(false);
        Arrays.stream(words).forEach(w -> sentences.stream().flatMapToInt(s -> range(0, sentences.size()))
                .forEach(sNum -> {
                    if (sNum != checkSentenceNumber && sentences.get(sNum).toLowerCase().contains(w)) {
                        flag.set(true);
                    }
                }));
        return flag.get();
    }
}