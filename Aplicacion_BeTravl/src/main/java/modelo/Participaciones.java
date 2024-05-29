/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;
import modelo.Desafios;
import modelo.Usuarios;
import java.util.Date;

import javax.persistence.*;

/**
 *
 * @author julian
 */

@Entity
@Table(name="participaciones")

public class Participaciones implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idParticipacion;
    
    @ManyToOne
    @JoinColumn(name = "desafio_id", referencedColumnName = "idDesafio")
    private Desafios desafio;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "idUsuario")
    private Usuarios usuario;
    
    @Column(name="fecha_participacion")
    private Date fecha_participacion;
    
    @Column(name="completado")
    private int completado;

    public int getIdParticipacion() {
        return idParticipacion;
    }

    public void setIdParticipacion(int idParticipacion) {
        this.idParticipacion = idParticipacion;
    }

    public Desafios getDesafio() {
        return desafio;
    }

    public void setDesafio(Desafios desafio) {
        this.desafio = desafio;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Date getFecha_participacion() {
        return fecha_participacion;
    }

    public void setFecha_participacion(Date fecha_participacion) {
        this.fecha_participacion = fecha_participacion;
    }

    public int getCompletado() {
        return completado;
    }

    public void setCompletado(int completado) {
        this.completado = completado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.idParticipacion;
        hash = 41 * hash + Objects.hashCode(this.desafio);
        hash = 41 * hash + Objects.hashCode(this.usuario);
        hash = 41 * hash + Objects.hashCode(this.fecha_participacion);
        hash = 41 * hash + this.completado;
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
        final Participaciones other = (Participaciones) obj;
        if (this.idParticipacion != other.idParticipacion) {
            return false;
        }
        if (this.completado != other.completado) {
            return false;
        }
        if (!Objects.equals(this.desafio, other.desafio)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.fecha_participacion, other.fecha_participacion)) {
            return false;
        }
        return true;
    }
    
    
}
