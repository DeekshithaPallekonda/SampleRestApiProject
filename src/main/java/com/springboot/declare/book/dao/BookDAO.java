package com.springboot.declare.book.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.declare.book.entity.Book;

@Repository
public interface BookDAO extends CrudRepository<Book, Integer>{

}
