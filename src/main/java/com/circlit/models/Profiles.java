package com.circlit.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Profiles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id")
    private long user_id;

//    TODO: add more later e.g: Description, maybe where he was born?

}


