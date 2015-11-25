/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JAIR Y brances
 */
public class PersonaRepositorio {
      private static List<Persona> gente = new ArrayList<Persona>();         
       
      public void addPersona(Persona p){
            gente.add(p);
        }
        public Iterable<Persona> getgente()
        {

            return gente;
        }

}
