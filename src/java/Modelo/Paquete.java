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
public class Paquete {
        private String codigo;
        private Persona remitente;
        private Persona destinatarios;
        double peso;
        double costo;

   
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public Persona getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(Persona destinatarios) {
        this.destinatarios = destinatarios;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
      
  public Paquete()
        {
            this.codigo = "XXXXX";
            this.remitente = new Persona();
            this.destinatarios = new Persona();
            this.peso = 0.0;
            this.costo = 0.0;
        }

        public Paquete(String codigo, Persona remitente, Persona destinatario, double peso, double costo)
        {
            this.codigo = codigo;
            this.remitente = remitente;
            this.destinatarios =destinatario;
            this.peso = peso;
            this.costo =costo;
        }

        
        public String ToString()
        {
            return "\n_______________________________________" +
                               "\nCode: " + this.codigo +
                               "\nSender: " + this.remitente.ToString() +
                               "\nRecipients: " + this.destinatarios.ToString() +
                               "\nCity: " + this.peso +
                               "\nState/Province: " + this.costo +
                               "\n_______________________________________";
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
        final Paquete other = (Paquete) obj;
        boolean result = false;
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)&&
           Double.doubleToLongBits(this.costo) != Double.doubleToLongBits(other.costo)&&
            !Objects.equals(this.codigo, other.codigo)&&
            !Objects.equals(this.remitente, other.remitente)&&
            !Objects.equals(this.destinatarios, other.destinatarios)){
            return result;
        }
        return true;
    }
     
        public double calculateCost()
        {
            return (this.peso * this.costo);
        }

}      

    