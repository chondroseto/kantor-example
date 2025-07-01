package com.data.kantor.services;

import java.util.List;

import com.data.kantor.domain.Cuti;

public interface CutiService {

    Cuti CreateCuti(Cuti cuti);
    Cuti UpdateCuti(Long id, Cuti cuti);
    Cuti DeleteCuti(Long id);
    Cuti GetCutiById(Long id);
    List<Cuti> GetAllCuti();
    
}
