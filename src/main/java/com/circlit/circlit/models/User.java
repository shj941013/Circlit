package com.circlit.circlit.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import javax.validation.constraints.*;

@Getter
@Setter
@ToString
public class User {
    @Id
    private int Id;

    private String name;

    private int age;

    private String email;

    private String username;

    private String password;

    private List<User> follwers;

    private List<User> follwing;

}
