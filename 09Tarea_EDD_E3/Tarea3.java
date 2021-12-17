import java.util.Scanner;
public class Tarea3 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //Se tiene una temperatura en grados Centigrados "°C" y se necesita se conviertan
        // a su equivalente en grados Fahrenheit "°F"
        // también comvertir de Fahrenheit a Kelvin "°K", sabiendo que 
        /*
        de °C a °F: °F=(°C*9/5)+32
        de °F a °K: °K=(°F-32/1.8000)+273
        de °K a °C: °C= °K-273
        */

        //Conversion de °C a °F
        int c, f, k;
        System.out.println("Ingrese cantidad de grados Centigrados");
        c = entrada.nextInt();
        f = c*9/5+32;
    System.out.println("En grados Fahrenheit es:" + f);
    //Conversion de °F a °K
         System.out.println("Ingrese cantidad de grados Fahrenheit");
        f = entrada.nextInt();
        k = f (-32/1.8000+273);
        System.out.println("En grados kelvin es:" + k);
       

    }
}

