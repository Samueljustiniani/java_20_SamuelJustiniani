package Guia07.actividad5;

public class segundo {
//atributos
    String nombre;
    int edad;
//metodos
    
    //metodo constructor 
    public segundo(String _nombre, int _edad) {
        nombre = _nombre;
        edad = _edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }

}
