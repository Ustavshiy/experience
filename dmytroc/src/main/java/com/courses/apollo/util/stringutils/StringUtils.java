package com.courses.apollo.util.stringutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        int maxSubstring = 0;
        int substringStart = 0;
        int substringEnd = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = i; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j) && j - i > maxSubstring) {
                    maxSubstring = j - i;
                    substringStart = i;
                    substringEnd = j + 1;
                }
            }
        }
        stringBuilder = stringBuilder.delete(substringStart, substringEnd);
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
        for (int j = checkSentences.size() - 1; j >= 0; j--) {
            if (!isWordRepeats(checkSentences.get(j), j, checkSentences)) {
                origSentences.remove(j);
            }
        }
        StringBuilder editedText = new StringBuilder();
        for (int i = 0; i < origSentences.size(); i++) {
            editedText.append(origSentences.get(i) + ".");
        }
        return editedText.toString();
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
        for (int j = 0; j < words.length; j++) {
            for (int i = 0; i < sentences.size(); i++) {
                if (i != checkSentenceNumber && sentences.get(i).toLowerCase().contains(words[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
