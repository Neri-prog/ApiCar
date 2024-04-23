package com.neri.carapi.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "carro")
public class Carro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "idcarro")
    private int idcarro;

    @Column(name= "nomecarro")
    private String nomecarro;

    @Column(name = "anofabricacaocarro")
    private int anofabricacaocarro;

    @Column(name = "anomodelocarro")
    private int anomodelocarro;

    @Column(name = "modelocarro")
    private String modelocarro;

    @ManyToOne
    @JoinColumn(name = "idmarca")
    private Marca marca;
}
