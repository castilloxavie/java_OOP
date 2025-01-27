package ui;

import java.util.Scanner;

public class UiMenu {
    public static  void showMenu(){
        System.out.println("welcome to My Appointments");
        System.out.println("Seleccione la opción");

        int respose = 0;

        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            respose = Integer.valueOf(sc.nextLine());

            switch (respose){
                case 1:
                    System.out.println("Doctor");
                    break;

                case 2:
                    System.out.println("Patient");
                    break;

                case 0:
                    System.out.println("Salir");
                    break;
            }
        }while (respose !=0);

    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

}
