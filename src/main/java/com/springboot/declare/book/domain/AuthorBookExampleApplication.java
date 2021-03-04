package com.springboot.declare.book.domain;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.declare.book.entity.Author;
import com.springboot.declare.book.entity.Book;
import com.springboot.declare.book.service.BookService;

@SpringBootApplication
public class AuthorBookExampleApplication implements CommandLineRunner{
	
	@Autowired
	BookService service;
	
	

	public static void main(String[] args) {
		SpringApplication.run(AuthorBookExampleApplication.class, args);
	}

	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.setBookName("BOOK A");
		
		Book book2 = new Book();
		book2.setBookName("Book B");
		
		Author author1= new Author();
		author1.setAuthorName("Author 1");
		
		Author author2 = new Author();
		author2.setAuthorName("Author 2");
		
		Author author3 = new Author();
		author3.setAuthorName("Author 3");
		ArrayList<Author> authors = new ArrayList<Author>();
		authors.add(author1);
		authors.add(author3);
				
		book1.setAuthors(authors);
		ArrayList<Author> authors2 =new ArrayList<Author>();
		authors2.add(author3);
		authors2.add(author2);
		
		book2.setAuthors(authors2);
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
	
		service.saveAll(books);
		
	}

}
