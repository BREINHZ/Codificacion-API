/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.velocidaduno.demo.Models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author edufi
 */
@Entity
@Table(name = "plan")
@Data
public class Plan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_plan")
    private Integer idPlan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "kilocalorias")
    private BigDecimal kilocalorias;
    @Basic(optional = false)
    @Column(name = "fibra")
    private BigDecimal fibra;
    @Basic(optional = false)
    @Column(name = "grasa")
    private BigDecimal grasa;
    @Basic(optional = false)
    @Column(name = "carbohidrato")
    private BigDecimal carbohidrato;
    @Basic(optional = false)
    @Column(name = "proteina")
    private BigDecimal proteina;

  
    
}
