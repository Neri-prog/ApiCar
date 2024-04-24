package com.neri.carapi.service;

import com.neri.carapi.repository.CorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CorService {
    private final CorRepository corRepository;
}
