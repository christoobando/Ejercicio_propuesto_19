/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_propuesto_19;

/**
 *
 * @author Christopher
 */
public class Ejercicio_propuesto_19 {
    
    double lado;
    
    Ejercicio_propuesto_19(double lado){
        this.lado = lado;
    }
    
    double Perimetro(){
        return 3 * lado;
    }
    
    double Altura(){
        return Math.sqrt(3)*lado/2;
    }
    
    double Area(){
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    public static void main(String[] args) {
    Ventana19 ventana = new Ventana19();
    ventana.show(true);
    }
}