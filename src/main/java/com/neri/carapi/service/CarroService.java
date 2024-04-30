package com.neri.carapi.service;

import com.neri.carapi.dtos.CarroRecordDto;
import com.neri.carapi.entity.Carro;
import com.neri.carapi.repository.CarroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CarroService {
    private final CarroRepository carroRepository;
    private final MarcaService marcaService;

    public ResponseEntity<Carro> addCarro(CarroRecordDto carroRecordDto) throws Exception {
        var carro1 = new Carro();
        BeanUtils.copyProperties(carroRecordDto, carro1);
        carro1.setMarca(marcaService.findMarcaById(carroRecordDto.idmarca()).orElseThrow(Exception::new));
        return ResponseEntity.status(HttpStatus.CREATED).body(carroRepository.save(carro1));
    }
}
