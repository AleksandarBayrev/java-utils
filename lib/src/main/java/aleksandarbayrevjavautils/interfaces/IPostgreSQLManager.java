package aleksandarbayrevjavautils.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface IPostgreSQLManager {

    /**
     * Generates a new connection
     * @returns java.sql.Connection
     * @throws SQLException
     */
    Connection getConnection() throws SQLException;
}

