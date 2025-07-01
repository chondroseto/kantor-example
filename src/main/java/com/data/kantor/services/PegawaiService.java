package com.data.kantor.services;

import java.util.List;

import com.data.kantor.domain.Pegawai;

public interface PegawaiService {
    Pegawai CreatePegawai(Pegawai pegawai);
    Pegawai UpdatePegawai(Long id, Pegawai pegawai);
    Pegawai DeletePegawai(Long id);
    Pegawai GetPegawaiById(Long id);
    List<Pegawai> GetAllPegawai();

}
