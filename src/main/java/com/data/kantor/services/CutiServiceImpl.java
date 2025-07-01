package com.data.kantor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.kantor.repository.CutiRepository;
import com.data.kantor.domain.Cuti;

public class CutiServiceImpl implements CutiService {

    @Autowired
    private CutiRepository repo;

    @Override
    public Cuti CreateCuti(Cuti cuti) {
        // Logika untuk membuat cuti baru
        return repo.save(cuti); // Ganti dengan implementasi yang sesuai
    }   

    @Override
    public Cuti UpdateCuti(Long id, Cuti cuti) {
        // Logika untuk memperbarui cuti berdasarkan ID
        return repo.findById(id)
                .map(c -> {
                    c.setAlasan(cuti.getAlasan());
                    c.setTanggalMulaiCuti(cuti.getTanggalMulaiCuti());
                    c.setTanggalSelesaiCuti(cuti.getTanggalSelesaiCuti());
                    return repo.save(c);
                })
                .orElseThrow(() -> new RuntimeException("Cuti not found with id " + id));
    }

    @Override
    public Cuti DeleteCuti(Long id) {
        // Logika untuk menghapus cuti berdasarkan ID
        return repo.findById(id)
                .map(c -> {
                    repo.delete(c);
                    return c; // Mengembalikan cuti yang dihapus
                })
                .orElseThrow(() -> new RuntimeException("Cuti not found with id " + id));
    }

    @Override
    public Cuti GetCutiById(Long id) {
        // Logika untuk mendapatkan cuti berdasarkan ID
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Cuti not found with id " + id)); // Ganti dengan implementasi yang sesuai
    }

    @Override
    public List<Cuti> GetAllCuti() {
        // Logika untuk mendapatkan semua cuti
        return repo.findAll(); // Ganti dengan implementasi yang sesuai
    }


    
}
