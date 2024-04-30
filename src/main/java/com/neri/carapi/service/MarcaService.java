package com.neri.carapi.service;

import com.neri.carapi.entity.Marca;
import com.neri.carapi.repository.MarcaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MarcaService {
    private final MarcaRepository marcaRepository;

    public Optional<Marca> findMarcaById(int id) {
        Optional<Marca> marcaO = marcaRepository.findById(id);
        return marcaO;
    }
}
