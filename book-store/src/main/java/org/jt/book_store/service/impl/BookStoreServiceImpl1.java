package org.jt.book_store.service.impl;

import java.util.List;

import org.jt.book_store.dto.BookDetailsResponse;
import org.jt.book_store.dto.HomePageResponse;
import org.jt.book_store.model.BookStore;
import org.jt.book_store.service.BookStoreService;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookStoreServiceImpl1 implements BookStoreService {
    private final JdbcClient jdbcClient;

    @Override
    public void createBook(BookStore bookStore, String filePath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createBook'");
    }

    @Override
    public void updateBook(int bookId, BookStore bookStore) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBook'");
    }

    @Override
    public void updateImage(int bookId, MultipartFile bookImage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateImage'");
    }

    @Override
    public void deleteBookById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBookById'");
    }

    @Override
    public String findImageById(int id) {
        String sql = "SELECT image FROM book_store WHERE book_id = :id";
        RowMapper<String> rowMapper = (resultSet, rn) -> resultSet.getString("image");
        return jdbcClient.sql(sql)
                .param("id", id)
                .query(rowMapper).optional().orElseThrow();
    }

    @Override
    public BookDetailsResponse getBook(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBook'");
    }

    @Override
    public List<HomePageResponse> getBooksNameAndId() {
        log.info("Jdbc client called");
        String sql = "SELECT book_id, book_name FROM book_store";
        return jdbcClient.sql(sql).query(HomePageResponse.class).list();
    }

}
