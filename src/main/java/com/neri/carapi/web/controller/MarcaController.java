package com.neri.carapi.web.controller;

import com.neri.carapi.service.MarcaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/marca")
public class MarcaController {
    private final MarcaService marcaService;
}
