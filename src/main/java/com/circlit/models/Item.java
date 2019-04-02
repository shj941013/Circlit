package com.circlit.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Time;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private long id;

    @NotNull
//    @Column(name="user_of_the_item")
    private User user;
    @NotNull
//    @Column(name = "content")
    private String content;
    @NotNull
//    @Column(name = "time")
    private Time time;



}
