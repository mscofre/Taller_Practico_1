/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Usuario
 */
public class Empleado {
    
    String nombre ;
    int  horas_extras;
    double salarioBase,salarioTotal;

    public Empleado(String nombre, int horas_extras) {
        this.nombre = nombre;
        this.horas_extras = horas_extras;
        this.salarioTotal = 0;
        this.salarioBase = 460;
    }



    public void calcularSalarioTotal(){
        this.salarioTotal = this.salarioBase + (this.horas_extras * 10);
    }
    
    public void mostrarDatos(){
        System.out.println("----------------------------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Salario Base: $" +salarioBase);
        System.out.println("Horas Extras: " + horas_extras);
        System.out.println("Salario Total Calculado: $" + salarioTotal);
        System.out.println("----------------------------------------");
    }
}
