package aleksandarbayrev.java.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import aleksandarbayrev.java.utils.configurations.PostgreSQLManagerConfiguration;
import aleksandarbayrev.java.utils.interfaces.IPostgreSQLManager;

public class PostgreSQLManager implements IPostgreSQLManager {
    private final PostgreSQLManagerConfiguration _configuration;

    public PostgreSQLManager(PostgreSQLManagerConfiguration configuration) {
        _configuration = configuration;
    }

    @Override
    public Connection getConnection() throws SQLException {
        try {
            var _connectionProperties = new Properties();
            _connectionProperties.setProperty("host", "jdbc:postgresql://"+_configuration.Host+":"+_configuration.Port+"/"+_configuration.Database);
            _connectionProperties.setProperty("user", _configuration.Username);
            _connectionProperties.setProperty("password", _configuration.Password);
            _connectionProperties.setProperty("ssl", _configuration.IsUsingSSL ? "true" : "false");
            return DriverManager.getConnection(_connectionProperties.getProperty("host"), _connectionProperties);
        } catch (SQLException ex) {
            throw ex;
        }
    }

}
