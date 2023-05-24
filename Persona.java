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
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro1;
    private Perro perro2;
    private Perro perro3;
    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    
    public void adoptarPerro(Perro can){
        
        if(perro1==null){
            perro1=can;
            System.out.println("adopte a "+perro1);
        }else if(perro2==null){
            perro2=can;
            System.out.println("adopte a "+perro2);
        }else if(perro3==null){
            perro3=can;
            System.out.println("adopte a "+perro3);
        
    }else{
            System.out.println("Ya no puedo adoptar");
        }
       
    }
    public void perroMasGrande(){
        if(perro1.getEdad()>perro2.getEdad() && perro1.getEdad()>perro3.getEdad()){
            System.out.println("perro grande es: "+perro1);
        }else if(perro2.getEdad()>perro3.getEdad() && perro2.getEdad()>perro1.getEdad()){
            System.out.println("perro grande es: "+perro2);
        }else{
            System.out.println("perro grande: "+perro3.getNombre());
        }
    }
    
}
    

