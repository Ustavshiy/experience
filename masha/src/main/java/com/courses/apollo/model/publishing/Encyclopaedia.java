package com.courses.apollo.model.publishing;

/**
 * Book that is Encyclopaedia.
 */
public class Encyclopaedia extends Book {

    /**
     * Quantity of he articles in the Encyclopaedia.
     */
    private int articlesQuantity;

    @Override
    public void sellToReseller() {
    }

    public int getArticlesQuantity() {
        return articlesQuantity;
    }

    public void setArticlesQuantity(int articlesQuantity) {
        this.articlesQuantity = articlesQuantity;
    }
}
