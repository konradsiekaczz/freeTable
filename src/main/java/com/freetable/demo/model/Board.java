package com.freetable.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "board")
public class Board {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private long numberOfSeats;
    private boolean isReserved;
    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @OneToOne(mappedBy = "board")
    @JoinColumn(name = "reservation_id")

    private Reservation reservation;
}

