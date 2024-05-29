/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;
/**
 *
 * @author julian
 */

@Entity
@Table(name="patrocinadores")

public class Patrocinadores implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPatrocinador;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="descripcion")
    private String descripcion;

    public int getIdPatrocinador() {
        return idPatrocinador;
    }

    public void setIdPatrocinador(int idPatrocinadores) {
        this.idPatrocinador = idPatrocinadores;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idPatrocinador;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.descripcion);
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
        final Patrocinadores other = (Patrocinadores) obj;
        if (this.idPatrocinador != other.idPatrocinador) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return true;
    }
    
    
}
