package JDBC;

import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class UserDAOImpl implements UserDAO {
    private Connection connection;

    public UserDAOImpl () throws SQLException, IOException {
        this.connection = DBConnection.getConnection();
    }

    @Override
    public void insertUser(User user) throws SQLException {

    }

    @Override
    public void updateUser(User user) throws SQLException {

    }

    @Override
    public void deleteUser(int id) throws SQLException {

    }

    @Override
    public List<User> getAllUsers() throws SQLException {
        return List.of();
    }

    @Override
    public User getUserById(int id) throws SQLException {
        return null;
    }
}
