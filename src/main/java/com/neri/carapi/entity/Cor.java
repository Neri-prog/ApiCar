package com.neri.carapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cor")
public class Cor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "idcor")
    private int idcor;

    @Column(name= "nomecor")
    private String nomecor;
}
