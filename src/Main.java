import models.Cuenta;
import models.Empleado;
import models.Libro;

import java.util.Scanner;

public class Main {
    static Scanner ingreso = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = -1;
        while (opcion != 0){
            menu();
            System.out.println("Ingrese una opcion...");
            opcion = ingreso.nextInt();
            switch (opcion){
                case 1:
                    ej1();
                    break;
                case 2:
                    ej2();
                    break;
                case 3:
                    ej3();
                    break;
            }
        }

    }
    private static void menu(){
        System.out.println("\n------MENU DE OPCIONES------\n");
        System.out.println("1 - Ejercicio 1");
        System.out.println("2 - Ejercicio 2");
        System.out.println("3 - Ejercicio 3\n");
        System.out.println("0 para salir");
        System.out.println("----------------------------");
    }

    private static void ej1(){
        Empleado e = new Empleado();
        e.setName("Carlos");
        e.setLastName("Gutierrez");
        e.setDni(2345634);
        e.setSalario(25000);

        Empleado o = new Empleado(3423412,"Ana","Sanchez",27500);


        System.out.println(e);
        System.out.println(o);

        e.setSalario(e.salPorPorcentaje(0.15));

        System.out.println("Salario de Carlos con un 15%: " + e.getSalario());
        System.out.println("Salario anual: "+ e.salarioAnual());

    }

    private static void ej2(){
        Cuenta c = new Cuenta()
                .name("Pedro")
                .balance(15000);
        int opcion = -1;
        double num;
        double saldo;

        while (opcion !=0){
            System.out.println("Indique una operacion para la cuenta: (0 para salir)");
            System.out.println("1- DEPOSITO DE DINERO");
            System.out.println("2- SUSTRACCION DE DINERO");
            System.out.println("3- MOSTRAR LA CUENTA");
            opcion = ingreso.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de dinero a depositar:");
                    num = ingreso.nextDouble();
                    saldo = c.credito(num);

                    System.out.println("El saldo de la cuenta es ahora de: " + saldo);

                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero a sustraer:");
                    num = ingreso.nextDouble();
                    saldo = c.debito(num);

                    System.out.println("El saldo de la cuenta es ahora de: "+saldo);
                    break;
                case 3:
                    c.imprimir();
                    break;
            }

        }

    }

    private static void ej3(){
        Libro primerLibro = new Libro()
                .titulo("El Quijote")
                .autor("Miguel de Cervantes")
                .precio(500)
                .copias(10);

        Libro segLibro = new Libro()
                .titulo("Cien años de soledad")
                .autor("Gabriel Garcia Marquez")
                .precio(700)
                .copias(5);

        System.out.println("" + primerLibro.toString());
        System.out.println("" + segLibro.toString());

        primerLibro.venta(3);
        System.out.println("" + primerLibro.toString());

        segLibro.venta(8);

        segLibro.sumaInventario(5);
        System.out.println("" + segLibro.toString());

    }





}