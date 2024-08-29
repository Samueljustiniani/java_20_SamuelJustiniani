package Guia07.actividad4;

public class segundo {

   String nombre;
   int edad;

  public segundo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
  
  // Método que acepta un parámetro
    public String saludar(String saludo) {
        return saludo + ", mi nombre es " + nombre + ".";
    }

   // Método que acepta un parámetro
    public void cumplirAnios(int anos) {
        edad += anos;
        System.out.println("Ahora tengo " + edad + " años.");
    }
}