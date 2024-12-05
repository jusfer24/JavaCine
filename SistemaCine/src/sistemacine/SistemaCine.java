package sistemacine;

import java.util.Scanner;

public class SistemaCine {
    public static void main(String[] args) {
        System.out.println("-   *Binvenido*   -");
        Scanner sc= new Scanner(System.in);
        Eventos fun= new Eventos();
        System.out.println("Nuestras Funciones Disponibles:");
        fun.verFunciones();

        System.out.println("Que funcion desea?:");
        int op = sc.nextInt();
        sc.nextLine();
        ListaEventos selec = fun.getFunciones().get(op - 1);
        System.out.println("Ingrese su nombre");
        String nombreCliente = sc.nextLine();
        System.out.print("Ingrese el número de cuenta : ");
        int numeroDeCuenta = sc.nextInt();
        System.out.print("Cuantos Boletos:  ");
        double cantidad = sc.nextInt();


        
    }
}
