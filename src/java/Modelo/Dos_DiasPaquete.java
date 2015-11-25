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
public class Dos_DiasPaquete extends Paquete{
     private double CuotaFija;

    public double getCuotaFija() {
        return CuotaFija;
    }

    public void setCuotaFija(double CuotaFija) {
        this.CuotaFija = CuotaFija;
    }

    public Dos_DiasPaquete(){
        super();
        this.CuotaFija=0.0;
    }
     
    public Dos_DiasPaquete(String codigo,Persona remitente,Persona destinatarios, double peso,double costo, double cuotafija){
     
     super(codigo,remitente,destinatarios,peso,costo);
     this.CuotaFija=cuotafija;
    }
    @Override
       public String ToString()
        {
            return super.ToString() +
                               "\nFixed Fee: " + this.CuotaFija +
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
        final Dos_DiasPaquete other = (Dos_DiasPaquete) obj;
        boolean result = false;
        if (Double.doubleToLongBits(this.CuotaFija) != Double.doubleToLongBits(other.CuotaFija)) {
            return result;
        }
        return true;
    }
      
     @Override
        public double calculateCost()
        {
            return (super.calculateCost() + this.CuotaFija);
        }

}