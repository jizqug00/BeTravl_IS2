/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;
import modelo.Paises;

import javax.persistence.*;


/**
 *
 * @author julian
 */

@Entity
@Table(name="desafios")

public class Desafios implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idDesafio;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "pais_id", referencedColumnName = "idPais")
    private Paises pais;

    public int getIdDesafio() {
        return idDesafio;
    }

    public void setIdDesafio(int idDesafio) {
        this.idDesafio = idDesafio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.idDesafio;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.descripcion);
        hash = 83 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Desafios other = (Desafios) obj;
        if (this.idDesafio != other.idDesafio) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }
    
    
}
