package com.example.BookMyBook.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookDetails {

    private String isbn;
    private String bookName;
    private Integer quantity;
    private String author;
}
