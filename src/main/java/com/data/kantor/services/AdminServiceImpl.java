package com.data.kantor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.kantor.domain.Admin;
import com.data.kantor.repository.AdminRepository;

public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository repo;

    // Implementasi metode dari PegawaiService
    @Override
    public Admin CreateAdmin(Admin admin) {
        // Logika untuk membuat pegawai baru
        return repo.save(admin); // Ganti dengan implementasi yang sesuai
    }

    @Override
    public Admin UpdateAdmin(Long id, Admin admin) {
        // Logika untuk memperbarui pegawai berdasarkan ID
        Admin a = repo.findById(id).orElseThrow();
        a.setNamaDepan(admin.getNamaDepan());
        a.setNamaBelakang(admin.getNamaBelakang());
        a.setEmail(admin.getEmail());
        a.setTanggalLahir(admin.getTanggalLahir());
        a.setJenisKelamin(admin.getJenisKelamin());
        a.setPassword(admin.getPassword());
        return repo.save(a); // Ganti dengan implementasi yang sesuai
    }

    @Override
    public Admin DeleteAdmin(Long id) {
        // Logika untuk menghapus pegawai berdasarkan ID
        repo.deleteById(id); // Menghapus pegawai berdasarkan ID
        return null; // Tidak ada nilai yang dikembalikan
    }

    @Override
    public Admin GetAdminById(Long id) {
        // Logika untuk mendapatkan pegawai berdasarkan ID
        return repo.findById(id).orElseThrow(); // Ganti dengan implementasi yang sesuai
    }

    @Override
    public List<Admin> GetAllAdmin() {
        // Logika untuk mendapatkan semua pegawai
        return repo.findAll(); // Ganti dengan implementasi yang sesuai
    }
    
}
