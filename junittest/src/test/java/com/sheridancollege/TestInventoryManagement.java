package com.sheridancollege;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestInventoryManagement {
    @Test
    public void TestForAddingNewBookToInventoryIfBookEists(){
        InventoryManagement manager = new InventoryManagement();
        Book book = new Book("Harry Potter","JK. Rowling", "1122");
        Book book2 = null;
        assertTrue(manager.addNewBook(book));
        assertFalse(manager.addNewBook(book2));


    }
    @Test
    public void TestForAddingNewBookToInventoryThatAlreadyInInventory(){
        InventoryManagement manager = new InventoryManagement();
        Book book = new Book ("Harry Potter","JK Rowlings", "1122");
        manager.addNewBook(book);
        assertFalse(manager.addNewBook(book));
    }
    @Test
    public void TestForSearchingABookThatExists(){
        InventoryManagement manager = new InventoryManagement();
        Book book = new Book("Harry Potter","JK. Rowling", "1122");
        manager.addNewBook(book);
        Book returnedBook = manager.searchForBook(book.getIsbn());
        assertEquals(returnedBook.getTitle(), "Harry Potter");
        assertEquals(returnedBook.getAuthor(),"JK Rowlings");
    }
    public void TestForSearchABookThatDoesNotExist(){
        InventoryManagement manager = new InventoryManagement();
        assertNull(manager.searchForBook("1122"));
    }

    @Test
    public void testForDeletingAbookFromInventory(){
        InventoryManagement manager = new InventoryManagement();
        
    }
}
