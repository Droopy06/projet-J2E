package project.models;

/**
 * Created by LAMOOT Alexandre on 17/12/15.
 */
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String NAME_BDD = "Projecturl";
    private static final String USER_BDD = "root";
    private static final String PASSWORD_BDD = "";
    private static java.sql.Connection  CONN = null;

    public static java.sql.Connection connection() throws SQLException {
        try {
            Class.forName("org.h2.Driver");
            CONN = DriverManager.getConnection("jdbc:h2:~/" + NAME_BDD, USER_BDD, PASSWORD_BDD);
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur dans la connexion de la BDD");
            e.printStackTrace();
        }
        return CONN;
    }

    public static void disconnection() {
        try {
            CONN.close();
        } catch (SQLException e) {
            System.out.println("Erreur dans la fermeture de la BDD");
            e.printStackTrace();
        }
    }

    public static java.sql.Connection getConnexion() throws SQLException {
        return CONN;
    }
}