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
@Table(name = "usuario")
@Data
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "fecha_creacion")
    private String fechaCreacion;
    @Column(name = "imagen")
    private String imagen;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "sexo")
    private String sexo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "IMC")
    private BigDecimal imc;
    @Basic(optional = false)
    @Column(name = "altura")
    private BigDecimal altura;
    @Basic(optional = false)
    @Column(name = "peso_actual")
    private BigDecimal pesoActual;
    @Column(name = "peso_deseado")
    private BigDecimal pesoDeseado;
    @Column(name = "peso_ideal")
    private BigDecimal pesoIdeal;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;
    @Column(name = "plan_id")
    private Integer planId;

   
}
