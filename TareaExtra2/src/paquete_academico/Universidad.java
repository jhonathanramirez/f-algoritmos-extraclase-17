/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

import paquete_general.Pais;

/**
 *
 * @author Usuario
 */
public class Universidad {

    private String nombre;
    private String siglas;
    private Pais pais;

    public String obtener_nombre() {
        return nombre;
    }
    public void agregar_nombre_u(String n) {
        nombre = n;
    }
    public String obtener_siglas() {
        return siglas;
    }
    public void agregar_siglas(String s) {
        siglas = s;
    }
    public Pais obtener_pais() {
        return pais;
    }
    public void agregar_pais(Pais n) {
        pais = n;
    }


        @Override
        public String toString() {

        String ccadena = String.format("%s"
                + "(%s)" + " - %s",
                obtener_nombre(), obtener_siglas(), obtener_pais().obtener_nombre());

        return ccadena;
    }
}
