package io.nacrobate.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@Document(collection = "book")
public class Book {
    @MongoId
    private String bookId;
    private String bookName;
    private String bookAuthor;
}
