package com.SpringBootApp.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import com.SpringBootApp.jpa.Author;
import java.util.List;


public interface BookRepository  extends JpaRepository<Book, Integer>{

	@Query("select b from Book b where b.author = :author")
	List<Book> findBookByAuthor(Author author);
}
