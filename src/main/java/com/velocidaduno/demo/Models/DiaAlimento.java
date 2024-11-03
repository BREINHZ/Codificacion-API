/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.velocidaduno.demo.Models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author edufi
 */
@Entity
@Table(name = "dia_alimento")
@Data
public class DiaAlimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DiaAlimentoPK diaAlimentoPK;

    
    
}
