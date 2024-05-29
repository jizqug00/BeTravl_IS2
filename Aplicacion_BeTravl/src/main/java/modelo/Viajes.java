/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;
import modelo.Usuarios;
import modelo.Paises;
import modelo.Patrocinadores;
import java.util.Date;

import javax.persistence.*;

/**
 *
 * @author julian
 */

@Entity
@Table(name="viajes")

public class Viajes implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idViaje;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="fecha_ida")
    private Date fecha_ida;
    
    @Column(name="fecha_vuelta")
    private Date fecha_vuelta;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="puntuacion")
    private int puntuacion;
    
    @ManyToOne
    @JoinColumn(name = "pais_id", referencedColumnName = "idPais")
    private Paises pais;
    
    @ManyToOne
    @JoinColumn(name = "patrocinador_id", referencedColumnName = "idPatrocinador")
    private Patrocinadores patrocinador;

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_ida() {
        return fecha_ida;
    }

    public void setFecha_ida(Date fecha_ida) {
        this.fecha_ida = fecha_ida;
    }

    public Date getFecha_vuelta() {
        return fecha_vuelta;
    }

    public void setFecha_vuelta(Date fecha_vuelta) {
        this.fecha_vuelta = fecha_vuelta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }

    public Patrocinadores getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinadores patrocinador) {
        this.patrocinador = patrocinador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.idViaje;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.fecha_ida);
        hash = 23 * hash + Objects.hashCode(this.fecha_vuelta);
        hash = 23 * hash + Objects.hashCode(this.descripcion);
        hash = 23 * hash + this.puntuacion;
        hash = 23 * hash + Objects.hashCode(this.pais);
        hash = 23 * hash + Objects.hashCode(this.patrocinador);
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
        final Viajes other = (Viajes) obj;
        if (this.idViaje != other.idViaje) {
            return false;
        }
        if (this.puntuacion != other.puntuacion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.fecha_ida, other.fecha_ida)) {
            return false;
        }
        if (!Objects.equals(this.fecha_vuelta, other.fecha_vuelta)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.patrocinador, other.patrocinador)) {
            return false;
        }
        return true;
    }

    
    
    
}
