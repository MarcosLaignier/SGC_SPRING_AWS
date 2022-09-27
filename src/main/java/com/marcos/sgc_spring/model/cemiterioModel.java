package com.marcos.sgc_spring.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sgcunidades")
public class cemiterioModel {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    int undcodigo;
    String undnome;
    String undendereco;
    int undnumero;
    String undcidade;
    String undestado;
    String undresponsavel;
}
