package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
            this.libraryDatabase = libraryDatabase;
    }
    public List<Book> listBookWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book("The book title", "The book autho", 2000);
        bookList.add(book);

        //temporary returning list of one book
        return bookList;
    }
}
