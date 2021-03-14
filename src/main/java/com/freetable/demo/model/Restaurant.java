package com.freetable.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "restaurant")
public class Restaurant {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    private String name;
    @OneToMany(mappedBy = "restaurant")
    private List<Board> boardList;
}

