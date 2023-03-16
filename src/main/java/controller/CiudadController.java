package controller;

import model.Ciudad;
import model.Coches;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CiudadController {
    public CiudadController(Connection connection, EntityManagerFactory entityManagerFactory) {
    }

    public List<Ciudad> readCochesFile(String Ciu) throws IOException {
        int ;
        String carroceria;

        BufferedReader br = new BufferedReader(new FileReader(Coches));
        String linea = "";
        List<Coches>cochesList = new ArrayList<>();
        //List<Marca>marcaList = marcaController.readArticlesFile("src/main/resources/Marca.csv");

        while ((linea = br.readLine()) !=null) {
            StringTokenizer str = new StringTokenizer(linea, ",");
            id_marca = Integer.parseInt(str.nextToken());
            carroceria = str.nextToken();
            combustible = str.nextToken();
            plazas = Integer.parseInt(str.nextToken());
            precio = Integer.parseInt(str.nextToken());

            cochesList.add(new Coches(carroceria,combustible,id_marca,plazas,precio));
        }
        br.close();

        return cochesList;
    }
    public void addCoches(Coches coches) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.merge(coches);
        em.getTransaction().commit();
        em.close();
    }
}
