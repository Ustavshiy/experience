package com.courses.apollo.util.library;

import com.courses.apollo.model.library.Book;
import com.courses.apollo.model.library.Reader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for Catalog class and inner class BookHistory.
 */
public class CatalogTest {
    Catalog catalog = Catalog.getInstance();
    Catalog.BookHistory annaKarenina = catalog.new BookHistory(Book.ANNA_KARENINA);

    @Before
    public void before(){
        annaKarenina.takeBook(new Reader("Andriy Shevchenko"));
        annaKarenina.returnBook();
        annaKarenina.takeBook(new Reader("Doctor Komarovsky"));
    }

    @Test
    public void BookHistoryTest(){
        Assert.assertEquals("Doctor Komarovsky",annaKarenina.getCurrentReader());
    }

    @Test
    public void CatalogTest(){
        Assert.assertEquals(annaKarenina,catalog.getBookHistories().get(0));
    }
}
