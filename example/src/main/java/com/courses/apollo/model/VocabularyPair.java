package com.courses.apollo.model;

/**
 * Example of use generic.
 * @param <Kk> is key.
 * @param <Vv> is value.
 */
public class VocabularyPair<Kk, Vv> {

    /**
     * Field key.
     */
    private Kk key;

    /**
     * Field value.
     */
    private Vv value;

    /**
     * Constructor for VocabularyPair.
     * @param key is key.
     * @param value is value.
     */
    public VocabularyPair(Kk key, Vv value) {
        this.key = key;
        this.value = value;
    }

    public Kk getKey() {
        return key;
    }

    public void setKey(Kk key) {
        this.key = key;
    }

    public Vv getValue() {
        return value;
    }

    public void setValue(Vv value) {
        this.value = value;
    }
}
