package com.data.kantor.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pegawai")
public class Pegawai {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;    

    @Column(name = "nama_depan", nullable = false)
    private String namaDepan;

    @Column(name = "nama_belakang", nullable = false)
    private String namaBelakang;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "hp", nullable = false)
    private String hp;    

    @Column(name = "alamat", nullable = false)
    private String alamat;

    @Column(name = "jenis_kelamin", nullable = false)
    private String jenisKelamin;
    
    public Long getId() {
        return id;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }   

    public String getNamaBelakang() {
        return namaBelakang;
    }   

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    
}
