package libreria;

import java.util.Scanner;

public class Libreria {  
   
   public void menu() {
      int opcion = -1;
      Scanner sc = new Scanner(System.in);
      
      Libro libro = new Libro();
      do{
         System.out.println("\t==============================");         
         System.out.println("\t\t LIBRERIA MIS LIBROS ");
         System.out.println("\t==============================");
         System.out.println("(1). Gestionar Libros");
         System.out.println("(2). Gestionar Revistas");
         System.out.println("(3). Gestionar Periodicos");     
         System.out.println("(4). SALIR");      
         System.out.print("\tIntroduzca una opción :");
         opcion = Integer.parseInt(sc.nextLine());
         switch(opcion){
            case 1: libro.menu(); break;
/*            case 2: new PalabrasDesordenadas().ejecuta(); break;
            case 3: new TriviaMatematica().ejecuta(); break;*/
         }                           
      } while(opcion != 0);
      System.out.println("\n\nGracias por utilizar el gestor de MIS LIBROS ;)");
      sc.close();   
   }
   public static void main(String[] args) {                                         						

		new Libreria().menu();
   }
}