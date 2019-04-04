package com.circlit.models;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

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
