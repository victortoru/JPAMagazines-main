package controller;

import model.Vendedor;

import javax.persistence.EntityManagerFactory;
import java.sql.Connection;
import java.util.List;

public class VendedorController {
    public VendedorController(Connection connection, EntityManagerFactory entityManagerFactory) {
    }

    public List<Vendedor> readArticlesFile(String s) {
        return null;
    }

    public void addVendedor(Vendedor vendedor) {
    }
}
