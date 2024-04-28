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

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "idmarca")
    private Marca marca;

    public int getIdcarro() {
        return idcarro;
    }

    public void setIdcarro(int idcarro) {
        this.idcarro = idcarro;
    }

    public String getNomecarro() {
        return nomecarro;
    }

    public void setNomecarro(String nomecarro) {
        this.nomecarro = nomecarro;
    }

    public int getAnofabricacaocarro() {
        return anofabricacaocarro;
    }

    public void setAnofabricacaocarro(int anofabricacaocarro) {
        this.anofabricacaocarro = anofabricacaocarro;
    }

    public int getAnomodelocarro() {
        return anomodelocarro;
    }

    public void setAnomodelocarro(int anomodelocarro) {
        this.anomodelocarro = anomodelocarro;
    }

    public String getModelocarro() {
        return modelocarro;
    }

    public void setModelocarro(String modelocarro) {
        this.modelocarro = modelocarro;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
