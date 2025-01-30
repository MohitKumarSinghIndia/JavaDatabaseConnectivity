package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class DBConnection {
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException, IOException {
        if(connection != null){
            System.out.println("Already Connected!");
            return connection;
        }

        Properties properties = new Properties();
        try (InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (input == null) {
                throw new IOException("Unable to find db.properties file");
            }
            properties.load(input);
        }

        String url = properties.getProperty("db.url");
        String user = properties.getProperty("db.user");
        String password = properties.getProperty("db.password");

        connection = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to Database!");
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("Disconnected from Database!");
        }
    }
}
