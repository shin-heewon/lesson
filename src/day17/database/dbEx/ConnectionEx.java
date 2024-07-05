package day17.database.dbEx;

import java.sql.Connection;
import java.sql.*;

public class ConnectionEx {

  private static Connection connection = null;
  private static String url = "jdbc:mysql://localhost:3306/ssgdatabase";
  private static String id = "root";
  private static String pwd = "mysql1234";

  public static void main(String[] args) {

    try {//ctr+alt+t : try-catch 단축키

      //JDBC 드라이버 등록
      Class.forName("com.mysql.cj.jdbc.Driver");

      //연결하기
      connection = DriverManager.getConnection(url, id, pwd);
      System.out.println("connection 객체값 = " + connection);

    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());

    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } finally {//무조건 수행되는 구문
      if (connection != null) {
        try {
          connection.close();//연결 끊기, close()는 예외처리를 반드시 요구하는 메소드이다.
          System.out.println("서버와의 연결이 끊겼습니다.");
        } catch (SQLException e) {
          System.err.println(e.getMessage());
        }
      }
    }
  }
}
