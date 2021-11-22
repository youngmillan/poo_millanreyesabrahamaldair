/*
Elabore un programa que lea 10 números enteros por teclado y los guarde en un array.
Calcula y muestre el promedio de los números que estén en las posiciones pares del array.  
*/
//Abraham Aldair Millan Reyes

import java.util.*;

public class calcula {

    public static void main(String[] args) {

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
