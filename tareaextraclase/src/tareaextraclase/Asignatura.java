/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaextraclase;

/**
 *
 * @author Usuario
 */
public class Asignatura {
 private String nombre;
 private String creditos;
public void agregar_nombreAsig(String n){
          nombre = n;
}
public String obtener_nombreAsig(){
      return nombre;
  }
public void agregar_creditos(String n){
          creditos = n;
}
public String obtener_creditos(){
      return creditos;
}
}