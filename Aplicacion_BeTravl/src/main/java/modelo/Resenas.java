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
@Table(name="resenas")

public class Resenas implements Serializable{
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idResena;
    
    @Column(name="titulo")
    private String titulo;
    
    @Column(name="contenido")
    private String contenido;
    
    @Column(name="puntuacion")
    private int puntuacion;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "idUsuario")
    private Usuarios usuario;
    
    @ManyToOne
    @JoinColumn(name = "viaje_id", referencedColumnName = "idViaje")
    private Viajes viaje;

    public int getIdResena() {
        return idResena;
    }

    public void setIdResena(int idResena) {
        this.idResena = idResena;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Viajes getViaje() {
        return viaje;
    }

    public void setViaje(Viajes viaje) {
        this.viaje = viaje;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.idResena;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        hash = 89 * hash + Objects.hashCode(this.contenido);
        hash = 89 * hash + this.puntuacion;
        hash = 89 * hash + Objects.hashCode(this.usuario);
        hash = 89 * hash + Objects.hashCode(this.viaje);
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
        final Resenas other = (Resenas) obj;
        if (this.idResena != other.idResena) {
            return false;
        }
        if (this.puntuacion != other.puntuacion) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.contenido, other.contenido)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.viaje, other.viaje)) {
            return false;
        }
        return true;
    }

    
}
