package com.circlit.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "profiles")
@Data
public class Profiles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_Id")
    private User user;

    @Column(name = "description")
    private String description;
//    TODO: add more later e.g: Description, maybe where he was born?

}


