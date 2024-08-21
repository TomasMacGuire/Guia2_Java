import models.Empleado;

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
            }
        }

    }
    private static void menu(){
        System.out.println("\n------MENU DE OPCIONES------\n");
        System.out.println("1 - Ejercicio 1");
        System.out.println("");
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
}