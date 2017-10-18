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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Docente d = new Docente();
        d.agregar_nombreDoce("Luis V");
        d.agregar_apellidoDoce("Perez J");
        d.agregar_asignatura_1("Matemáticas con número de créditos 8");
        d.agregar_asignatura2("Física con número de créditos 6");
        d.agregar_titulo_tercer_nivel("Licenciado en Físico Matemáticas");
        d.agregar_titulo_cuarto_nivel("Magister en Docencia Matemática");
        Docente d2 = new Docente();
        d2.agregar_nombreDoce("Ana M");
        d2.agregar_apellidoDoce("Velez P");
        d2.agregar_asignatura_1("Sociales con número de créditos 9");
        d2.agregar_asignatura2("Literatura con número de créditos 10");
        d2.agregar_titulo_tercer_nivel("Licenciado en Ciencias Sociales");
        d2.agregar_titulo_cuarto_nivel("Magister en Docencia Social");
        Titulo t = new Titulo();
        t.agregar_nombre_universidad("Universidad Politécnica");
        t.agregar_nombre_universidad2("Universidad Valenciana");
        Titulo t2 = new Titulo();
        t2.agregar_nombre_universidad("Universidad Salesiana");
        t2.agregar_nombre_universidad2("Universidad Cataluña");
        Asignatura a = new Asignatura();
        a.agregar_nombreAsig("Matemáticas");
        a.agregar_nombreAsig("Física");
        a.agregar_creditos("con un numero de creditos 8");
        a.agregar_creditos("con un numero de creditos 6");
        Asignatura a2 = new Asignatura();
        a2.agregar_nombreAsig("Sociales");
        a2.agregar_nombreAsig("Literatura");
        a2.agregar_creditos("con un numero de creditos 9");
        a2.agregar_creditos("con un numero de creditos 10");

        System.out.println("Caso 1:\nDatos del docente:\nNombre:"+d.obtener_nombreDoce()+"\nApellidos:"+
        d.obtener_apellidoDoce()+"\nTiene a su cargo las asignaturas:\n"+"  Asignatura1:"+d.obtener_asignatura_1()+"\n  Asignatura2:"
        +d.obtener_asignatura2()+"\nEl docente tiene los siguientes títulos académicos"+"\n  Título 3er nivel:"+d.obtener_titulo_tercer_nivel()
        +" - "+t.obtener_nombre_universidad()+"\n  Título 4er nivel:"+d.obtener_titulo_cuarto_nivel()+" - "+t.obtener_nombre_universidad2()
        +"\nCaso 2:\nDatos del docente:\nNombre:"+d2.obtener_nombreDoce()+"\nApellidos:"+d2.obtener_apellidoDoce()+"\nTiene a su cargo las asignaturas:\n"+"  Asignatura1:"+d2.obtener_asignatura_1()+"\n  Asignatura2:"
        +d2.obtener_asignatura2()+"\nEl docente tiene los siguientes títulos académicos"+"\n  Título 3er nivel:"+d2.obtener_titulo_tercer_nivel()
        +" - "+t2.obtener_nombre_universidad()+"\n  Título 4er nivel:"+d2.obtener_titulo_cuarto_nivel()+" - "+t2.obtener_nombre_universidad2());
    
        
             

    }
    
}
