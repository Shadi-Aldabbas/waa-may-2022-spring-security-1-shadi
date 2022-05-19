package com.spring.sec.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float price;



    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;



}
