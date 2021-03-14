package com.freetable.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;
    @OneToOne
    @JoinColumn(name = "board_id")
    private Board board;
}
