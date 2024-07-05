package day16.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

  public static void main(String[] args) {
    System.out.println("==회원 정보 입력 후 조회===");
    //회원의 정보를 사용자 받는 기능  (static 메소드로)
    //Member 클래스(VO)
    //memberInsert( Member member );
    memberSearch();
    System.out.println("==회원 정보수정 후 조회===");
    memberUpdate();
    memberSearch();
    System.out.println("==회원 정보삭제 후 조회===");
    memberDelete();
    memberSearch();

  }

  private static void memberDelete() {
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "1234";
    String query = "DELETE FROM member where id = ? ";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      pstmt = con.prepareStatement(query);

      pstmt.setInt(2, 1);

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 완전 잘 수정 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 수정이 실패하였습니다.");
      }

      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  private static void memberUpdate() {
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "1234";
    String query = "UPDATE member SET job = ? where id = ? ";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      pstmt = con.prepareStatement(query);

      pstmt.setString(1, "engineer");
      pstmt.setInt(2, 1);

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 완전 잘 수정 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 수정이 실패하였습니다.");
      }

      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }

  private static void memberInsert() {
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "1234";
    String query = "INSERT INTO member VALUES(?,?,?)";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      pstmt = con.prepareStatement(query);
      pstmt.setInt(1, 4);
      pstmt.setString(2, "kss");
      pstmt.setString(3, "professor");

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 입력되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 입력이 실패하였습니다.");
      }

      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }


  }


  public static void memberSearch() {
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "1234";
    String query = "SELECT * FROM member";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while (rs.next()) {
        int id = rs.getInt("id");

        String name = rs.getString("name");
        String job = rs.getString("job");
        System.out.printf("id : %d name : %s  job : %s", id, name, job);
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }

}
  /*public static void main(String[] args) {

    mySqlConnection();


  }//end main

  *//*public static void mySqlConnection2(){
    String url = "jdbc:mysql://localhost:3306/employees";//+ ?characterEncoding=UTF-8&serverTimezone=UTC
    String userName = "root";
    String password = "mysql1234";

    String query = "SELECT * FROM member WHERE id = 1";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try(
        con = DriverManager.getConnection(url, userName,
        password);//값을 알맞게 넣어주면 통로, 도로가 생성됨,, 포트를 열고 들어감
        stmt = con.createStatement(); //통로를 달리는 자동차 생성,

        rs = stmt.executeQuery(
            query);//자동차에 쿼리를 실어서 서버로 보냄(execute),, 응답은 resultSet객체에 담아서 보냄
        rs.next();
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String job = rs.getString("job");

        System.out.printf("id : %d, name : %s, job : %s", id, name, job);
    ) {


    }catch (SQLException e){
      System.err.println(e.getMessage());
    }
  }*//*

  public static void mySqlConnection() {
    //String url = "jdbc:mysql://localhost:3306/employees";
    String url = "jdbc:mysql://localhost:3306/employees";//+ ?characterEncoding=UTF-8&serverTimezone=UTC
    String userName = "root";
    String password = "mysql1234";

    String query = "SELECT * FROM member WHERE id = 1";

    try {
      Connection con = DriverManager.getConnection(url, userName,
          password);//값을 알맞게 넣어주면 통로, 도로가 생성됨,, 포트를 열고 들어감
      Statement stmt = con.createStatement(); //통로를 달리는 자동차 생성,

      ResultSet rs = stmt.executeQuery(
          query);//자동차에 쿼리를 실어서 서버로 보냄(execute),, 응답은 resultSet객체에 담아서 보냄
      rs.next();

      while (rs.next()) {//테이블에서 커서를 이동시켜서 이동할 값이 없을 때까지(false 될 때까지) 커서를 이동시킴.
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String job = rs.getString("job");
        System.out.printf("id : %d, name : %s, job : %s", id, name, job);
      }//while end

      rs.close();
      stmt.close();
      con.close();

    } catch (Exception e) {//실패할 수도 있기 때문에 안전하게 프로그램을 종료할 수 있도록 예외 처리해 줌
      e.getMessage();
      e.getStackTrace();
    }
  }

}*/
