package com.SpringBootApp.jpa;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "authors1")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Author {

    @Id
    @Column(name = "author_id")
    private Integer id;

    @Column(name = "author_name")
    private String name;

    @OneToMany
    @JoinColumn(name = "books_fk") 
    private List<Book> books;
}
