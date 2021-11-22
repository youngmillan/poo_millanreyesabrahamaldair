import java.util.Scanner;


public class TareaArreglos {
    /*
    Menu de 2 opciones
    1.-positivonegativo
    2.-calcula
    */


    Scanner entrada = new Scanner(System.in);

    char op;
    
    //metodos propios de la clase
    //un metodo es una operacion o una accion que puede realizar una clase 

    public void menu(){
        //menu del programa 


        System.out.println("Arreglos, elija la opción deseada: ");
        System.out.println("a.- positivonegativo");
        System.out.println("b.- calcula");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a':
                //implementar metodos independientes para cada opcion 
                positivonegativo();
                break;

            case 'b':
                calcula();
                break;

                default: 
                System.out.println("neel");
            }
        }
        public void positivonegativo(){
            /*
            Elabore un programa que lea por el teclado 10 números enteros y los guarde en un Array
            Posteriormente que calcule y muestre el promedio de los valores positivos y  de los negativos.
            */
            //Abraham Aldair Millan Reyes
                Scanner sc = new Scanner(System.in);
                int i;
                int pos = 0, neg = 0; 
                int[] numeros = new int[10];
                double sumaPos = 0, sumaNeg = 0;                   
                
                //lectura de datos y llenar el array
                System.out.println("Lectura de los elementos del array: ");
                for (i = 0; i < 10; i++) {
                    System.out.print("numeros[" + i + "]= ");
                    numeros[i]=sc.nextInt();
                }
        
                //recorrer el array para sumar por separado los números positivos 
                 // y los negativos 
                for (i = 0; i < 10; i++) {
                    if (numeros[i] > 0){ 
                        sumaPos += numeros[i];
                        pos++;
                    } else if (numeros[i] < 0){
                        sumaNeg += numeros[i];
                        neg++;
                    }
                }
        
                //Calcular y mostrar las medias
                if (pos != 0) {
                    System.out.println("Media de los valores positivos: " + sumaPos / pos);                
                } else {
                    System.out.println("No ha introducido numeros positivos");
                }
                if (neg != 0) {
                    System.out.println("Media de los valores negativos: " + sumaNeg / neg);
                } else {
                    System.out.println("No ha introducido numeros negativos");
                }
            }
            public void calcula(){   
            /*
             Elabore un programa que lea 10 números enteros por teclado y los guarde en un array.
             Calcula y muestre el promedio de los números que estén en las posiciones pares del array.  
            */
             //Abraham Aldair Millan Reyes
               Scanner sc = new Scanner(System.in);
               int i;
               int[] numeros = new int[10];
               double media = 0;

               //lectura de datos y llenar el array
               System.out.println("Lectura de los elementos del array: ");
               for (i = 0; i < 10; i++) {
               System.out.print("numeros[" + i + "]= ");
               numeros[i] = sc.nextInt();
        }
        
            //Recorrer el array y calcular la media
            for (i = 0; i < 10; i++) {
            if (i % 2 == 0){ 
                media = media + numeros[i]; 
            }
        }
        //Calcular y mostrar la media
        System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);              
    }
}