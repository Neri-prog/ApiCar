package com.neri.carapi.web.controller;

import com.neri.carapi.dtos.CarroRecordDto;
import com.neri.carapi.dtos.CorRecordDto;
import com.neri.carapi.entity.Carro;
import com.neri.carapi.entity.Cor;
import com.neri.carapi.repository.CarroRepository;
import com.neri.carapi.repository.CorRepository;
import com.neri.carapi.service.CarroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/carro")
public class CarroController {
    private final CarroService carroService;
    private final CarroRepository carroRepository;

    @PostMapping()
    public ResponseEntity<Carro> saveCarro (@RequestBody @Valid CarroRecordDto carroRecordDto) throws Exception {
        return carroService.addCarro(carroRecordDto);
    }

    @GetMapping("")
    public ResponseEntity<List<Carro>> getAllCarros(){
        return ResponseEntity.status(HttpStatus.OK).body(carroRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneCarro(@PathVariable(value="id") int id){
        Optional<Carro> carroO = carroRepository.findById(id);
        if(carroO.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Carro not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(carroO.get());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCarro(@PathVariable(value="id") int id, @RequestBody @Valid CarroRecordDto carroRecordDto){

        Optional<Carro> carroO = carroRepository.findById(id);
        if(carroO.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Carro not found.");
        }
        var carro1 = carroO.get();
        BeanUtils.copyProperties(carroRecordDto, carro1);
        return ResponseEntity.status(HttpStatus.OK).body(carroRepository.save(carro1));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCarro(@PathVariable(value = "id") int id){
        Optional<Carro> carro1 = carroRepository.findById(id);
        if(carro1.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Carro not found.");
        }
        carroRepository.delete(carro1.get());
        return ResponseEntity.status(HttpStatus.OK).body("Carro deleted successfully");
    }
}
