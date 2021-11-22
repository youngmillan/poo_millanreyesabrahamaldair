/*
Elabore un programa que lea por el teclado 10 números enteros y los guarde en un Array
Posteriormente que calcule y muestre el promedio de los valores positivos y  de los negativos.
 */
//Abraham Aldair Millan Reyes
import java.util.*;
public class positivonegativo {
    public static void main(String[] args) {
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
}
