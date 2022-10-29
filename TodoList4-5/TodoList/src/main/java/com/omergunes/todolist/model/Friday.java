package com.omergunes.todolist.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Friday {

    public Friday() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column
    private String description;

    @Column
    private boolean control;

    @NotNull
    @Column
    private String time;

}


