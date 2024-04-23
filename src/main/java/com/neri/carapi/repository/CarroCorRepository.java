package com.neri.carapi.repository;

import com.neri.carapi.entity.Carro;
import com.neri.carapi.entity.CarroCor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroCorRepository extends JpaRepository<CarroCor, Carro> {
}