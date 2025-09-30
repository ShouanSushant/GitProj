package com.sheridancollege;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class BookAccountTest {

    @Test
    @DisplayName("BorrowTest: initially 2 books, borrow 1 -> total 3")
    public void testBorrowBook() {
        BookAccount bookAccount = new BookAccount("Sushant", 2);
        bookAccount.borrowBook();
        assertEquals(3, bookAccount.getBookLent());
    }

    @Test
    @DisplayName("ReturnTest: initially 2 books, return 1 -> total 1")
    public void testReturnBook() {
        BookAccount bookAccount = new BookAccount("Sushant", 2);
        bookAccount.returnBook();
        assertEquals(1, bookAccount.getBookLent());
    }

    @Nested
    class WhenNoBooksLent {
        @Test
        @DisplayName("ReturnTest: no books to return -> should throw exception")
        public void testReturnWhenZero() {
            BookAccount bookAccount = new BookAccount("Shouan", 0);
            assertThrows(RuntimeException.class, () -> bookAccount.returnBook());
        }
    }
}
