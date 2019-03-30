package com.circlit.circlit.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int Id;

    @NotNull
    @Column(name="name")
    private String name;

    @NotNull
    @Column(name="age")
    private int age;

    @NotNull @Email
    @Column(name="email")
    private String email;

    @NotNull
    @Column(name="user_name")
    private String username;

    @NotNull
    @Column(name="password")
    private String password;

    private List<User> follwers;

    private List<User> follwing;

}
