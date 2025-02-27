package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class PracticeConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection connection = null;
        try {


            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=Asia/Seoul","sakila","sakila");
            System.out.println("connection ok" + connection);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(connection != null) {
                try {
                    connection.close();
                    System.out.println("connection closed");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }


        }

        }

    }

