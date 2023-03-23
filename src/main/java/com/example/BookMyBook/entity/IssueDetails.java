package com.example.BookMyBook.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "IssueDetails")
public class IssueDetails {

    @Id
    private String libCode;
    private String isbn;
    private String userId;
    private Date timeIssuedAt;
    private Date timeIssuedTill;
    private Boolean status;
}
