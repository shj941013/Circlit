package com.circlit.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Time;

public class Item implements Serializable {

    @Id
    private int id;

    @NotNull
    @Column
    private User user;

    private String content;

    private Time time;



}
