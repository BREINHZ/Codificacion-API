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
@Table(name = "dieta_menu")
@Data
public class DietaMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DietaMenuPK dietaMenuPK;

    
    
}
