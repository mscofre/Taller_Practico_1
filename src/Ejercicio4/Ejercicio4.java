/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int op;
        boolean ingresados = false;
        Empleado empleados [] = null;
 
        int n = 0;
        do {
            System.out.println("==Pago de Empleados==");
            System.out.println("1. Ingresar un empleado");
            System.out.println("2. Salario");
            System.out.println("3. Mostrar Datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una Opcion: ");
            op =sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:

                    System.out.print("Cuantos empleados desea ingresar (N): ");
                    n = sc.nextInt();
                    sc.nextLine();
                    empleados = new Empleado[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("--- Datos del Empleado " + (i + 1) + " ---");
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Horas Extras trabajadas: ");
                        int horas_extras = sc.nextInt();
                        sc.nextLine();
                        // Instanciar cada objeto del arreglo
                        empleados[i] = new Empleado(nombre, horas_extras);
                    }
                    ingresados = true;
                    System.out.println("¡Empleados registrados con éxito!");
                    break;
                case 2:
                    if (ingresados && empleados != null) {
                        for (int i = 0; i < n; i++) {
                            empleados[i].calcularSalarioTotal();
                        }
                        System.out.println("Salarios calculados correctamente!");
                    } else {
                        System.out.println(" Primero debe ingresar los empleados (Opción 1).");
                    }
                    break;
                case 3:
                    if (ingresados && empleados != null) {
                        System.out.println("=== REGISTRO DE EMPLEADOS ===");
                        for (int i = 0; i < n; i++) {
                            empleados[i].mostrarDatos();
                        }
                    } else {
                        System.out.println("Primero debe ingresar los empleados (Opción 1).");
                    }
                    break;
                case 4:break;
                default:
                    System.out.println("Opcion no valida !!");break;
            }
   
        } while (op!=4);
        
        
        
        
    }
    
}
