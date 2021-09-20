package com.bitlo.UserWalletApplication.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity//spring boot entity class olduğunu konteynırına katar. Databasedeki tablolarımızın yansıması.
@Table(name = "USER_TABLE")
public class UserEntity {//Gelen obje userdto, userdto objesindeki alanları database kaydetmek için userentity içerisindeki alanlara userdto datalarını koyarız.

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//otomatik ıd atama işlemi
    @Column(name = "Id")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name= "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @OneToMany(cascade = CascadeType.ALL,mappedBy ="user")
    @JsonIgnore//
    private Set<WalletEntity> wallets = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
