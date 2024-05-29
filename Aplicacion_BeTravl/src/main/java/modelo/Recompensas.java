/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;
import modelo.Desafios;

import javax.persistence.*;

/**
 *
 * @author julian
 */

@Entity
@Table(name="recompensas")

public class Recompensas implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idRecompensa;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "desafio_id", referencedColumnName = "idDesafio")
    private Desafios desafio;

    public int getIdRecompensa() {
        return idRecompensa;
    }

    public void setIdRecompensa(int idRecompensa) {
        this.idRecompensa = idRecompensa;
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

    public Desafios getDesafio() {
        return desafio;
    }

    public void setDesafio(Desafios desafio) {
        this.desafio = desafio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.idRecompensa;
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + Objects.hashCode(this.descripcion);
        hash = 13 * hash + Objects.hashCode(this.desafio);
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
        final Recompensas other = (Recompensas) obj;
        if (this.idRecompensa != other.idRecompensa) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.desafio, other.desafio)) {
            return false;
        }
        return true;
    }
    
    
}
