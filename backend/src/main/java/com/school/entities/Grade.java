package com.school.entities;

import javax.persistence.*;

@Entity
@Table(name = "Grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    @OneToOne(cascade = CascadeType.ALL)
    private User teacher;
}
