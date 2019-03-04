/*
    Se requiere un programa para controlar los empleados de una compañia, 
    se solicita capacidad para 5 empleados, con las siguientes caracteristicas:

    -Nombre
    -Edad
    -Direccion
    -Telefono

    se debe imprimir el empleado deseado(No utilizar ciclos)...

 */
package empleados;
/*
 * @author anima
 */
public class Datos {
    
    private String nombre;
    private String direccion;
    private int edad;
    private String telefono;

    public Datos() {
    }

    public Datos(String nombre, String direccion, int edad, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    
    
}
