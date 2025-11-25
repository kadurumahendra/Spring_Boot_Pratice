package com.SpringBootApp.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query("SELECT b FROM Book b WHERE b.price > :price AND b.genre = :genre")
    List<Book> findByPriceAndGenre(Double price, String genre);

    @Query("SELECT b FROM Book b WHERE b.author IS NULL OR b.genre NOT LIKE :pattern")
    List<Book> findByAuthorIsNullOrGenreNotLike(String pattern);

    @Query("SELECT b FROM Book b WHERE b.title LIKE :title")
    List<Book> findByTitle(String title);

    @Query("SELECT b FROM Book b WHERE b.publishedDate BETWEEN :start AND :end")
    List<Book> findByPublishedDateBetween(Date start, Date end);

    @Query("SELECT b FROM Book b WHERE b.price < :price OR b.genre = :genre")
    List<Book> findByPriceLessThanOrGenre(Double price, String genre);

    @Query("SELECT b FROM Book b WHERE b.author LIKE :author")
    List<Book> findByAuthor(String author);

    @Query("SELECT b FROM Book b WHERE b.title LIKE CONCAT('%', :suffix)")
    List<Book> findByTitleEndingWith(String suffix);

    @Query("SELECT b FROM Book b WHERE b.publishedDate < :date")
    List<Book> findByPublishedDateBefore(Date date);

    @Query("SELECT b FROM Book b WHERE b.genre IN :genres")
    List<Book> findByGenreIn(List<String> genres);
}
