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

public class Titulo {
private String nombre;
private String nombre_universidad;
private String nombre_universidad2;
public void agregar_nombre(String n){
          nombre = n;
}
public String obtener_nombre(){
      return nombre;
  }
public void agregar_nombre_universidad(String n){
    nombre_universidad = n;}
public String obtener_nombre_universidad(){
    return nombre_universidad;
}    
public void agregar_nombre_universidad2(String c){
    nombre_universidad2 = c;}
public String obtener_nombre_universidad2(){
    return nombre_universidad2;
}    
}
