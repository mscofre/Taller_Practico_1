/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    //Atributos
       private String nombre, apellido, tipocuenta;
       private double saldo;
       
    //Constructores
    public CuentaBancaria() {
        
    }

    public CuentaBancaria(String nombre, String apellido, String tipocuenta, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipocuenta = tipocuenta;
        this.saldo = saldo;
    }
       
    //Metodos
    public void depositar(double monto){
        saldo = saldo + monto;
        System.out.println("Deposito Exitoso. Nuevo saldo $ " +saldo);
        
    }
    public void retirar(double monto){
        if (monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Retiro Exitoso. Nuevo saldo $" +saldo);
        }else{
            System.out.println("Saldo Insuficiente. ");
        }
    }
    public void mostrarSaldo(){
        System.out.println("====DATOS CUENTA BANCARIA======");
        System.out.println("Nombre del Titular: "+ nombre + " " + apellido);
        System.out.println("Tipo de Cuenta: "+tipocuenta);
        System.out.println("Saldo: "+saldo);
        
    }
}
