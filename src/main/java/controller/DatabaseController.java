package controller;

import model.Ciudad;
import model.Coches;
import model.Marca;
import model.Vendedor;

import javax.persistence.EntityManagerFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DatabaseController {
    private Connection connection;
    EntityManagerFactory entityManagerFactory;
    CiudadController ciudadController;
    CochesController cochesController;
    MarcaController marcaController;
    VendedorController vendedorController;
    Scanner sc = new Scanner(System.in);

    public DatabaseController(Connection connection) {
        this.connection = connection;
    }

    public DatabaseController(Connection connection, EntityManagerFactory entityManagerFactory) {
        this.connection = connection;
        this.entityManagerFactory = entityManagerFactory;
        this.ciudadController = new CiudadController(connection, entityManagerFactory);
        this.cochesController = new CochesController(connection, entityManagerFactory);
        this.marcaController = new MarcaController(connection, entityManagerFactory);
        this.vendedorController = new VendedorController(connection, entityManagerFactory);
    }

    public void crearTablas() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/schema.sql"))) {
            PreparedStatement pr = connection.prepareStatement(br.lines().collect(Collectors.joining(" \n")));
            pr.execute();
            System.out.println("Creada");
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("schema.sql: " + e.getMessage());
        }
    }

    public void insertarDatos() throws IOException {

        List<Coches> coches = cochesController.readArticlesFile("src/main/resources/Coches.csv");
        List<Vendedor> vendedores = vendedorController.readArticlesFile("src/main/resources/Vendedor.csv");
        List<Ciudad> ciudades = ciudadController.readArticlesFile("src/main/resources/Ciudad.csv");
        List<Marca> marcas = marcaController.readArticlesFile("src/main/resources/Marca.csv");

        for (Coches coche : coches) {
            cochesController.addCoche(coche);
        }

        for (Vendedor vendedor : vendedores) {
            vendedorController.addVendedor(vendedor);
        }

        for (Ciudad ciudad : ciudades) {
            ciudadController.addCiudades(ciudades);
        }

        for (Marca marca : marcas) {
            marcaController.addMarca(marca);
        }
        System.out.println("Insertadas");

    }







}