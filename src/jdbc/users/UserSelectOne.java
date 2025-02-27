package jdbc.users;
// 사용자 입력 자바 클래스

import java.sql.*;

public class UserSelectOne {
    public static void main(String[] args) {
        Connection connection = null;
        ResultSet rs = null;

        // 1. JDBC 드라이버 등록: MYSQL DB 접근하기 위한 드라이버 등록
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok!");

            // 2. mysql DB에 연결객체를 얻어와서 연결하기
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssg?serverTimezone=Asia/Seoul", "root", "seonmin12");
            System.out.println("Connection OK" + connection);

//            //3. 매개변수화된 sql문 작성


            String query = new StringBuilder()
                    .append("SELECT * FROM users ")
                    .append("WHERE userid = ? ")
                    .toString();

            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1,"ssgcom1");



            //4. sql문 실행(쿼리문을 담아 dbms로 요청 날림)
            rs = pstmt.executeQuery();

            if(rs.next()) {
                User user = new User();
                user.setUserid(rs.getString("userid"));
                user.setUsername(rs.getString("username"));
                user.setUserpassword(rs.getString("userpassword"));
                user.setAge(rs.getInt("userage"));
                user.setEmail(rs.getString("useremail"));
                System.out.println(user);
            }else{
                System.out.println("가입된 회원이 아닙니다.");
            }
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
