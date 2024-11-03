/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.velocidaduno.demo.Repositories;

import com.velocidaduno.demo.Models.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author edufi
 */
@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Integer>{
   
    public Alimento findById(Long id_alimento);
    
}
