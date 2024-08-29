/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.actividad2;


public class Segundo {
    //atributos
    String Marca;
    int velocidad;
    
    //metodos
    public void carro(){
        Marca = "lamborgini";
    }
     public void veloz(){
         velocidad = 45;
     }       
     
     public void Resultado(){
         System.out.println("la marca es :"+ Marca + "\ny la velocidad es :"+ velocidad);
     }
}
