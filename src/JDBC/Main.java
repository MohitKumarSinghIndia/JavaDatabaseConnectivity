package JDBC;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        try {
            UserDAO userDAO = new UserDAOImpl();

//            // Insert user
//            User newUser = new User(1, "Mohit", "Mohit@example.com");
//            userDAO.insertUser(newUser);
//            System.out.println("User inserted");
//
//            // Update user
//            newUser.setName("MohitThakur");
//            userDAO.updateUser(newUser);
//            System.out.println("User updated");
//
//            // Delete user
//            userDAO.deleteUser(newUser.getId());
//            System.out.println("User deleted");

//              // Get user by ID
//              User user = userDAO.getUserById(1);
//              System.out.println(user);

//            // Fetch all users
            List<User> users = userDAO.getAllUsers();
            users.forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
