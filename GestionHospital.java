
/**
 * Clase ejecutable para instanciar y probar objetos
 * de las clases Hospital, Paciente y Localidad
 * 
 * @author Pannunzio M. Nicolas
 * @version 25/08/25
 */
import java.util.Scanner;
public class GestionHospital
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");//Permite ingresar cadenas separadas por espacio
        
        System.out.println("\nIngrese el nombre de la localidad donde nacio: ");
        String nombreLocalidad = teclado.nextLine();
        System.out.println("\nIngrese la provincia de la localidad donde nacio: ");
        String provinciaLocalidad = teclado.nextLine();
        
        Localidad localidadNacido = new Localidad(nombreLocalidad, provinciaLocalidad);
        
        System.out.println("\nIngrese el nombre de la localidad donde vive: ");
        nombreLocalidad = teclado.nextLine();
        System.out.println("\nIngrese la provincia de la localidad donde vive: ");
        provinciaLocalidad = teclado.nextLine();
        
        Localidad localidadVive = new Localidad(nombreLocalidad, provinciaLocalidad);
        
        
        System.out.println("\nIngrese su nombre completo: ");
        String nombre = teclado.nextLine();
        System.out.println("\nIngrese su domicilio: ");
        String domicilio = teclado.nextLine();
        System.out.println("\nIngrese su numero de Historia Clinica: ");
        int historiaClinica = teclado.nextInt();
        
        Paciente unPaciente = new Paciente(historiaClinica, nombre, domicilio, localidadNacido, localidadVive);
        System.out.println("\nPaciente: "+ unPaciente.cadenaDeDatos());
        
        teclado.nextLine();//Despues de leer el int me saltea la siguiente lectura, por eso agrego esta linea para que saltee esto y lea el hospital
        System.out.println("\nIngrese el nombre del hospital: ");
        String nombreHospital = teclado.nextLine();
        System.out.println("\nIngrese el nombre completo del director del hospital: ");
        String nombreDirector = teclado.nextLine();
        
        Hospital unHospital = new Hospital(nombreHospital, nombreDirector);
        unHospital.consultaDatosFiliatorios(unPaciente);
    }
}