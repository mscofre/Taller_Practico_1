/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        int op;
        Libro libros [] = null;
        System.out.print("Cuantos libros desea ingresar: ");
        int n= sc.nextInt();
        sc.nextLine();
        
        do{
            System.out.println("==BILIOTECA ESPE==");
            System.out.println("1. Ingresar Libro");
            System.out.println("2. Prestar Libro");
            System.out.println("3. Devolver Libro");
            System.out.println("4. Mostrar Datos ");
            System.out.println("5. Salir");
            System.out.print("Ingrese una Opcion: ");
            op =sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                    
                    libros = new Libro[n];
                    for(int i = 0; i < n ; i++){
                        System.out.println("Datos del Libro " + (i+1) + ": ");
                        System.out.print("Titulo: ");
                        String titulo = sc.nextLine();
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        System.out.print("Estado: ");
                        String estado = sc.nextLine();
                        System.out.print("Paginas: ");
                        int paginas = sc.nextInt();
                        sc.nextLine();

                        libros[i] = new Libro(titulo, autor, estado, paginas);
                    }break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        libros[i].prestar();
                    }break;
                    
                case 3:
                    for (int i = 0; i < n; i++) {
                        libros[i].devolver();
                    }break;
                    
                case 4:
                    for (int i = 0; i < n; i++) {
                        libros[i].mostrarInfo();
                    }break;
                case 5:break;
                default:
                    System.out.println("Opcion no valida !!");break;
                    

            }
        }while(op!=5);
        
        sc.close();

       
    }
    
}
