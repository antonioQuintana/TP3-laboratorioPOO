import java.util.*;
import java.util.GregorianCalendar;
/**
 * Clase ejecutable, en la que se instancia y prueban todos los metodos
 * de la clase Empleado.
 * @author Pannunzio M. Nicolas - Quintana Antonio
 * @version 24/08/25
 */
public class Empresa
{
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(20333444, "Perez", "Juan", 50000, 2015);
        
        Calendar fechaEmp2 = new GregorianCalendar(2010, 5, 15);
        Empleado emp2 = new Empleado(20333445, "Gomez", "Ana", 60000, fechaEmp2);
        
        Calendar fechaEmp3 = new GregorianCalendar(2023, 8, 1);
        Empleado emp3 = new Empleado(20333446, "Lopez", "Luis", 70000, fechaEmp3);
        
        emp1.mostrar();
        emp2.mostrar();
        emp3.mostrar();
        
        System.out.println(emp1.mostrarLinea());
        System.out.println(emp2.mostrarLinea());
        System.out.println(emp3.mostrarLinea());
        
        if(emp1.esAniversario()){
            System.out.println(emp1.nomYape() + " está de aniversario, puede salir una hora antes.");
        } 
        if(emp2.esAniversario()){
            System.out.println(emp2.nomYape() + " está de aniversario, puede salir una hora antes.");
        } 
        if(emp3.esAniversario()){
            System.out.println(emp3.nomYape() + " está de aniversario, puede salir una hora antes.");
        } 
    }
}