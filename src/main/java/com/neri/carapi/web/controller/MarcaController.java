package com.neri.carapi.web.controller;

import com.neri.carapi.dtos.MarcaRecordDto;
import com.neri.carapi.entity.Marca;
import com.neri.carapi.repository.MarcaRepository;
import com.neri.carapi.service.MarcaService;
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
@RequestMapping("/marcas")
public class MarcaController {
    private final MarcaService marcaService;
    private final MarcaRepository marcaRepository;

    @PostMapping()
    public ResponseEntity<Marca> saveMarca(@RequestBody @Valid MarcaRecordDto marcaRecordDto){
        var marca1 = new Marca();
        BeanUtils.copyProperties(marcaRecordDto, marca1);
        return ResponseEntity.status(HttpStatus.CREATED).body(marcaRepository.save(marca1));
    }

    @GetMapping
    public ResponseEntity<List<Marca>> getAllMarca() {
        return ResponseEntity.status(HttpStatus.OK).body(marcaRepository.findAll());
    }
        @GetMapping("/{id}")
    public ResponseEntity<Object> getOneMarca(@PathVariable(value="id") int id){
        var marca = marcaService.findMarcaById(id);
            if(marca.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Marca not found.");
            }
        return ResponseEntity.status(HttpStatus.OK).body(marca);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateMarca(@PathVariable(value="id") int id, @RequestBody @Valid MarcaRecordDto marcaRecordDto){

        Optional<Marca> marcaO = marcaRepository.findById(id);
        if(marcaO.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Marca not found.");
        }
        var marca1 = marcaO.get();
        BeanUtils.copyProperties(marcaRecordDto, marca1);
        return ResponseEntity.status(HttpStatus.OK).body(marcaRepository.save(marca1));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteMarca(@PathVariable(value = "id") int id){
        Optional<Marca> marca1 = marcaRepository.findById(id);
        if(marca1.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Marca not found.");
        }
        marcaRepository.delete(marca1.get());
        return ResponseEntity.status(HttpStatus.OK).body("Marca deleted successfully");
    }

}
