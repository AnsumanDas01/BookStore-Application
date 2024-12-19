package org.jt.book_store.service;

import java.util.List;

import org.jt.book_store.dto.BookDetailsResponse;
import org.jt.book_store.dto.HomePageResponse;
import org.jt.book_store.model.BookStore;
import org.springframework.web.multipart.MultipartFile;

public interface BookStoreService {
    /**
     * <h1>Create book</h1>
     */
    void createBook(BookStore bookStore, String filePath);

    void updateBook(int bookId, BookStore bookStore);

    void updateImage(int bookId, MultipartFile bookImage);

    void deleteBookById(int id);

    String findImageById(int id);

    BookDetailsResponse getBook(int id);

    List<HomePageResponse> getBooksNameAndId();
}
