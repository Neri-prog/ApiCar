package com.neri.carapi.entity;

import jakarta.persistence.*;

import java.security.PrivateKey;

@Entity
@Table(name= "carro_cor")
public class CarroCor {
    @Id
    @ManyToOne
    @JoinColumn(name = "carro_idcarro")
    private Carro carro;

    @Id
    @ManyToOne
    @JoinColumn(name = "cor_idcor")
    private Cor cor;

}
