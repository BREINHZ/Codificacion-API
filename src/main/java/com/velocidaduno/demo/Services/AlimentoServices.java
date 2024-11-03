/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.velocidaduno.demo.Services;

import com.velocidaduno.demo.Models.Alimento;
import com.velocidaduno.demo.Repositories.AlimentoRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author edufi
 */
@Service
public class AlimentoServices {
    
    @Autowired
    private AlimentoRepository repository;
            
    public List<Alimento> traerAlimento(){    
         List<Alimento> lista = repository.findAll();
         return lista;    

    }
    
    public Alimento saveAlimento(Alimento alimento){
        return repository.save(alimento);
    }
    
    public Alimento getAlimentoId(Long idAlimento){
        Alimento optionalAlimento = repository.findById(idAlimento);
        if (optionalAlimento != null) {
            return optionalAlimento;
        } else {
            // Manejo del caso donde no se encuentra el registro
            throw new EntityNotFoundException("Alimento no encontrado con el id " + idAlimento);
        }
    }
    
    public Alimento updateAlimento(Long idAlimento, Alimento update){
        Alimento optionalAlimento = repository.findById(idAlimento);

        if (optionalAlimento != null) {
            Alimento alimento = optionalAlimento;
            alimento.setNombre(update.getNombre());
            alimento.setCarbohidratos(update.getCarbohidratos());
            alimento.setFibra(update.getFibra());
            alimento.setGrasa(update.getGrasa());
            alimento.setKilocalorias(update.getKilocalorias());
            alimento.setProteina(update.getProteina());
            return repository.save(alimento);
        } else {
            // Manejo del caso donde no se encuentra el registro
            throw new EntityNotFoundException("Alimento no encontrado con el id " + idAlimento);
        }
    }
    
    public String deleteAlimento(Long id_Alimento){
        Alimento optionalAlimento = repository.findById(id_Alimento);
        if (optionalAlimento != null) {
            repository.deleteById(id_Alimento.intValue());
            return "Alimento eliminado";
        } else {
            // Manejo del caso donde no se encuentra el registro
            throw new EntityNotFoundException("Alimento no encontrado con el id " + id_Alimento);
        }
    }
}
