package com.springlibrary.interfaces;

import com.springlibrary.objects.Author;
import com.springlibrary.objects.Book;
import com.springlibrary.objects.Genre;
import java.util.List;

public interface BookSearch {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter); //search by one first character

}
