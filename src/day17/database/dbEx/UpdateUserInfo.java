package day17.database.dbEx;

import day17.database.dbEx.dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUserInfo {

  static Connection con = null;

  public static void main(String[] args) {

    con = ConnectionFactory.getInstance().open();
    /*빌더패턴 이용*/
    String query = new StringBuilder()
        .append("UPDATE users SET ")
        .append("userage = ? , ")
        .append("useremail = ? ")
        .append("WHERE userid = ? ")
        .toString();//String으로 변환

    try {
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setInt(1, 20);
      pstmt.setString(2, "winter0715@gmail.com");
      pstmt.setString(3, "winter");

      int rows = pstmt.executeUpdate();
      System.out.println("수정된 행의 수 : " + rows);
      pstmt.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFactory.getInstance().close();
    }


  }

}
