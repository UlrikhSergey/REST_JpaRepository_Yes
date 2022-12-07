package com.ulrikhsergey.data_jpa.dao;





import com.ulrikhsergey.data_jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository <Book,Integer>{

}
