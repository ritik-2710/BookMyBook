package com.example.BookMyBook.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "LibraryDetails")
public class LibraryDetails {

    @Id
    private String userId;
    private String libCode;
    private String cityCode;
    private BookDetails book;

}
