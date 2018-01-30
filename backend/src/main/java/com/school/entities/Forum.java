package com.school.entities;

import javax.persistence.*;

@Entity
@Table(name = "Forum")
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
