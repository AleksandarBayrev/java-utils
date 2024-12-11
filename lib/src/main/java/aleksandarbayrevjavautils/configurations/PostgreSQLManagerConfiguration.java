package aleksandarbayrevjavautils.configurations;

public class PostgreSQLManagerConfiguration {
    public final String Host;
    public final String Username;
    public final String Password;
    public final String Port;
    public final String Database;
    public final boolean IsUsingSSL;

    public PostgreSQLManagerConfiguration(
        String Host,
        String Username,
        String Password,
        String Port,
        String Database,
        boolean IsUsingSSL
    ) {
        this.Host = Host;
        this.Username = Username;
        this.Password = Password;
        this.Port = Port;
        this.Database = Database;
        this.IsUsingSSL = IsUsingSSL;
    }
}
