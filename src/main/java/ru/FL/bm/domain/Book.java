package ru.FL.bm.domain;

import javax.persistence.*;

@Entity
@Table (name = "books")
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue()
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    private String genre;

    public int getId() {
        return id;
    }

    public void setId(int iD) {
        this.id = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
