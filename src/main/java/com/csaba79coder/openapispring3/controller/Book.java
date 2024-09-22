package com.csaba79coder.openapispring3.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Long id;
    private String title;
    private String author;
    private String publishedDate;
}
