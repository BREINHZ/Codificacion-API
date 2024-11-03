/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.velocidaduno.demo.Models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author edufi
 */
@Embeddable
@Data
public class DiaAlimentoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_dia")
    private int idDia;
    @Basic(optional = false)
    @Column(name = "alimento_id")
    private int alimentoId;

   
    
}