package jdbc.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDelete {
    public static void main(String[] args) {
        Connection connection = null;

        // 1. JDBC 드라이버 등록: MYSQL DB 접근하기 위한 드라이버 등록
        try {
            connection = BoardConnection.getInstance().getConnection();



            String query = new StringBuilder()
                    .append("DELETE FROM boards ")
                    .append("where bno = ?").toString();

            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1,2);



            //4. sql문 실행(쿼리문을 담아 dbms로 요청 날림)
            int rows = pstmt.executeUpdate();
            System.out.println(rows + "rows deleted");
            //5. PreparedStatement 객체 닫기
            pstmt.close();



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection closed");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }


        }
    }
}
