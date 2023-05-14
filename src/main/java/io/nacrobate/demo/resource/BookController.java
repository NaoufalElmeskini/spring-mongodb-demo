package io.nacrobate.demo.resource;

import io.nacrobate.demo.model.Book;
import io.nacrobate.demo.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @GetMapping("/hello")
    public String hello(){
        return "hello!";
    }

    @GetMapping("/create")
    public String create(){
        Book book = new Book();
        book.setBookName("book_name");
        book.setBookAuthor("auth_name");
        this.bookRepository.save(book);
        return "done";
    }



    @GetMapping("books")
    public List<Book> findAllBooks(){
        return this.bookRepository.findAll();
    }
}
