package com.courses.apollo.model;

/**
 * Created by User on 20.04.2017.
 */
public class VocabularyPair<K, V> {
    private K key;
    private V value;

    public VocabularyPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
