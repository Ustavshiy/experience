package com.courses.apollo.model;

/**
 * Created by User on 20.04.2017.
 */
public class IntegerStringVocabulary {
    /**
     * Key.
     */
    private Object key;
    /**
     * Value.
     */
    private Object word;

    public IntegerStringVocabulary(Object key, Object word) {
        this.key = key;
        this.word = word;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getWord() {
        return word;
    }

    public void setWord(Object word) {
        this.word = word;
    }
}
