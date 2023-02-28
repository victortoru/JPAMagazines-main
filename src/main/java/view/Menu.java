package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class

Menu {
    private int option;

    public Menu() {
        super();
    }

    public int mainMenu() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println(" \nMENU PRINCIPAL \n");
            System.out.println("Escull una opció: ");
            System.out.println("1. Crea las tablas en la BD");
            System.out.println("2. Insertar Info en las Tablas");
            System.out.println("3. Muestra la información de las tablas");
            System.out.println("4. Eliminar tablas");
            System.out.println("5. Filtrar Información");
            System.out.println("6. Modificat Info de las tablas");
            System.out.println("7. Modificat Info de las tablas");
            System.out.println("8. Mostrar Tablas");
            System.out.println("9. Filtrar Información");
            System.out.println("10. Sortir");

            System.out.println("Esculli opció: ");
            try {
                option = Integer.parseInt(br.readLine());
            } catch (NumberFormatException | IOException e) {
                System.out.println("valor no vàlid");
                e.printStackTrace();
            }
        } while (option != 1  && option != 0);

        return option;
    }
}