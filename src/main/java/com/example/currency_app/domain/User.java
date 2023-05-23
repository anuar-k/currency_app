package com.example.currency_app.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Boolean is_bot;
    String first_name;
    String last_name;
    String username;
    String language_code;
    String is_premium;
    String added_to_attachment_menu;
    String can_join_groups;
    String can_read_all_group_messages;
    String supports_inline_queries;

    @ManyToOne
    @JoinColumn(name = "chat_id", nullable = false)
    Chat chat;
}
