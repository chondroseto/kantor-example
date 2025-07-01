package com.data.kantor.services;

import java.util.List;

import com.data.kantor.domain.Admin;

public interface AdminService {
    Admin CreateAdmin(Admin pegawai);
    Admin UpdateAdmin(Long id, Admin pegawai);
    Admin DeleteAdmin(Long id);
    Admin GetAdminById(Long id);
    List<Admin> GetAllAdmin();
}
