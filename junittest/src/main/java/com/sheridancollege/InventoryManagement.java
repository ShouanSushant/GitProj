package com.sheridancollege;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    private Map<String, Book> inventoryBooks = new HashMap();

    public boolean addNewBook(Book book){
        if (book == null || inventoryBooks.containsKey(book.getIsbn()))
            return false;
        else{
            inventoryBooks.put(book.getIsbn(),book);
            return true;
        }
    }

    public Book searchForBook(String isbn){
        return inventoryBooks.get(isbn);
    }
    public boolean deleteBook(Book book){
        if(inventoryBooks.containsKey(book.getIsbn())){
            inventoryBooks.remove(book.getIsbn());
            return true;
        }
        else{
            return false;
        }
    }

}
