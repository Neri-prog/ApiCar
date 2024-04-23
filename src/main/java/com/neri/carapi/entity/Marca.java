package com.neri.carapi.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "marca")
public class Marca implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idmarca")
    private int idmarca;

    @Column(name = "nomemarca")
    private String nomemarca;
    }


