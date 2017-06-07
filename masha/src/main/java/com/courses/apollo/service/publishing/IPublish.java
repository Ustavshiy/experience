package com.courses.apollo.service.publishing;

/**
 * Interface of the printed issue for publishing house.
 */
public interface IPublish {

    /**
     *Edit the draft of a text of an issue.
     */
    void editText();

    /**
     * Prepare all the non-text content of an issue.
     */
    void prepareIllustrations();

    /**
     * markup the issue.
     */
    void markup();

    /**
     * sign up the issue and send it to printing.
     */
    void print();

    /**
     * take some copies into Publishing House library.
     */
    void archived();

}
