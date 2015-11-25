/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JAIR Y brances
 */
public class PaqueteNoche extends Paquete{
   
        private double CargosAdicionales;

    public double getCargosAdicionales() {
        return CargosAdicionales;
    }

    public void setCargosAdicionales(double CargosAdicionales) {
        this.CargosAdicionales = CargosAdicionales;
    }

   
    public PaqueteNoche(){
        super();
        this.CargosAdicionales=0.0;
    } 
     public PaqueteNoche(String codigo,Persona remitente,Persona destinatarios, double peso,double costo, double cargosadicionales){
         super(codigo,remitente,destinatarios,peso,costo);   
         this.CargosAdicionales = cargosadicionales;
        }
      @Override
        public String ToString()
        {
            return super.ToString() +
                               "\nAdditional Charge: " + this.CargosAdicionales +
                               "\n_______________________________________";
        }
        
        @Override
        public int hashCode()
        {
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
        final PaqueteNoche other = (PaqueteNoche) obj;
        boolean result = false;
        if (Double.doubleToLongBits(this.CargosAdicionales) != Double.doubleToLongBits(other.CargosAdicionales)) {
            return result;
        }
        return true;
    }
      
        @Override
        public double calculateCost()
        {
            return (super.getPeso() * (super.getCosto() + this.CargosAdicionales));
        }

       
    }

