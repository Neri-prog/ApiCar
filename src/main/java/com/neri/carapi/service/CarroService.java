package com.neri.carapi.service;

import com.neri.carapi.repository.CarroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CarroService {
    private final CarroRepository carroRepository;
}
