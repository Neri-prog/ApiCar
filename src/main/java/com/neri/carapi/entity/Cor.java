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

    public int getIdcor() {
        return idcor;
    }

    public void setIdcor(int idcor) {
        this.idcor = idcor;
    }

    public String getNomecor() {
        return nomecor;
    }

    public void setNomecor(String nomecor) {
        this.nomecor = nomecor;
    }
}
