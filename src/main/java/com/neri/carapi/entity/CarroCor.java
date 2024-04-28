package com.neri.carapi.entity;

import jakarta.persistence.*;

import java.security.PrivateKey;
import java.util.UUID;

@Entity
@Table(name= "carro_cor")
public class CarroCor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;



    @ManyToOne
    @JoinColumn(name = "carro_idcarro")
    private Carro carro;
    @ManyToOne
    @JoinColumn(name = "cor_idcor")
    private Cor cor;

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
