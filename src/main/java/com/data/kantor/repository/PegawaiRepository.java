package com.data.kantor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.kantor.domain.Pegawai;

public interface PegawaiRepository extends JpaRepository<Pegawai, Long> {
    // Tambahkan metode khusus jika diperlukan
    // Misalnya, mencari pegawai berdasarkan nama atau email
    
}
