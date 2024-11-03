/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.velocidaduno.demo.Controllers;

import com.velocidaduno.demo.Models.Alimento;
import com.velocidaduno.demo.Services.AlimentoServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author edufi
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/alimento")
public class AlimentoController {
    
    @Autowired
    private AlimentoServices service;
    
    // obtener todos los alimentos
    @GetMapping("/getAll")
    public List<Alimento>getAllAlimentos(){
        return service.traerAlimento();
    }

    // Obtener un alimento por ID
    @GetMapping("/{id}")
    public Alimento getProductById(@PathVariable Long id) {
        return service.getAlimentoId(id);
    }
    
    //Crear o guardar un alimento
    @PostMapping("/save")
    public Alimento createAlimento(@RequestBody Alimento alimento){
        return service.saveAlimento(alimento);
    }

    // Actualizar un alimento
    @PutMapping("/{id}")
    public Alimento updateProduct(@PathVariable Long id, @RequestBody Alimento productDetails) {
        return service.updateAlimento(id, productDetails);
    }

    // Eliminar un alimento
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        return service.deleteAlimento(id);
    }
}
