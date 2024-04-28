package com.neri.carapi.repository;

import com.neri.carapi.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, UUID> {

}