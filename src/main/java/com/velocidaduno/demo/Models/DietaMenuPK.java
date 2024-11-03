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
@Data
@Embeddable
public class DietaMenuPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_dieta")
    private int idDieta;
    @Basic(optional = false)
    @Column(name = "id_menu")
    private int idMenu;

  
    
}
