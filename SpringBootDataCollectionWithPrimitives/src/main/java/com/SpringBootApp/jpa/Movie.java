package com.SpringBootApp.jpa;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Movie {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @ElementCollection
    @CollectionTable(
            name = "movie_languages",
            joinColumns = @JoinColumn(name = "movie_id")
    )
    @OrderColumn(name = "pos")
    @Column(name = "language")
    private List<String> languages;
    
    
    @ElementCollection
    @CollectionTable(name = "movies_set", joinColumns = @JoinColumn(name = "movie_ids"))
    @Column(name = "ratings")
    private Set<Double> ratings;
}
