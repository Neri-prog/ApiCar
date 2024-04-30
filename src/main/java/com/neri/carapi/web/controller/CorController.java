package com.neri.carapi.web.controller;

import com.neri.carapi.dtos.CorRecordDto;
import com.neri.carapi.dtos.MarcaRecordDto;
import com.neri.carapi.entity.Cor;
import com.neri.carapi.entity.Marca;
import com.neri.carapi.repository.CorRepository;
import com.neri.carapi.repository.MarcaRepository;
import com.neri.carapi.service.CorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cor")
public class CorController {
    private final CorService corService;
    private final CorRepository corRepository;

    @PostMapping()
    public ResponseEntity<Cor> saveCor(@RequestBody @Valid CorRecordDto corRecordDto){
        var cor1 = new Cor();
        BeanUtils.copyProperties(corRecordDto, cor1);
        return ResponseEntity.status(HttpStatus.CREATED).body(corRepository.save(cor1));
    }

    @GetMapping
    public ResponseEntity<List<Cor>> getAllCores(){
        return ResponseEntity.status(HttpStatus.OK).body(corRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneCor(@PathVariable(value="id") int id){
        Optional<Cor> corO = corRepository.findById(id);
        if(corO.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cor not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(corO.get());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCor(@PathVariable(value="id") int id, @RequestBody @Valid CorRecordDto corRecordDto){

        Optional<Cor> corO = corRepository.findById(id);
        if(corO.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cor not found.");
        }
        var cor1 = corO.get();
        BeanUtils.copyProperties(corRecordDto, cor1);
        return ResponseEntity.status(HttpStatus.OK).body(corRepository.save(cor1));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCor(@PathVariable(value = "id") int id){
        Optional<Cor> cor1 = corRepository.findById(id);
        if(cor1.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cor not found.");
        }
        corRepository.delete(cor1.get());
        return ResponseEntity.status(HttpStatus.OK).body("Cor deleted successfully");
    }

}
