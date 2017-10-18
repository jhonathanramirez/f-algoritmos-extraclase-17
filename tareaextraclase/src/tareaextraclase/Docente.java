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
public class Docente {
    private String nombres, apellidos, titulo_tercer_nivel, titulo_cuarto_nivel, asignatura_1, asignatura2;
public void agregar_nombreDoce(String n){
          nombres = n;
}
public String obtener_nombreDoce(){
      return nombres;
  }
public void agregar_apellidoDoce(String n){
          apellidos = n;
}
public String obtener_apellidoDoce(){
      return apellidos;
}
public String obtener_titulo_tercer_nivel(){
      return titulo_tercer_nivel;
}
public void agregar_titulo_tercer_nivel(String n){
          titulo_tercer_nivel = n;
}
public String obtener_titulo_cuarto_nivel(){
      return titulo_cuarto_nivel;    
}
public void agregar_titulo_cuarto_nivel(String n){
          titulo_cuarto_nivel = n;
}
public String obtener_asignatura_1(){
      return asignatura_1;
  }
public void agregar_asignatura_1(String n){
          asignatura_1 = n;
}
public String obtener_asignatura2(){
      return asignatura2;
}
public void agregar_asignatura2(String n){
          asignatura2 = n;
}
}