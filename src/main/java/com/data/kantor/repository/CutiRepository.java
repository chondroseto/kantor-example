package com.data.kantor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.kantor.domain.Cuti;

public interface CutiRepository extends JpaRepository<Cuti, Long> {
    // Tambahkan metode khusus jika diperlukan
    // Misalnya, mencari cuti berdasarkan pegawai atau tanggal
    
}
