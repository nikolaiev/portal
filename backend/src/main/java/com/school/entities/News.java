package com.school.entities;

import javax.persistence.*;

@Entity
@Table(name = "News")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
