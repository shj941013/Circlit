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
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long Id;

    @NotNull
    @Column(name="user_name")
    private String username;

    @NotNull
    @Column(name="password")
    private String password;

    @NotNull
    @Column(name="first_name")
    private String firstName;

    @NotNull
    @Column(name="last_name")
    private String lastName;

    @NotNull
    @Column(name="age")
    private int age;

    @NotNull @Email
    @Column(name="email")
    private String email;
}
