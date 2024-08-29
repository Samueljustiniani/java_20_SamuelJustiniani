package Guia07.actividad3;

public class principal {
    public static void main(String[] args) {
        
        segundo obj = new segundo();
        
        obj.edad = 25;  
        obj.metros = 1.85f;  
        
        int edadObtenida = obj.Ed();  
        
        float metritos = obj.met();

        obj.resultados();
    }
}
