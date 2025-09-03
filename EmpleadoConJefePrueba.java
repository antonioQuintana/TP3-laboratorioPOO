import java.util.GregorianCalendar;
import java.util.*;
import java.util.Scanner;
/**
 * Clase ejecutable para instanciar objetos de tipo EmpleadoConJefe 
 * y probar sus métodos de manera exhaustiva.
 *
 * @author Pannunzio M. Nicolas - Quintana Antonio 
 * @version 01/09/25
 */

public class EmpleadoConJefePrueba{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        System.out.println("Ingrese cuil del jefe:");
        long a_cuil = teclado.nextLong();
        System.out.println("Ingrese apellido del jefe:");
        String a_ape = teclado.next();
        System.out.println("Ingrese nombre del jefe:");
        String a_nom = teclado.next();
        System.out.println("Ingrese sueldo del jefe:");
        double a_sueldo = teclado.nextDouble();
        System.out.println("Ingrese año de ingreso del jefe:");
        int a_anio = teclado.nextInt();
        EmpleadoConJefe jefe = new EmpleadoConJefe(a_cuil, a_ape, a_nom, a_sueldo, a_anio);


        System.out.println("Ingrese cuil del empleado 1:");
        a_cuil = teclado.nextLong();
        System.out.println("Ingrese apellido del empleado 1:");
        a_ape = teclado.next();
        System.out.println("Ingrese nombre del empleado 1:");
        a_nom = teclado.next();
        System.out.println("Ingrese sueldo del empleado 1:");
        a_sueldo = teclado.nextDouble();
        System.out.println("Ingrese año de ingreso del empleado 1:");
        int anio = teclado.nextInt();
        System.out.println("Ingrese mes de ingreso del empleado 1:");
        int mes = teclado.nextInt();
        System.out.println("Ingrese día de ingreso del empleado 1:");
        int dia = teclado.nextInt();
        
        Calendar a_ingreso = new GregorianCalendar(anio, mes-1, dia);
        EmpleadoConJefe emp1 = new EmpleadoConJefe(a_cuil, a_ape, a_nom, a_sueldo, a_ingreso, jefe);
        


        System.out.println("Ingrese cuil del Jefe 2:");
        a_cuil = teclado.nextLong();
        System.out.println("Ingrese apellido del Jefe 2:");
        a_ape = teclado.next();
        System.out.println("Ingrese nombre del Jefe 2:");
        a_nom = teclado.next();
        System.out.println("Ingrese sueldo del Jefe 2:");
        a_sueldo = teclado.nextDouble();
        System.out.println("Ingrese año de ingreso del Jefe 2:");
        anio = teclado.nextInt();
        System.out.println("Ingrese mes de ingreso del Jefe 2:");
        mes = teclado.nextInt();
        System.out.println("Ingrese día de ingreso del Jefe 2:");
        dia = teclado.nextInt();
        
        a_ingreso = new GregorianCalendar(anio, mes-1, dia);
        EmpleadoConJefe jefe2 = new EmpleadoConJefe(a_cuil, a_ape, a_nom, a_sueldo, a_ingreso);

        jefe.mostrarPantalla();
        emp1.mostrarPantalla();
        jefe2.mostrarPantalla();

        System.out.println(jefe.mostrarLinea());
        System.out.println(emp1.mostrarLinea());
        System.out.println(jefe2.mostrarLinea());
        
        if(jefe.esAniversario()){
            System.out.println(jefe.nomYape() + " está de aniversario, puede salir una hora antes. Autorizado por: "+ jefe.getJefe().apeYnom());
        } 
        if(emp1.esAniversario()){
            System.out.println(emp1.nomYape() + " está de aniversario, puede salir una hora antes. Autorizado por: "+ emp1.getJefe().apeYnom());
        } 
        if(jefe2.esAniversario()){
            System.out.println(jefe2.nomYape() + " está de aniversario, puede salir una hora antes. Autorizado por: "+ jefe2.getJefe().apeYnom());
        }
    }
}