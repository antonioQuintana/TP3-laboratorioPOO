import java.util.Scanner;
/**
 * Clase creada para instanciar objetos de tipo Punto y probar de manera exhaustiva todos sus metodos.
 * 
 * @author (Antonio Quintana) 
 * @version (1.0 21/08/2025)
 */
public class PuntoPrueba
{
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        double x_p1 = Double.valueOf(args[0]);
        double y_p1 = Double.valueOf(args[1]);
        
        Punto punto1 = new Punto(x_p1, y_p1);
        Punto punto2 = new Punto();
        
        punto1.mostrar();
        punto2.mostrar();
        System.out.println("La distancia entre los puntos es: " + String.format("%.2f", punto1.distanciaA(punto2)));
        
        
        System.out.println("Ingrese los valores que desea desplazar a punto 2");
        System.out.println("dx: ");
        double a_dx = teclado.nextDouble();
        System.out.println("dy: ");
        double a_dy = teclado.nextDouble();
        
        punto2.desplazar(a_dx, a_dy);
        System.out.println("La nuevas cordenadas del punto 2 son " + punto2.coordenadas());
        
        punto1.mostrar();
        punto2.mostrar();
        System.out.println("La distancia entre los puntos es: " + String.format("%.2f", punto1.distanciaA(punto2)));
        
    }
    
    
}