package controller;

import model.Marca;

import javax.persistence.EntityManagerFactory;
import java.sql.Connection;
import java.util.List;

public class MarcaController {
    public MarcaController(Connection connection, EntityManagerFactory entityManagerFactory) {
    }

    public List<Marca> readArticlesFile(String s) {
        return null;
    }

    public void addMarca(Marca marca) {
    }
}
