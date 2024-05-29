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
@Table(name="usuarios", uniqueConstraints = {@UniqueConstraint(columnNames = {"correo"})})

public class Usuarios implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idUsuario;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="correo")
    private String correo;
    
    @Column(name="contraseña")
    private String contraseña;
    
    @Column(name="otros_datos")
    private String otros_datos;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuarios) {
        this.idUsuario = idUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getOtros_datos() {
        return otros_datos;
    }

    public void setOtros_datos(String otros_datos) {
        this.otros_datos = otros_datos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.idUsuario;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.correo);
        hash = 17 * hash + Objects.hashCode(this.contraseña);
        hash = 17 * hash + Objects.hashCode(this.otros_datos);
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
        final Usuarios other = (Usuarios) obj;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        if (!Objects.equals(this.otros_datos, other.otros_datos)) {
            return false;
        }
        return true;
    }
}
