package jdbc.board;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class BoardInsert {
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
                    "INSERT INTO boards(btitle,bcontent,bwriter,bdate,bfilename,bfiledata)" +
                    "VALUES(?,?,?,now(),?,?);";
            // 매개변수화된 sql문 작성
            PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

           pstmt.setString(1, "봄이로구나");
           pstmt.setString(2, "봄이오는데 구경은 못하고 강의실에서 잡혀서 jdbc 프로그래밍을 하는 나");
           pstmt.setString(3, "ksm");
           pstmt.setString(4, "spring.jpg");
           pstmt.setBlob(5, new FileInputStream("src/images/spring.jpg"));

            //4. sql문 실행(쿼리문을 담아 dbms로 요청 날림)
            int rows = pstmt.executeUpdate();
            System.out.println(rows + "rows inserted");

            //bno 값 가져오기
            if(rows == 1){
                ResultSet rs = pstmt.getGeneratedKeys();
                if(rs.next()){
                    int bno = rs.getInt(1);
                    System.out.println(bno);
                }
                rs.close();
            }
            //5. PreparedStatement 객체 닫기
            pstmt.close();



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
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
