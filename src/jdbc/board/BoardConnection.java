package jdbc.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BoardConnection {
    private static final String url = "jdbc:mysql://localhost:3306/board";
    private static final String user = "root";
    private static final String password = "seonmin12";

    private static BoardConnection instance ;
    private Connection connection;

    private BoardConnection() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok!");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssg?serverTimezone=Asia/Seoul", "root", "seonmin12");
            System.out.println("Connection OK" + connection);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    // 싱글톤 인스턴스 반환 메소드
    // synchronized를 사용하여 한 번에 한 개의 스레드만 접근할 수 있도록 보장
    public static synchronized BoardConnection getInstance() throws SQLException, ClassNotFoundException {
        if(instance == null){
            instance = new BoardConnection();
        }
        return instance;


    }

    // Connection 반환 메소드
    public Connection getConnection() {
        return connection;
    }


}
