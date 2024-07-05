package day17.database.dbEx.dbconf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {

  //ConnectionFactory에서 Mysql server로 부터 CONNECTION을 얻어오는 open()메소드 작성
  //조건 : 싱글톤 패턴 적용하여 만들기

  private Connection con = null;
  private String url = "jdbc:mysql://localhost:3306/ssgdatabase";
  private String id = "root";
  private String pwd = "mysql1234";

  //값이 바뀌지 않고, 바꿀 수 없도록 private static final로 선언
  private static final ConnectionFactory instance = new ConnectionFactory();

  private ConnectionFactory() {
  }

  public static ConnectionFactory getInstance() {
    return instance;
  }


  public Connection open() {
    try {
      con = DriverManager.getConnection(url, id, pwd);
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } finally {

    }
    return con;
  }


  public void close() {

    try {
      con.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }

  }


}
