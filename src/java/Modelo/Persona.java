/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author JAIR Y brances
 */
public class Persona {
        private long id;
        private String nombre;
        private String apellidos;
        private String ciudad;
        private String estado;
        private long caja;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getCaja() {
        return caja;
    }

    public void setCaja(long caja) {
        this.caja = caja;
    }

    
        
        public Persona()
        {
            this.id = 12345;
            this.nombre = "nombre y Apellidos";
            this.apellidos = "Mi dirección";
            this.ciudad = "Mi Ciudad";
            this.estado = "Bolivar";
            this.caja = 13001;
        
        }
         public Persona(long id, String nombre, String apellidos, String ciudad, String estado, long caja)
        {
            this.id = id;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.ciudad = ciudad;
            this.estado = estado;
            this.caja = caja;

        }
          public String ToString(){
            return "\nIdentificación: " + this.id +
                    "\nNombres: " + this.nombre +
                    "\nApellidos: " + this.apellidos +
                    "\nCiudad: " + this.ciudad +
                    "\nEstado/Provincia: " + this.estado +
                    "\nCodigo postal: " + this.caja;
        }
          @Override
           public int hashCode(){
            return this.ToString().hashCode();
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
        final Persona other = (Persona) obj; 
            boolean result = false;
        if ((this.id != other.id)&& 
           (this.caja != other.caja)&&
        !Objects.equals(this.nombre, other.nombre)&&
        !Objects.equals(this.apellidos, other.apellidos)&&
        !Objects.equals(this.ciudad, other.ciudad)&&
        !Objects.equals(this.estado, other.estado)) {
            return true;
        }
        return result;
    }
 
}


