/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;
import modelo.Usuarios;
import modelo.Viajes;

import javax.persistence.*;
/**
 *
 * @author julian
 */

@Entity
@Table(name="contrataciones")

public class Contrataciones implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idContratacion;
    
    @ManyToOne
    @JoinColumn(name = "viajes_id", referencedColumnName = "idViaje")
    private Viajes viaje;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "idUsuario")
    private Usuarios usuario;

    public int getIdContratacion() {
        return idContratacion;
    }

    public void setIdContratacion(int idContratacion) {
        this.idContratacion = idContratacion;
    }

    public Viajes getViaje() {
        return viaje;
    }

    public void setViaje(Viajes viaje) {
        this.viaje = viaje;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idContratacion;
        hash = 71 * hash + Objects.hashCode(this.viaje);
        hash = 71 * hash + Objects.hashCode(this.usuario);
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
        final Contrataciones other = (Contrataciones) obj;
        if (this.idContratacion != other.idContratacion) {
            return false;
        }
        if (!Objects.equals(this.viaje, other.viaje)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }
    
    
}
