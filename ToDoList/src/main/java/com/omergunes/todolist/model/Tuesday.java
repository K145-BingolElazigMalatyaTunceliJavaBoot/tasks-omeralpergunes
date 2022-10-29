package com.omergunes.todolist.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TUESDAY")
public class Tuesday {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String description;

    @Column
    private boolean control;

    @Column(name = "TIME_SAAT")
    private String time;
}
