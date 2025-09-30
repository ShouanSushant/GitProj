package com.sheridancollege;

public class BookAccount {
    private String lendedTo;
    private int bookLent;

    public BookAccount(String lendedTo, int bookLent) {
        this.lendedTo = lendedTo;
        this.bookLent = bookLent;
    }

    public String getLendedTo() {
        return lendedTo;
    }

    public void setLendedTo(String lendedTo) {
        this.lendedTo = lendedTo;
    }

    public int getBookLent() {
        return bookLent;
    }

    public void setBookLent(int bookLent) {
        this.bookLent = bookLent;
    }
    public void borrowBook() {
        bookLent++;
    }
    public void returnBook() {
        if (bookLent == 0) {
            throw new RuntimeException("No books to return");
        }
        bookLent--;
    }
}
