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
@Table(name="paises")

public class Paises implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPais;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="capital")
    private String capital;
    
    @Column(name="idioma")
    private String idioma;
    
    @Column(name="moneda")
    private String moneda;
    
    @Column(name="puntuacion")
    private int puntuacion;

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.idPais;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.capital);
        hash = 23 * hash + Objects.hashCode(this.idioma);
        hash = 23 * hash + Objects.hashCode(this.moneda);
        hash = 23 * hash + this.puntuacion;
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
        final Paises other = (Paises) obj;
        if (this.idPais != other.idPais) {
            return false;
        }
        if (this.puntuacion != other.puntuacion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.capital, other.capital)) {
            return false;
        }
        if (!Objects.equals(this.idioma, other.idioma)) {
            return false;
        }
        if (!Objects.equals(this.moneda, other.moneda)) {
            return false;
        }
        return true;
    }

    
    
}
