package controller;

import model.Coches;

import javax.persistence.EntityManagerFactory;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

public class CochesController {

    private Connection connection;
    private EntityManagerFactory entityManagerFactory;

    public CochesController(Connection connection) {this.connection = connection;}

    public CochesController(Connection connection, EntityManagerFactory entityManagerFactory) {
        this.connection = connection;
        this.entityManagerFactory = entityManagerFactory;
    }

    public List<Coches> readCochesFile(String filenames) throws IOException {
        int
    }
}
