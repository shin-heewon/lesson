package day17.database.dbEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertEx {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/ssgdatabase";
    String id = "root";
    String pwd = "mysql1234";

    String query = "INSERT INTO users (userid, username, userage, useremail)"
        + "VALUES(?,?,?,?)";

    Connection con = null;

    try {
      con = DriverManager.getConnection(url, id, pwd);
      //PreparedStatement 객체 생성하여 쿼리문 넣기(상자에 쿼리 담기)
      PreparedStatement pstmt = con.prepareStatement(query);
      //PreparedStatement객체 파라미터?에 순서와 타입 확인하여 데이터 할당하기
      pstmt.setString(1, "winter");
      pstmt.setString(2, "서유미");
      pstmt.setInt(3, 10);
      pstmt.setString(4, "winter00@gmail.com");

      //SQL문 실행하기
      int rows = pstmt.executeUpdate();//성공하면 1, 실패하면 0 반환
      System.out.println("저장된 행의 수 : " + rows);

      pstmt.close();//PreparedStatement는 이 위치에서 바로 끊어주는 것이 좋음


    } catch (SQLException e) {
      System.err.println(e.getMessage());
      throw new RuntimeException(e);
    } finally {
      if (con != null) {
        try {
          con.close();
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
    }


  }

}
