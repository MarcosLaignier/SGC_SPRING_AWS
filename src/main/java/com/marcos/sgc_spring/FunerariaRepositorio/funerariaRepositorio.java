package com.marcos.sgc_spring.FunerariaRepositorio;


import com.marcos.sgc_spring.FunerariaModel.funerariaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface funerariaRepositorio extends JpaRepository<funerariaModel, Integer> {

}
