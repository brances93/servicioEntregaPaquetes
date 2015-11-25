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
public class PaqueteOrdinario extends Paquete{
     private byte dias = 3;
    private double shippingCost; // Costo de Envio

    
    public byte getDays() {
        return dias;
    }

    public void setDays(byte dias) {
        this.dias = dias;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

        
        public PaqueteOrdinario(){
            super();
            this.dias = 3;
            this.shippingCost = 0.0;
            
        }

        public PaqueteOrdinario(String codigo, Persona remitente, Persona destinatario, double peso, double costo, byte dias, double shippingCost){
            super(codigo,remitente,destinatario,peso,costo);
            this.dias = dias;
            this.shippingCost = shippingCost;

        }
      
     @Override
        public double calculateCost()
        {
            // Asegurando que es positivo el peso y el valor por gramos
            if (this.costo < 0 && this.peso < 0)
            {
                this.costo= this.costo * -1;
                this.peso = this.peso * -1;
            }
           double costo = (this.peso) * (this.costo);
            this.shippingCost = costo;

            return this.shippingCost;
        }
      
     @Override
        public String ToString()
        {
            return super.ToString() +
                   "Total Costo: " + this.calculateCost() + "\n";
        }

        public boolean Equals(Object obj)
        {
            PaqueteOrdinario p = (PaqueteOrdinario)obj;
            boolean result = false;

            if (super.equals(0))
                result = true;

            return result;
        }

        public int hashCode()
        {
            return this.ToString().hashCode();
        }



}
