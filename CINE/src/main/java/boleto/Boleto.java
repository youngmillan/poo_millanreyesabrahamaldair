package boleto;

import java.util.Scanner;

public class Boleto {
   
      String[] funciones;     
      String[] persona;      
      String[] tipoSala;      
      double funcionantes;      
      double funciondepues;
      double pantallaDigital;
      
      double estudianteyadulto;
      double mayoresychicos;
      
      double total;
   
   public Boleto() {
      funciones = new String[]{"Miércoles", "Antes 18:00", "Después 18:00"};
      persona = new String[]{"Adultos", "Niños", "Adultos Mayores"};      
      tipoSala = new String[]{"Normal", "3D"};      
      
      funcionantes = 52.00;      
      funciondepues = 65.00;
      pantallaDigital = 80.00;
      
      estudianteyadulto = 45.00;
      mayoresychicos = 42.00;      
   }
   
   public double losMiercoles(int adulto, int chico, int mayor) {
      total = 0.0;
      total += adulto * estudianteyadulto;
     // System.out.println("Miercoles adulto "+total);

      total += chico * mayoresychicos;
      total += mayor * mayoresychicos;      
      System.out.println("Total a pagar "+total);   
      return total;
   }
  
   public double antesDeLas18(int numeroDePersonas) {
      total = 0.0;
      total += numeroDePersonas * funcionantes;
      System.out.println("Total en funcion antes de las 18 "+total);   
      return total;
   }   
   
   public double despuesDeLas18Normal(int numeroDePersonas) {
      total = 0.0;    
      total += numeroDePersonas * funciondepues;   
      System.out.println("Total en funcion después de las 18 "+total);      
      return total;
   }
   
   public double despuesDeLas183D(int numeroDePersonas) {
      total = 0.0;
      total += numeroDePersonas * pantallaDigital;
      System.out.println("Total en funcion después de las 18 "+total);      
      return total;   
   }   
   
   public void menu() {
      int opcion = -1;
      Scanner sc = new Scanner(System.in);      
      double totalNormal = 0.0;
      double total3d = 0.0;
      
      int boletosNormal = 0;
      int boleto3d = 0;
      do{
         System.out.println("\t==============================");         
         System.out.println("\t\t COMPRA DE BOLETOS ");
         System.out.println("\t==============================");
         System.out.println("(1). "+funciones[0]);
         System.out.println("(2). "+funciones[1]);
         System.out.println("(3). "+funciones[2]);     
         System.out.println("(0). SALIR");      
         System.out.print("\tIntroduzca una opción :");
         opcion = Integer.parseInt(sc.nextLine());
         
         //funcion=1(miercoles), numeroDePersonas=5, adultos=2, niños=1, mayores=2, tipoDeSala=1(Normal)} 
         // int[] opciones = {1, 7, 3, 2, 2, 1};
         int funcion = opcion;          
        int numeroDePersonas = 0;
        int adultos = 0;         
        int chicos = 0;         
        int mayores = 0;    
        int tipoDeSala = 0;    
       
         if(opcion != 0) {
            System.out.print("Número de Personas : ");
            numeroDePersonas = Integer.parseInt(sc.nextLine());
            System.out.print("Adultos : ");
            adultos = Integer.parseInt(sc.nextLine());         
            System.out.print("Estudiante : ");
            chicos = Integer.parseInt(sc.nextLine());         
            System.out.print("Mayores : ");
            mayores = Integer.parseInt(sc.nextLine());         
            System.out.print("Tipo de sala (1)Normal (2)3D : ");
            tipoDeSala = Integer.parseInt(sc.nextLine());
         }
         switch(opcion){
            case 1:
               if(tipoDeSala == 1) {
                  totalNormal += losMiercoles(adultos, chicos, mayores);
                  boletosNormal += numeroDePersonas;
               } else {
                  total3d += losMiercoles(adultos, chicos, mayores);    
                  boleto3d += numeroDePersonas;              
               }
            break;
            case 2: 
               if(tipoDeSala == 1) {
                  totalNormal += antesDeLas18(numeroDePersonas);
                  boletosNormal += numeroDePersonas;
               } else {
                  total3d += antesDeLas18(numeroDePersonas);
                  boleto3d += numeroDePersonas;                                
               }
            break;
            case 3: 
               if(tipoDeSala == 1) {
                  totalNormal += despuesDeLas18Normal(numeroDePersonas);
                  boletosNormal += numeroDePersonas;
               } else {
                  total3d += despuesDeLas183D(numeroDePersonas);                  
                  boleto3d += numeroDePersonas;                                
               }
               break;
         }                           
      }while(opcion != 0);
      System.out.println("Venta de boletos en sala normal: "+totalNormal);
      System.out.println("Venta de boletos en sala 3D: "+total3d);      
      System.out.println("Boletos normales: "+boletosNormal);
      System.out.println("Boletos 3D: "+boleto3d);                  
      sc.close();   
   }
   
                                    
   public static void main(String[] args) {                                         						
        new Boleto().menu();
   }
}

