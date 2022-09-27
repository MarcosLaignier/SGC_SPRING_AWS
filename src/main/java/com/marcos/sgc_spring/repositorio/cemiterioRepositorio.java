package com.marcos.sgc_spring.repositorio;

import com.marcos.sgc_spring.model.cemiterioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface cemiterioRepositorio extends JpaRepository<cemiterioModel,Integer> {

    @Query("SELECT MAX (u.undcodigo) FROM cemiterioModel u ")
    int findcod();

    @Query("SELECT (cem.undnome) from cemiterioModel cem")
    List<String> findnameCemiterio();
}
