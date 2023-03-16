package controller;

import model.Coches;
import model.Marca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CochesController {

    private Connection connection;
    private EntityManagerFactory entityManagerFactory;

    public CochesController(Connection connection) {this.connection = connection;}

    public CochesController(Connection connection, EntityManagerFactory entityManagerFactory) {
        this.connection = connection;
        this.entityManagerFactory = entityManagerFactory;
    }

    /**
     * Permite leer los archivos csv y crear un objeto con la información del archivo
     * @param  Coches Pasar la ruta del archivo csv
     * @return
     * @throws IOException
     */
    public List<Coches> readCochesFile(String Coches) throws IOException {
        int id_marca;
        String carroceria;
        String combustible;
        int plazas;
        int precio;

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
