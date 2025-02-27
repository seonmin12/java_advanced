package jdbc.users;
// 사용자 입력 자바 클래스

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsert {
    public static void main(String[] args) {
        Connection connection = null;

        // 1. JDBC 드라이버 등록: MYSQL DB 접근하기 위한 드라이버 등록
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok!");

            // 2. mysql DB에 연결객체를 얻어와서 연결하기
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssg?serverTimezone=Asia/Seoul", "root", "seonmin12");
            System.out.println("Connection OK" + connection);

            //3. 매개변수화된 sql문 작성
            String query = ""+
                           "INSERT INTO users(userid,username,userpassword,userage,useremail)" +
                           "VALUES(?,?,?,?,?);";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1,"mycaptain1");
            pstmt.setString(2,"서유미");
            pstmt.setString(3,"1234");
            pstmt.setInt(4,30);
            pstmt.setString(5,"mycaptain@gmail.com");

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
