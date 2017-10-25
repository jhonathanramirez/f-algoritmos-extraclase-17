/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;
import paquete_academico.Asignatura;
import paquete_academico.Carrera;
import paquete_academico.Docente;
import paquete_academico.Universidad;
import paquete_general.Pais;
import paquete_estudiante.Estudiante;
/**
 *
 * @author Usuario
 */
public class Principal {
        public static void main(String[] args) {
        // clases pais
        Pais p = new Pais();
        p.agregar_nombre_pais("Ecuador");
        
        Universidad u = new Universidad();
        u.agregar_nombre_u("Universidad Técnica Particular de Loja");
        u.agregar_siglas("UTPL");
        u.agregar_pais(p);
        
        Carrera c = new Carrera();
        c.agregar_nombre_C("Sistemas");
        c.agregar_modalidad("presencial");
        
        Pais pais1 = new Pais();
        pais1.agregar_nombre_pais("Colombia");

        Docente d = new Docente();
        d.agregar_nombres("Mario");
        d.agregar_apellidos("Alcivar");
        d.agregar_pais(pais1);
        
        Pais pais2 = new Pais();
        pais2.agregar_nombre_pais("Perú");

        Docente d1 = new Docente();
        d1.agregar_nombres("Maria");
        d1.agregar_apellidos("Ruiz");
        d1.agregar_pais(pais2);
        
        Universidad u1 = new Universidad();
        u1.agregar_nombre_u("Universidad Técnica Equinoccial");
        u1.agregar_siglas("UTE");
        u1.agregar_pais(p);
        
        Carrera c1 = new Carrera();
        c1.agregar_nombre_C("Ingeniería Química");
        c1.agregar_modalidad("distancia");
        
        Asignatura a1 = new Asignatura();
        a1.agregar_nombre("Matemáticas");
        a1.agregar_creditos(10);
        a1.agregar_carrera(c);
        a1.agregar_docente(d);
        
        Pais pais3 = new Pais();
        pais3.agregar_nombre_pais("Venezuela");

        Docente d2 = new Docente();
        d2.agregar_nombres("Luis");
        d2.agregar_apellidos("Armigos");
        d2.agregar_pais(pais3); 

        Asignatura a2 = new Asignatura();
        a2.agregar_nombre("Física");
        a2.agregar_creditos(8);
        a2.agregar_carrera(c);
        a2.agregar_docente(d1);

        Asignatura a3 = new Asignatura();
        a3.agregar_nombre("Biología");
        a3.agregar_creditos(9);
        a3.agregar_carrera(c1);
        a3.agregar_docente(d2);

        Asignatura a4 = new Asignatura();
        a4.agregar_nombre("Física");
        a4.agregar_creditos(7);
        a4.agregar_carrera(c1);
        a4.agregar_docente(d1);

        Estudiante es = new Estudiante();
        es.agregar_nombre_E("Luis V");
        es.agregar_apellidos("Perez J");
        es.agregar_asignatura_1(a1);
        es.agregar_asignatura_2(a2);
        es.agregar_universidad(u);

        Estudiante es1 = new Estudiante();
        es1.agregar_nombre_E("Ana");
        es1.agregar_apellidos("Lima J");
        es1.agregar_asignatura_1(a3);
        es1.agregar_asignatura_2(a4);
        es1.agregar_universidad(u1);

        System.out.println("Caso 1: \n");
        System.out.println(es);

        System.out.println("\nCaso 2: \n");
        System.out.println(es1);

    }

}