import java.util.Scanner;
public class proyecto{

Scanner sc = new Scanner(System.in);

    char op;
public void Ticket(){
        System.out.println("a.- Tipo de vehiculo");
        System.out.println("b.- Calcular Cambio");
        System.out.println("c.- Imprimir ticket");
        op = entrada.next().charAt(0);

        switch (op){
            case 'a':
                //implementar metodos independientes para cada opcion 
                Tipodevehiculo();
                break;

            case 'b':
                Calcularcambio();
                break;

            case 'c':
                Imprimirticket();
                break;

                default: 
                System.out.println("Intente de nuevo");
            }
        }

        Scanner entrada = new Scanner(System.in);
      String tipo, ingreso;
      int tipo1, cambio, cobro;

      public void Tipodevehiculo(){
        tipo = System.console().readLine("Tipo de vehiculo \n 1:Auto \n 2:Moto \n 3:camion \n 4:trailer ");

        tipo1 = Integer.parseInt(tipo);
        switch (tipo1) {
            case 1:
                cobro = 50;
                break;
            case 2:
                cobro = 25;
                break;
            case 3:
                cobro = 75;
                break;
            case 4:
                cobro = 100;
                break;
            default:
                System.out.println("Intentelo de nuevo");

        }
    
     }
    public void Calcularcambio() {
        ingreso = System.console().readLine("¿Cuanto ingreso?");
        cambio = Integer.parseInt(ingreso);
        int cambio1 = cambio - cobro;
        System.out.println("El cambio es de: " + cambio1);
    }

    public void Imprimirticket() {
        System.out.println("Caseta");
        System.out.println("Tipo de vehiculo: " + tipo);
        System.out.println("Cantidad de ingreso: " + cobro);

    }

     } 
