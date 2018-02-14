package com.school.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Null
    private String password;

    @Null
    private String email;

    @Null
    private String salt;

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @Column(name = "middle_name")
    private String middleName;

    @Null
    private byte[] image;

    @Null
    private long birthday;

    @ManyToOne(cascade = CascadeType.ALL)
    private Grade grade;

    @Null
    @Enumerated(EnumType.STRING)
    @Column(name = "user_type")
    private UserType type;
}
