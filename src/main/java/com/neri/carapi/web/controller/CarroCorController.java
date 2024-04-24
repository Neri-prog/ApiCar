package com.neri.carapi.web.controller;

import com.neri.carapi.service.CarroCorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/carrocor")
public class CarroCorController {
    private final CarroCorService carroCorService;
}
