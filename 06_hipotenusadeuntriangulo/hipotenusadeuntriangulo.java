import java.util.Scanner;
import java.lang.Math;
class calculahipotenusa{
    public static void main(String[] args){
        double co,ca,r;
        char o='s';
        Scanner entrada = new Scanner(System.in);
        while(o=='S' || o == 's'){
            System.out.println("Ingrese la medida del cateto opuesto: ");
            co=entrada.nextFloat();
            System.out.println("Ingrese la medida del cateto adyacente: ");
            ca=entrada.nextFloat();
            r=Math.sqrt(Math.pow(ca,2)+Math.pow(co,2));//sqrt obtiene la raiz cuadrada mientras que pow eleva el numero
            System.out.println("La medida de la Hipotenusa es igual a : "+r);
            //El siguiente metodo lanza una espera de 5 segundos antes de continuar la ejecucion
            try {
                Thread.sleep(5000);
          } catch (InterruptedException e) {
          }//termina la espera
            System.out.println("Desea realizar otro calculo? S / N ");
            o=entrada.next().charAt(0);
        }
    }
}
