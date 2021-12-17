package libreria;

import java.util.Scanner;

public class Libro {
   
   int idLibro;
   String[] libro;
   
   public Libro() {
      // 100 libros
      idLibro = 0;
      libro = new String[100];
   }
   
   public void Agregar(String nombre) {
      libro[idLibro++] = nombre;
   }
   
   public void ConsultarTodos() {
      for(int i=0; i<idLibro; i++) {
         System.out.println("Libro "+libro[i]);
      }
   }

   public void Borrar(String nombre) {
      for(int i=0; i<idLibro; i++) {
         if(nombre.equals(libro[i])) {
            libro[i] = libro[i+1];
         }
      }   
      idLibro--;
   }

   public void Modificar(String modificar, String modificado) {
      for(int i=0; i<idLibro; i++) {
         if(modificar.equals(libro[i])) {
            libro[i] = modificado;
         }
      }  
   }

   public void ConsultarLibro(String consulta) {
      String respuesta = "";
      for(int i=0; i<idLibro; i++) {
         if(consulta.equals(libro[i])) {
            respuesta = "Existe "+ consulta;
            break;
         } else {
            respuesta = "No existe "+consulta;
         }
      }  
      System.out.println(respuesta);
   }
   
   public void mostrar2() {
      Agregar("Libro 1");
      Agregar("Libro 2");
      Agregar("Libro 3");      
      
      ConsultarTodos();
      
      String borrar = "Libro 2";
      Borrar(borrar);
      ConsultarTodos();
      
      String modificar = "Libro 1";
      String modificado = "Libro B";
      Modificar(modificar, modificado);
      ConsultarTodos();
      
      String consulta = "Libro 2";
      ConsultarLibro(consulta);
   }
   
   public void menu() {
      int opcion = -1;
      Scanner sc = new Scanner(System.in);
      System.out.println("\t==============================");         
      System.out.println("\t\t JUEGOS DE HABILIDAD MENTAL ");
      System.out.println("\t==============================");
      System.out.println("(1). Agregar nuevo libro");
      System.out.println("(2). Consultar libro");
      System.out.println("(3). Consultar todos los libros");     
      System.out.println("(4). Borrar un Libro");
      System.out.println("(5). Modificar los datos de un libro");     
      System.out.print("\tIntroduzca una opción :");
      opcion = Integer.parseInt(sc.nextLine());
      switch(opcion){
         case 1: 
               System.out.print("Ingrese el nombre del libro:");    
               String libro = sc.nextLine();
               Agregar(libro);         
         break;
         case 2: 
               String consulta = sc.nextLine();
               ConsultarLibro(consulta);
         break;
         case 3:
               ConsultarTodos();
         break;
         case 4:
               String borrar = sc.nextLine();
               Borrar(borrar);
         break;
         case 5:
               System.out.print("Introduzca libro a modificar:");     
               String modificar = sc.nextLine();
               System.out.print("Modificar "+modificar+" por:");                    
               String modificado = sc.nextLine();
               Modificar(modificar, modificado);
               ConsultarTodos();
         break;
         
      }                           
      System.out.println("\n Saliendo de Libro");
   }

   public static void main(String[] args) {                                         						

		new Libro().menu();
   }
}
