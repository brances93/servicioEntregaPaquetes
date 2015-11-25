/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Paquete;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author JAIR Y brances
 */
public class PaqueteRepositorios {

    private static List<Paquete> data = new ArrayList<Paquete>();

    public Iterable<Paquete> getPaquete() {
        return data;
    }

    public void addPaquete(Paquete p) {
        data.add(p);
    }
}
