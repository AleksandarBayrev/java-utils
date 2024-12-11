package aleksandarbayrev.java.utils.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface IPostgreSQLManager {
    Connection getConnection() throws SQLException ;
}

