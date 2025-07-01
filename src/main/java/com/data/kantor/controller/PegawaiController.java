package com.data.kantor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.data.kantor.services.PegawaiService;
import com.data.kantor.domain.Pegawai;

import java.util.List;

@RestController
@RequestMapping("/api/pegawai")
public class PegawaiController {

    @Autowired
    private PegawaiService pegawaiService;

    @PostMapping
    public ResponseEntity<Pegawai> createPegawai(@RequestBody Pegawai pegawai) {
        Pegawai createdPegawai = pegawaiService.CreatePegawai(pegawai);
        return new ResponseEntity<>(createdPegawai, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pegawai> updatePegawai(@PathVariable Long id, @RequestBody Pegawai pegawai) {
        Pegawai updatedPegawai = pegawaiService.UpdatePegawai(id, pegawai);
        return new ResponseEntity<>(updatedPegawai, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePegawai(@PathVariable Long id) {
        pegawaiService.DeletePegawai(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pegawai> getPegawaiById(@PathVariable Long id) {
        Pegawai pegawai = pegawaiService.GetPegawaiById(id);
        return new ResponseEntity<>(pegawai, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Pegawai>> getAllPegawai() {
        List<Pegawai> pegawaiList = pegawaiService.GetAllPegawai();
        return new ResponseEntity<>(pegawaiList, HttpStatus.OK);
    }

    
}
