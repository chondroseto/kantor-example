package com.data.kantor.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuti")
public class Cuti {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name = "alasan", nullable = false)
    private Long alasan;

    @Column(name = "tanggal_mulai_cuti", nullable = false)
    private String tanggalMulaiCuti;

    @Column(name = "tanggal_selesai_cuti", nullable = false)
    private String tanggalSelesaiCuti;

    public Long getId() {
        return id;
    }

    public Long getAlasan() {
        return alasan;
    }

    public void setAlasan(Long alasan) {
        this.alasan = alasan;
    }   

    public String getTanggalMulaiCuti() {
        return tanggalMulaiCuti;
    }   

    public void setTanggalMulaiCuti(String tanggalMulaiCuti) {
        this.tanggalMulaiCuti = tanggalMulaiCuti;
    }

    public String getTanggalSelesaiCuti() {
        return tanggalSelesaiCuti;
    }
       
    public void setTanggalSelesaiCuti(String tanggalSelesaiCuti) {
        this.tanggalSelesaiCuti = tanggalSelesaiCuti;
    }

    
}
