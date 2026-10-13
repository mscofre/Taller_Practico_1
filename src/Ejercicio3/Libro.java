/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Libro {
    // atributo
    
    String titulo, autor, estado;
    int paginas;

  
    public Libro(String titulo, String autor, String estado, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.paginas = paginas;
    }
    
    //Metodo
    
    public void prestar(){
        if (estado.equalsIgnoreCase("Disponible")&& estado.equalsIgnoreCase("disponible")) {
            estado = "Prestado";
            System.out.println("el libro ha sido prestado ");
        }else{
            System.out.println("El libro lo tiene otra persona");
        }
    }
    public void devolver(){
        if (estado.equalsIgnoreCase("Prestado") && estado.equalsIgnoreCase("prestado")) {
            estado = "Disponible";
            System.out.println("El libro regreso a casa >:D ");
        }else{
            System.out.println("El libro se puede prestar");
        }
    }
    public void mostrarInfo(){
        System.out.println("==DATOS DEL LIBRO==");
        System.out.println("Titulo: "+ titulo );
        System.out.println("Autor: "+ autor);
        System.out.println("Estado: "+ estado);
        System.out.println("Paginas: "+ paginas);
    }
}
