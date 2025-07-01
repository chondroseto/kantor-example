package com.data.kantor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.kantor.domain.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    // Tambahkan metode khusus jika diperlukan
    
}
