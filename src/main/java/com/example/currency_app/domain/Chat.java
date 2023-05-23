package com.example.currency_app.domain;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table( name = "chat")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToMany(mappedBy = "chat")
    List<User> users;
}
