package com.courses.apollo.util.library;

import com.courses.apollo.model.library.Book;
import com.courses.apollo.model.library.Reader;

import java.util.ArrayList;
import java.util.List;

/**
 * Class catalog of Book.
 */
public final class Catalog {
    /**
     * Book history.
     */
    private List<BookHistory> bookHistories = new ArrayList<>();

    /**
     * Singleton pattern to avoid duplicates.
     */
    private static final Catalog INSTANCE = new Catalog();

    private Catalog() {
    }

    public static Catalog getInstance() {
        return INSTANCE;
    }

    /**
     * Book history class. Conteins name of book and list of readers.
     */
    public class BookHistory {
        /**
         * Name of Book.
         */
        private Book book;
        /**
         * List of readers.
         */
        private List<Reader> readers = new ArrayList<>();

        public BookHistory(Book book) {
            this.book = book;
        }

        public BookHistory(Book book, Reader reader) {
            this.book = book;
            book.setUnavailable();
            readers.add(reader);
            bookHistories.add(this);
        }

        /**
         * Method of taking the Book.
         *
         * @param reader Reader.
         */
        public void takeBook(Reader reader) {
            if (book.isAvailable()) {
                book.setUnavailable();
                readers.add(reader);
                bookHistories.add(this);
            }
        }

        /**
         * Method of returning the book.
         */
        public void returnBook() {
            book.setAvailable();
        }

        /**
         * Get name of current Reader of Book.
         *
         * @return String.
         */
        public String getCurrentReader() {
            if (book.isAvailable()) {
                return "Book " + book.name() + " is available";
            }
            return this.readers.get(readers.size() - 1).getName();
        }

        public List<Reader> getReaders() {
            return readers;
        }
    }

    public List<BookHistory> getBookHistories() {
        return bookHistories;
    }
}