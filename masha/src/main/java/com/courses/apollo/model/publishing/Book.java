package com.courses.apollo.model.publishing;

import com.courses.apollo.service.publishing.IPublish;

import java.util.List;

/**
 * Any printed edition of the publishing house.
 */
public abstract class Book implements IPublish {


    /**
     * International Standard Book Number.
     */
    private int isbn;

    /**
     * List of book's authors.
     */
    private List<String> author;

    /**
     * Name of a book.
     */
    private String name;

    @Override
    public void editText() {
    }

    @Override
    public void prepareIllustrations() {
    }

    @Override
    public void markup() {

    }

    @Override
    public void print() {

    }

    @Override
    public void archived() {

    }

    /**
     * Sell to reseller some part of copies.
     */
    public abstract void sellToReseller();

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
