package com.courses.apollo.util.library;

import com.courses.apollo.model.library.Book;
import com.courses.apollo.model.library.Books;
import com.courses.apollo.model.library.Reader;

import java.util.ArrayList;
import java.util.List;

/**
 * Class catalog of Books.
 */
public class Catalog {
    /**
     * Books history.
     */
    List<BookHistory> bookHistories = new ArrayList<>();
    public class BookHistory {
        private Books books;
        private Reader abonent;

        public void takeBook(String bookName, Reader abonent) {

        }

        public String getCurrentAbonent(Book book) {
            if (book.isAvailable()) {
                return "Book " + book.getTitle() + " is aviable";
            }
            return book.getReaders().get(book.getReaders().size() - 1).getName();
        }
    }


}
