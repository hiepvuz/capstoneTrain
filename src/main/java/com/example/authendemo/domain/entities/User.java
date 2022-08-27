package com.example.authendemo.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_tbl")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private Long id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "token")
    private String token;

    @Column(name="full_name")
    private String fullName;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

}
