package com.SpringBootApp.jpa;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "library")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ids")
    private Integer id;

    @Column(name = "titles")
    private String title;

    @Column(name = "categories")
    private String category;

    @ElementCollection
    @CollectionTable(name = "library_authors", joinColumns = @JoinColumn(name = "library_position"))
    @OrderColumn(name = "author_pos")
    @Column(name = "author")
    private List<String> authors;

    @ElementCollection
    @CollectionTable(name = "library_tags", joinColumns = @JoinColumn(name = "library_set_position"))
    @Column(name = "tag")
    private Set<String> tags;

    // Getters and setters if not using Lombok
}
