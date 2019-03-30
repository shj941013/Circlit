package com.circlit.circlit.models;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.sql.Time;

public class Item implements Serializable{

    @Id
    private int id;

    private User user;


    private String content;

    private Time time;



}
