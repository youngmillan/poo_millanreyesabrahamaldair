import java.util.Scanner;
public class mayormenor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a,b,c;
            System.out.println("Ingrese el primer numero");
            a=entrada.nextInt();
            System.out.println("Ingrese el Segundo numero");
            b=entrada.nextInt();
            while(a==b){
                System.out.println("No puede ser el mismo numero, ingrese un numero diferente :");
                b=entrada.nextInt();    
            }    
            System.out.println("Ingrese el Tercer numero");
            c=entrada.nextInt();
            while(c==b || c==a){
                System.out.println("No puede ser el mismo numero, ingrese un numero diferente :");
                c=entrada.nextInt();    
            }
        if(a>b && a>c){
            System.out.println("El numero mayor es "+a);
        }else{
            if(b>c && b>a){
                System.out.println("El numero mayor es "+b);        
            }else{
                    System.out.println("El numero mayor es "+c);
            }
        }
        
    }
    
}