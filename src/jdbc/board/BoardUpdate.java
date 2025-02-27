package jdbc.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdate {
    public static void main(String[] args) {
        Connection connection = null;

        // 1. JDBC 드라이버 등록: MYSQL DB 접근하기 위한 드라이버 등록
        try {
            connection = BoardConnection.getInstance().getConnection();
            if(connection == null) {
                System.out.println("연결실패");
            }



            String query = new StringBuilder()
                    .append("UPDATE boards SET ")
                    .append("btitle = ?,")
                    .append("bcontent = ?,")
                    .append("bfilename = ?")
                    .append("where bno = ? ")
                    .toString();

            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1,"날이 따뜻해서");
            pstmt.setString(2,"집에 가고 싶은걸?");
            pstmt.setString(3,"src/images/hr.png");
            pstmt.setInt(4,1);



            //4. sql문 실행(쿼리문을 담아 dbms로 요청 날림)
            int rows = pstmt.executeUpdate();
            System.out.println(rows + "rows inserted");
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
