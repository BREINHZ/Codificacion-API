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
import lombok.Data;

/**
 *
 * @author edufi
 */
@Entity
@Table(name = "ejercicios")
@Data
public class Ejercicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ejercicio")
    private Integer idEjercicio;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "dificultad")
    private String dificultad;
    @Column(name = "id_youtube")
    private String idYoutube;
    @Column(name = "estiramiento")
    private Boolean estiramiento;
    @Column(name = "imagen")
    private String imagen;

   
    
}
