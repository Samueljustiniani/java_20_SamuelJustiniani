
package Guia07.actividad4;

public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de la clase Segundo
        segundo nuevo = new segundo("Karla", 38);
        
        // Llamar a los métodos de la instancia
        System.out.println(nuevo.saludar("Hola"));  // Salida esperada: Hola, mi nombre es Karla.
        nuevo.cumplirAnios(2);  // Salida esperada: Ahora tengo 43 años.
    }
}

