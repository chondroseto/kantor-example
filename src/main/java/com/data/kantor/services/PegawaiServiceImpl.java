package com.data.kantor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.kantor.repository.PegawaiRepository;
import com.data.kantor.domain.Pegawai;

public class PegawaiServiceImpl implements PegawaiService {

    @Autowired
    private PegawaiRepository repo;

    // Implementasi metode dari PegawaiService
    // Misalnya, CreatePegawai, UpdatePegawai, DeletePegawai, GetPegawaiById, GetAllPegawai

    @Override
    public Pegawai CreatePegawai(Pegawai pegawai) {
        // Logika untuk membuat pegawai
        return repo.save(pegawai); // Ganti dengan implementasi yang sesuai
    }

    @Override
    public Pegawai UpdatePegawai(Long id, Pegawai pegawai) {
        // Logika untuk memperbarui pegawai berdasarkan ID
        return repo.findById(id)
                .map(p -> {
                    p.setNamaDepan(pegawai.getNamaDepan());
                    p.setNamaBelakang(pegawai.getNamaBelakang());
                    p.setEmail(pegawai.getEmail());
                    p.setHp(pegawai.getHp());
                    p.setAlamat(pegawai.getAlamat());
                    p.setJenisKelamin(pegawai.getJenisKelamin());
                    return repo.save(p);
                })
                .orElseThrow(() -> new RuntimeException("Pegawai not found with id " + id));
    }

    @Override
    public Pegawai DeletePegawai(Long id) {
        // Logika untuk menghapus pegawai berdasarkan ID
        return repo.findById(id)
                .map(p -> {
                    repo.delete(p);
                    return p; // Mengembalikan pegawai yang dihapus
                })
                .orElseThrow(() -> new RuntimeException("Pegawai not found with id " + id));
    }

    @Override
    public Pegawai GetPegawaiById(Long id) {
        // Logika untuk mendapatkan pegawai berdasarkan ID
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Pegawai not found with id " + id)); // Ganti dengan implementasi yang sesuai
    }

    @Override
    public List<Pegawai> GetAllPegawai() {
        // Logika untuk mendapatkan semua pegawai
        return repo.findAll(); // Ganti dengan implementasi yang sesuai
    }
    
}
