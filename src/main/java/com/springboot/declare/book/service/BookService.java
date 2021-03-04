package com.springboot.declare.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.declare.book.dao.BookDAO;
import com.springboot.declare.book.entity.Book;


@Service
public class BookService {
	
	@Autowired
	 BookDAO bookDao;

	public BookService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Iterable<Book> saveAll(Iterable<Book> books){
		return bookDao.saveAll(books);
	}
}
