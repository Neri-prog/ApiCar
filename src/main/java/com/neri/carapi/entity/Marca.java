package com.neri.carapi.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "marca")
public class Marca implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column (name = "idmarca")
    private UUID idmarca;

    @Column(name = "nomemarca")
    private String nomemarca;

    public UUID getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(UUID idmarca) {
        this.idmarca = idmarca;
    }

    public String getNomemarca() {
        return nomemarca;
    }

    public void setNomemarca(String nomemarca) {
        this.nomemarca = nomemarca;
    }
}




