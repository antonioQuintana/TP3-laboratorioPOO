import java.util.Random;//Para obtener numeros random
/**
 * Ejecutable para la clase Circulo que prueba de manera exhaustiva sus metodos.
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio 
 * @version 23/08/25
 */


public class CrearFigura
{
    public static void main(String[] args){
        Random unNumero = new Random();//instancio un objeto clase Random
        
        //EJERCICIO CIRCULO -------------------------
        double radio = unNumero.nextDouble() * 100.0;//Asigno a radio un numero aleatorio
        Punto puntoCirculo = new Punto();//Instancio un punto en (0,0)
        Circulo unCirculo = new Circulo(radio, puntoCirculo);//Instancio unCirculo de radio aleatorio y centro (0,0)
        unCirculo.desplazar(-240, -230);
        unCirculo.caracteristicas();
        
        radio = unNumero.nextDouble() * 100.0;//Asigno a radio otro numero aleatorio
        Punto otroPuntoCirculo = new Punto(5.2, 0.5);
        Circulo otroCirculo = new Circulo(radio, otroPuntoCirculo);
        
        //Comparo para ver quien es el mayor y muestro sus caracteristicas en pantalla
        System.out.println("\nEl mayor entre los circulos es: ");
        unCirculo.elMayor(otroCirculo).caracteristicas();
        System.out.println("\nDistancia entre unCirculo y otroCirculo: "+ unCirculo.distanciaA(otroCirculo));
        
        //Para probar de manera exhaustiva todos los metodos
        Circulo circuloCero = new Circulo();
        System.out.println("\n\t***** circuloCero *****"); 
        circuloCero.caracteristicas();
        
        //EJERCICIO RECTANGULO -------------------
        double alto = unNumero.nextDouble() * 100.0;//Asigno a alto un numero aleatorio
        double ancho = unNumero.nextDouble() * 100.0;//Asigno a ancho un numero aleatorio
        Rectangulo unRectangulo = new Rectangulo(ancho, alto);//Rectangulo de origen (0,0) - ancho y alto aleatorios.
        unRectangulo.desplazar(40, -20);
        unRectangulo.caracteristicas();
        
        alto = unNumero.nextDouble() * 100.0;//Asigno a alto otro numero aleatorio
        ancho = unNumero.nextDouble() * 100.0;//Asigno a ancho otro numero aleatorio
        Punto puntoRectangulo = new Punto(7.4, 4.5);
        Rectangulo otroRectangulo = new Rectangulo(puntoRectangulo, ancho, alto);
        
        System.out.println("\nEl mayor entre los rectangulos es: ");
        unRectangulo.elMayor(otroRectangulo).caracteristicas();
        System.out.println("\nDistancia entre unRectangulo y otroRectangulo: "+ unRectangulo.distanciaA(otroRectangulo));
        
    }
}