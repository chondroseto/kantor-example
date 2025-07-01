package com.data.kantor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.data.kantor.services.CutiService;
import com.data.kantor.domain.Cuti;


@RestController
@RequestMapping("/api/cuti")
public class CutiController {

    @Autowired
    private CutiService cutiService;

    @PostMapping
    public ResponseEntity<Cuti> createCuti(@RequestBody Cuti cuti) {
        Cuti createdCuti = cutiService.CreateCuti(cuti);
        return new ResponseEntity<>(createdCuti, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cuti> updateCuti(@PathVariable Long id, @RequestBody Cuti cuti) {
        Cuti updatedCuti = cutiService.UpdateCuti(id, cuti);
        return new ResponseEntity<>(updatedCuti, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCuti(@PathVariable Long id) {
        cutiService.DeleteCuti(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cuti> getCutiById(@PathVariable Long id) {
        Cuti cuti = cutiService.GetCutiById(id);
        return new ResponseEntity<>(cuti, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Cuti>> getAllCuti() {
        List<Cuti> cutiList = cutiService.GetAllCuti();
        return new ResponseEntity<>(cutiList, HttpStatus.OK);
    }
    
}
