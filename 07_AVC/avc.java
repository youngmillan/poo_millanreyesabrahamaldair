import java.util.Scanner;
import java.lang.Math;
class avc{
    public static void main(String [] args){
        Scanner d = new Scanner(System.in);
        double radio,h,a,v;
        char o='s';
        while(o=='S' || o == 's'){
                System.out.println("Ingrese el radio del cilindro: ");
                radio=d.nextDouble();
                System.out.println("Ingrese la altura del cilindro: ");
                h=d.nextDouble();
                a=(2*Math.PI)*(radio*h)+(2*Math.PI)*Math.pow(radio,2);
                v=Math.PI*Math.pow(radio,2)*h;
                System.out.println("El area del cilindro es: "+a+" cm^2 ");
                System.out.println("El volumen del cilindro es: "+v+" cm^3");
                try {
                    Thread.sleep(5000);
                } 
                catch (InterruptedException e) {
                }
                System.out.println("Desea realizar otro calculo? S / N ");
                o=d.next().charAt(0);
        }
    }
}