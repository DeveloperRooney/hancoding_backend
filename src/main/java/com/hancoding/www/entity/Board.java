package com.hancoding.www.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_idx")
    private Integer idx;

    @Column(name = "board_name")
    private String name;

}
