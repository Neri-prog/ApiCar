package com.neri.carapi.web.controller;

import com.neri.carapi.service.CarroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/carro")
public class CarroController {
    private final CarroService carroService;
}
