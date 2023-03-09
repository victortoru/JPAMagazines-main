package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
public class JPAMain {
    public static void main(String[] args) throws IOException, SQLException, ParseException {
        JPAMenu menu = new JPAMenu();

        ConnectionFactory connectionFactory = ConnectionFactory.getInstance();
        Connection c = connectionFactory.connect();

        MagazineController magazineController = new MagazineController(c);
        ArticleController articleController = new ArticleController(c);
        AuthorController authorController = new AuthorController(c);
        CiudadController ciudadController = new CiudadController(c);
        CochesController cochesController = new CochesController(c)

        int option = menu.mainMenu();
        while (option > 0 && option < 12) {
            switch (option) {
                case 1:
                    dbController.createTables();
                    break;

                case 2:
                    dbController.rellenarTablas();
                    break;
            }
        }
    }
}