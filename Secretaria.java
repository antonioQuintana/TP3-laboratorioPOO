import java.util.Scanner;
/**
 * Ejecutable para la clase Escuela y Docente.
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio 
 * @version 24/08/25
 */

public class Secretaria
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n"); // permite ingresar cadenas separadas por espacio
        
        System.out.println("\nIngrese el nombre de la escuela: ");
        String nombreEscuela = teclado.nextLine();
        System.out.println("\nIngrese el domicilio de la escuela: ");
        String domicilioEscuela = teclado.nextLine();
        System.out.println("\nIngrese el nombre del director de la escuela: ");
        String directorEscuela = teclado.nextLine();
        
        Escuela unaEscuela = new Escuela(nombreEscuela, domicilioEscuela, directorEscuela);
        
        System.out.println("\nIngrese el nombre del docente: ");
        String nombreDocente = teclado.nextLine();
        System.out.println("\nIngrese el grado del docente: ");
        String gradoDocente = teclado.nextLine();
        System.out.println("\nIngrese el sueldo basico del docente: ");
        double sueldoDocente = teclado.nextDouble();
        System.out.println("\nIngrese la asignacion familiar del docente: ");
        double asignacionDocente = teclado.nextDouble();
        
        Docente unDocente = new Docente(nombreDocente, gradoDocente, sueldoDocente, asignacionDocente);
        
       
        unaEscuela.imprimirRecibo(unDocente);
    }
}