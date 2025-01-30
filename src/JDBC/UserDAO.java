package JDBC;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    void insertUser(User user) throws SQLException;

    void updateUser(User user) throws SQLException;

    void deleteUser(int id) throws SQLException;

    List<User> getAllUsers() throws SQLException;

    User getUserById(int id) throws SQLException;
}