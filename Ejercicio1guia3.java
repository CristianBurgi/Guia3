/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia3;

/**
 *
 * @author Isabel
 */
public class Ejercicio1guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro canino1=new Perro("pachito", "chihuahua", 1, 20);
        Perro canino2=new Perro("luna", "labrador", 6, 100);
        Perro canino3=new Perro("robertito", "bulldog", 11, 120);
        Perro canino4=new Perro("kokito", "kuskito", 9, 80);
        
        Persona p1=new Persona("pepe", "Romano", 30, 22334455);
        
        p1.adoptarPerro(canino1);
        p1.adoptarPerro(canino2);
        p1.adoptarPerro(canino3);
        p1.adoptarPerro(canino4);
        System.out.println("");
        p1.perroMasGrande();
    }
    
}
