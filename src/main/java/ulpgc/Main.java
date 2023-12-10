package ulpgc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(urlOf("bd_kata4.db"));
        DatabaseLoaderInterface database = new DatabaseLoader(conn);
        List<Person> people = database.loadAll();
        System.out.println("Index Height Weight \t");
        for(Person i : people){
            System.out.println(i.getIndex() + " " + i.getHeight() + " " + i.getWeight());
        }
    }

    private static String urlOf(String url) {
        return "jdbc:sqlite:" + url;
    }
}
