import java.util.Scanner;
/**
 * Clase ejecutable, en la que se instancia y prueban todos los metodos
 * de las clases Hombre y Mujer.
 * @author Pannunzio M. Nicolas - Quintana Antonio
 * @version 24/08/25
 */
public class RegistroCivil{
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");

        Hombre unHombre = null;
        Hombre otroHombre = null;
        Mujer unaMujer = null;
        Mujer otraMujer = null;

        int opcion;
        do {
            System.out.println("\n--- MENÚ REGISTRO CIVIL ---");
            System.out.println("1. Asignar datos a Hombre 1");
            System.out.println("2. Asignar datos a Hombre 2");
            System.out.println("3. Asignar datos a Mujer 1");
            System.out.println("4. Asignar datos a Mujer 2");
            System.out.println("5. Mostrar estado civil de todos");
            System.out.println("6. Casar Hombre y Mujer");
            System.out.println("7. Divorciar Hombre y Mujer");
            System.out.println("8. Mostrar con quién está casado cada uno");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("Ingrese nombre del Hombre 1:");
                    String nombreH1 = teclado.next();
                    System.out.println("Ingrese apellido del Hombre 1:");
                    String apellidoH1 = teclado.next();
                    System.out.println("Ingrese edad del Hombre 1:");
                    int edadH1 = teclado.nextInt();
                    unHombre = new Hombre(nombreH1, apellidoH1, edadH1);

                    break;

                case 2:
                    System.out.println("Ingrese nombre del Hombre 2:");
                    String nombreH2 = teclado.next();
                    System.out.println("Ingrese apellido del Hombre 2:");
                    String apellidoH2 = teclado.next();
                    System.out.println("Ingrese edad del Hombre 2:");
                    int edadH2 = teclado.nextInt();
                    otroHombre = new Hombre(nombreH2, apellidoH2, edadH2);

                    break;

                case 3:
                    System.out.println("Ingrese nombre de la Mujer 1:");
                    String nombreM1 = teclado.next();
                    System.out.println("Ingrese apellido de la Mujer 1:");
                    String apellidoM1 = teclado.next();
                    System.out.println("Ingrese edad de la Mujer 1:");
                    int edadM1 = teclado.nextInt();
                    unaMujer = new Mujer(nombreM1, apellidoM1, edadM1);

                    break;

                case 4:
                    System.out.println("Ingrese nombre de la Mujer 2:");
                    String nombreM2 = teclado.next();
                    System.out.println("Ingrese apellido de la Mujer 2:");
                    String apellidoM2 = teclado.next();
                    System.out.println("Ingrese edad de la Mujer 2:");
                    int edadM2 = teclado.nextInt();
                    otraMujer = new Mujer(nombreM2, apellidoM2, edadM2);

                    break;

                case 5:
                    if(unHombre != null){
                        unHombre.mostrarEstadoCivil();
                    }

                    if(otroHombre != null){
                        otroHombre.mostrarEstadoCivil();
                    }

                    if(unaMujer != null){
                        unaMujer.mostrarEstadoCivil();
                    }

                    if(otraMujer != null){
                        otraMujer.mostrarEstadoCivil();
                    }

                    break;

                case 6:
                    System.out.println("Seleccione Hombre (1 o 2):");
                    int h = teclado.nextInt();
                    System.out.println("Seleccione Mujer (1 o 2):");
                    int m = teclado.nextInt();

                    if(h == 1 || h == 2){
                        if(m == 1 || m == 2){
                            //valido que las opciones sean correctas
                            Hombre auxHombre = (h == 1) ? unHombre : otroHombre; //si h es 1 asigno unHombre, sino otroHombre
                            Mujer auxMujer = (m == 1) ? unaMujer : otraMujer; //si m es 1 asigno unaMujer, sino otraMujer
                            if(auxHombre != null && auxMujer != null){
                                auxHombre.casarseCon(auxMujer);
                                auxMujer.casarseCon(auxHombre);
                                System.out.println("¡Casados!");
                            } else {
                                System.out.println("Debe asignar datos a ambos antes de casarlos.");
                           }
                        } else {
                            System.out.println("Opción de Mujer inválida.");
                            break;
                        }
                    } else {
                        System.out.println("Opción de Hombre inválida.");
                        break;
                    }
                    
                    break;

                case 7:
                    System.out.println("Seleccione Hombre (1 o 2):");
                    h = teclado.nextInt();
                    System.out.println("Seleccione Mujer (1 o 2):");
                    m = teclado.nextInt();

                    if(h == 1 || h == 2){
                        if(m == 1 || m == 2){
                            //valido que las opciones sean correctas
                            Hombre auxHombre = (h == 1) ? unHombre : otroHombre;//si h es 1 asigno unHombre, sino otroHombre
                            Mujer auxMujer = (m == 1) ? unaMujer : otraMujer;//si m es 1 asigno unaMujer, sino otraMujer

                            if(auxHombre!= null && auxMujer != null){
                               auxHombre.divorcio();
                               auxMujer.divorcio();
                               System.out.println("¡Divorciados!");
                            } else {
                                   System.out.println("Debe asignar datos a ambos antes de divorciarlos.");
                                }

                        } else {
                            System.out.println("Opción de Mujer inválida.");
                            break;
                        }

                    } else {
                        System.out.println("Opción de Hombre inválida.");
                        break;
                    }
                    
                    break;

                case 8:
                    if(unHombre != null){
                        unHombre.casadaCon();
                    } 

                    if(otroHombre != null){
                        otroHombre.casadaCon();
                    }
                    if(unaMujer != null){
                        unaMujer.casadaCon();
                    }

                    if(otraMujer != null){
                        otraMujer.casadaCon();
                    }

                    break;

                case 0:
                    System.out.println("¡Saliendo del menu!");
                    break;

                default:
                    System.out.println("Opción inválida. Ingrese un numero entre 0 - 8");
            }
        } while(opcion != 0);

    }
}