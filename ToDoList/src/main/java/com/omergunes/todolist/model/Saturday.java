package com.omergunes.todolist.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "SATURDAY")
public class Saturday {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String description;

    @Column
    private boolean control;

    @Column
    private String time;

}
