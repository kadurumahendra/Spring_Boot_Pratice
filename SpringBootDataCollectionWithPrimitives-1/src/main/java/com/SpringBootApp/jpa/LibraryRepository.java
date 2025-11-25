package com.SpringBootApp.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LibraryRepository extends JpaRepository<Library, Integer> {

    // Find libraries by exact category
    List<Library> findByCategory(String category);

    // Correct JPQL for authors (ElementCollection)
    @Query("SELECT l FROM Library l WHERE :author MEMBER OF l.authors")
    List<Library> findByAuthor(@Param("author") String author);

    // If you want LIKE for authors:
    @Query("SELECT l FROM Library l JOIN l.authors a WHERE a LIKE :pattern")
    List<Library> findByAuthorLike(@Param("pattern") String pattern);
}
