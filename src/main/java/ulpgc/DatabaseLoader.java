package ulpgc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DatabaseLoader implements DatabaseLoaderInterface{
    private final Connection conn;
    private final static String SQL = "select * from persons";

    public DatabaseLoader(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Person> loadAll() {
        try {
            List<Person> result = new ArrayList<>();
            ResultSet resultSet = conn.createStatement().executeQuery(SQL);
            while(resultSet.next()){
                result.add(toPerson(resultSet));
            }
            return result;
        } catch (SQLException e) {
            return Collections.emptyList();
        }
    }

    private Person toPerson(ResultSet resultSet) throws SQLException {
        return new Person(resultSet.getInt("indice"), resultSet.getDouble("height"), resultSet.getDouble("weight"));
    }
}
