/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Websevice;

import Datos.PaqueteRepositorios;
import Datos.PersonaRepositorio;
import Modelo.Dos_DiasPaquete;
import Modelo.Paquete;
import Modelo.PaqueteNoche;
import Modelo.PaqueteOrdinario;
import Modelo.Persona;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author JAIR Y Brances
 */
@WebService(serviceName = "CrearPaquete")
public class CrearPaquete {

    PaqueteRepositorios data = new PaqueteRepositorios();
    PersonaRepositorio gente = new PersonaRepositorio();

    /**
     * Web service operation
     *
     * @param codigo
     * @param remitente
     * @param destinatario
     * @param peso
     * @param costo
     * @param CuentaFija
     * @return
     */
    @WebMethod(operationName = "Dos_DiasPaquete")
    public boolean Dos_DiasPaquete(
            @WebParam(name = "codigo") String codigo,
            @WebParam(name = "remitente") Persona remitente,
            @WebParam(name = "destinatario") Persona destinatario,
            @WebParam(name = "peso") double peso,
            @WebParam(name = "costo") double costo,
            @WebParam(name = "CuentaFija") double CuentaFija) {
        Dos_DiasPaquete cta = new Dos_DiasPaquete(codigo, remitente, destinatario, CuentaFija, CuentaFija, CuentaFija);
        data.addPaquete(cta);
        return true;
    }

    /**
     * Web service operation
     *
     * @param codigo
     * @param remitente
     * @param destinatario
     * @param costo
     * @param peso
     * @return
     */
    @WebMethod(operationName = "Paquete")
    public boolean Paquete(@WebParam(name = "codigo") String codigo,
            @WebParam(name = "remitente") Persona remitente,
            @WebParam(name = "destinatario") Persona destinatario,
            @WebParam(name = "peso") double peso,
            @WebParam(name = "costo") double costo) {
        Paquete cta = new Paquete(codigo, remitente, destinatario, peso, costo);
        data.addPaquete(cta);
        return true;
    }

    /**
     * Web service operation
     *
     * @param codigo
     * @param remitente
     * @param destinatario
     * @param peso
     * @param costo
     * @param cargosadicionales
     * @return
     */
    @WebMethod(operationName = "PaqueteNoche")
    public boolean PaqueteNoche(@WebParam(name = "codigo") String codigo,
            @WebParam(name = "remitente") Persona remitente,
            @WebParam(name = "destinatario") Persona destinatario,
            @WebParam(name = "peso") double peso,
            @WebParam(name = "costo") double costo,
            @WebParam(name = "cargosadicionales") double cargosadicionales) {
        PaqueteNoche cta = new PaqueteNoche(codigo, remitente, destinatario, peso, costo, cargosadicionales);
        data.addPaquete(cta);

        return true;
    }

    /**
     * Web service operation
     *
     * @param codigo
     * @param remitente
     * @param destinatario
     * @param dias
     * @param shippingCost
     * @return
     */
    @WebMethod(operationName = "PaqueteOrdinario")
    public boolean PaqueteOrdinario(
            @WebParam(name = "codigo") String codigo,
            @WebParam(name = "remitente") Persona remitente,
            @WebParam(name = "destinatario") Persona destinatario,
            @WebParam(name = "dias") byte dias,
            @WebParam(name = "shippingCost") double shippingCost) {
        PaqueteOrdinario cta = new PaqueteOrdinario(codigo, remitente, destinatario, shippingCost, shippingCost, dias, shippingCost);
        data.addPaquete(cta);
        return true;
    }

    /**
     * Web service operation
     *
     * @param id
     * @param nombre
     * @param apellidos
     * @param ciudad
     * @param estado
     * @param caja
     * @return
     */
    @WebMethod(operationName = "Persona")
    public String Persona(@WebParam(name = "id") long id,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "apellidos") String apellidos,
            @WebParam(name = "ciudad") String ciudad,
            @WebParam(name = "estado") String estado,
            @WebParam(name = "caja") long caja) {
       Persona cta = new Persona(id, nombre, apellidos, ciudad, estado, caja);
        gente.addPersona(cta);
        return null;
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "ListaPaquete")
    public String ListaPaquete() {
        String result = "";

        for (Paquete i : data.getPaquete()) {
            result += i.toString();
        }
        return result;
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "ListaPersonas")
    public String ListaPersonas() {
        String result = "";

        for(Persona i : gente.getgente())
        {
            result += i.toString();
        }
        return result;
    }

}
