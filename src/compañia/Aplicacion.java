/*
    Se requiere un programa para controlar los empleados de una compañia, 
    se solicita capacidad para 5 empleados, con las siguientes caracteristicas:

    -Nombre
    -Edad
    -Direccion
    -Telefono

    se debe imprimir el empleado deseado(No utilizar ciclos)...

 */
package compañia;

import empleados.Datos;
import java.util.Scanner;

/**
 *
 * @author anima
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        Datos empleado1 = new Datos();
        Datos empleado2 = new Datos();
        Datos empleado3 = new Datos();
        Datos empleado4 = new Datos();
        Datos empleado5 = new Datos();
        
        empleado1.setNombre("Juan David");
        empleado1.setEdad(20);
        empleado1.setDireccion("carr. 2 b sur 3A 50");
        empleado1.setTelefono("320 509 9017");
        
        empleado2.setNombre("Jhon leonardo");
        empleado2.setEdad(43);
        empleado2.setDireccion("carrera 13 #3A 47");
        empleado2.setTelefono("312 501 506 04");
        
        empleado3.setNombre("Leila linder");
        empleado3.setEdad(45);
        empleado3.setDireccion("carrera 13 #3A 47");
        empleado3.setTelefono("312 443 208 22");
        
        empleado4.setNombre("stiben leonardo");
        empleado4.setEdad(23);
        empleado4.setDireccion("carrera 13 #3A 47");
        empleado4.setTelefono("320 483 290 71");
        
        empleado5.setNombre("Brandon Stiben");
        empleado5.setEdad(20);
        empleado5.setDireccion("carrera 13 #3A 47");
        empleado5.setTelefono("314 893 560 35");

        
        
        System.out.println(" Elije la opcion del empleado al cual deseas ver su informacion: \n 1.Empleado 1 \n 2.Empleado 2 \n 3.Empleado 3 \n 4.Empleado 4 \n 5.Empleado 5 ");
        int opc;
        opc = leer.nextInt();
        
        switch (opc){
           
            case 1:
                System.out.println(" Los datos del empleado son: \n"+"\nNombre: \n"+empleado1.getNombre()+"\nEdad: \n"+empleado1.getEdad()+"\nDireccion: \n"+empleado1.getDireccion()+"\nTelefono: \n"+empleado1.getTelefono());
                break;
            case 2:
                System.out.println(" Los datos del empleado son: \n"+"\nNombre: \n"+empleado2.getNombre()+"\nEdad: \n"+empleado2.getEdad()+"\nDireccion: \n"+empleado2.getDireccion()+"\nTelefono: \n"+empleado2.getTelefono());
                break;
            case 3:
                System.out.println(" Los datos del empleado son: \n"+"\nNombre: \n"+empleado3.getNombre()+"\nEdad: \n"+empleado3.getEdad()+"\nDireccion: \n"+empleado3.getDireccion()+"\nTelefono: \n"+empleado3.getTelefono());
                break;
            case 4:
                System.out.println(" Los datos del empleado son: \n"+"\nNombre: \n"+empleado4.getNombre()+"\nEdad: \n"+empleado4.getEdad()+"\nDireccion: \n"+empleado4.getDireccion()+"\nTelefono: \n"+empleado4.getTelefono());
                break;
            case 5:
                System.out.println(" Los datos del empleado son: \n"+"\n Nombre: \n"+empleado5.getNombre()+"\n Edad: \n "+empleado5.getEdad()+"\n Direccion: \n"+empleado5.getDireccion()+"\n Telefono: \n"+empleado5.getTelefono());
                break;
            default:
                System.out.println(" opcion invalida vuelve a intentarlo");
                break;
        }
        
    }
    
}
