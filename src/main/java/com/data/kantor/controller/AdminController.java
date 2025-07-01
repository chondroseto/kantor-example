package com.data.kantor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.data.kantor.domain.Admin;
import com.data.kantor.services.AdminService;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping
    public ResponseEntity<Admin> createAdmin(@RequestBody Admin pegawai) {
        Admin createdAdmin = adminService.CreateAdmin(pegawai);
        return new ResponseEntity<>(createdAdmin, HttpStatus.CREATED);
    }   

    @PutMapping("/{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable Long id, @RequestBody Admin pegawai) {
        Admin updatedAdmin = adminService.UpdateAdmin(id, pegawai);
        return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
    }   

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable Long id) {
        adminService.DeleteAdmin(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }   

    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable Long id) {
        Admin getAdmin = adminService.GetAdminById(id);
        return new ResponseEntity<>(getAdmin, HttpStatus.OK);
    }   

    @GetMapping
    public ResponseEntity<List<Admin>> getAllAdmin() {
        List<Admin> adminList = adminService.GetAllAdmin();
        return new ResponseEntity<>(adminList, HttpStatus.OK);
    }   


}
