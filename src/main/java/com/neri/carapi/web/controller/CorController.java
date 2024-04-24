package com.neri.carapi.web.controller;

import com.neri.carapi.service.CorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/cor")
public class CorController {
    private final CorService corService;
}
