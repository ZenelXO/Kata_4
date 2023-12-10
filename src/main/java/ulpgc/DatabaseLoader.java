package ulpgc;

import java.sql.Connection;
import java.util.List;

public class DatabaseLoader implements DatabaseLoaderInterface{
    private final Connection conn;
    private final static String SQL = "select * from person";

    public DatabaseLoader(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Person> loadAll() {
        return null;
    }
}
