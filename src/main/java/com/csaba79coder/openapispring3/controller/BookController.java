package com.csaba79coder.openapispring3.controller;

import io.swagger.model.BookModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController implements io.swagger.api.BooksApi {

    @Override
    public ResponseEntity<BookModel> getBookById(Integer id) {
        return null;
    }
}
