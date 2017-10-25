/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_estudiante;

import paquete_academico.Universidad;
import paquete_academico.Asignatura;
/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String nombres;
    private String apellidos;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;
    private Universidad universidad;
public String obtener_nombres(){
      return nombres;  }
public void agregar_nombre_E(String n){
    nombres = n;}
public String obtener_apellidos(){
    return apellidos;
}    
public void agregar_apellidos(String a){
    apellidos = a;}
public Asignatura obtener_asignatura_1(){
      return asignatura_1;  }
public void agregar_asignatura_1(Asignatura a){
    asignatura_1 = a;}
public Asignatura obtener_asignatura_2(){
    return asignatura_2;
}    
public void agregar_asignatura_2(Asignatura s){
    asignatura_2 = s;}
public Universidad obtener_universidad(){
      return universidad;  }
public void agregar_universidad(Universidad n){
    universidad = n;}

    @Override
    public String toString() {

        String cadena = String.format("Datos del Estudiante: \n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Universidad: %s(%s)-%s\n"
                + "Tienes las siguientes asignaturas: \n"
                + "\tAsignatura 1: %s\n"
                + "\tAsignatura 2: %s",
                obtener_nombres(), obtener_apellidos(),
                obtener_universidad().obtener_nombre(), obtener_universidad().obtener_siglas(),
                obtener_universidad().obtener_pais().obtener_nombre(), obtener_asignatura_1(),
                obtener_asignatura_2());

        return cadena;

}
}