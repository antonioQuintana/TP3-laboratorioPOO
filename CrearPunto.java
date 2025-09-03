
/**
 * CrearPunto instancia objetos de tipo Punto y prueba exhaustivamente sus metodos.
 * 
 * @author Pannunzio M. Nicolas - Quintana Antonio  
 * @version 27/08/25
 */
 
public class CrearPunto
{
    /**
     * main donde se instancia y prueban los metodos de los objetos tipo Punto
     */
    public static void main(String[] args){
        //Copiar para pasar por el main "1","3","2","1"
        Punto unPunto = new Punto(Double.valueOf(args[0]), Double.valueOf(args[1]));
        //Instancio unPunto con los valores ingresados por main
        unPunto.mostrar();//Muestra por pantalla los valores de x e y
        
        unPunto.desplazar(Double.valueOf(args[2]), Double.valueOf(args[3]));
        //Mando el mensaje desplazar() a unPunto, que suma x + dx, y + dy
        System.out.println(unPunto.coordenadas());
        //coordenadas devuelve un String. ej (7, 8)
        
        //Pruebo el metodo contructor que situa el punto en el origen (0, 0)
        Punto otroPunto = new Punto();
        System.out.println("\notroPunto situado en el origen: ");
        otroPunto.mostrar();
        
        System.out.println("\nLa distancia entre el primer punto y el punto situado en en origen es: "+
                           unPunto.distanciaA(otroPunto));
    }
}