package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JPAMenu {
    private int option;

    public JPAMenu() {
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

            try {
                this.option = Integer.parseInt(br.readLine());
            } catch (IOException | NumberFormatException var3) {
                System.out.println("valor no vàlid");
                var3.printStackTrace();
            }
        } while(this.option != 1 && this.option != 2 && this.option != 3 && this.option != 4 && this.option != 5 && this.option != 6 && this.option != 7 && this.option != 8 && this.option != 9 && this.option != 10);

        return this.option;
    }
}
