package com.neri.carapi.service;

import com.neri.carapi.repository.CarroCorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CarroCorService {
    private final CarroCorRepository carroCorRepository;
}
