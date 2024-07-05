package day17.database.dbEx;

import day17.database.dbEx.dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUserInfo {

  static Connection con = null;

  public static void main(String[] args) {

    con = ConnectionFactory.getInstance().open();
    /*빌더패턴 이용*/
    String query = new StringBuilder()
        .append("DELETE FROM users ")
        .append("WHERE userid = ? ")
        .toString();//String으로 변환

    try {
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, "winter");

      int rows = pstmt.executeUpdate();
      System.out.println("삭제된 행의 수 : " + rows);
      pstmt.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFactory.getInstance().close();
    }


  }

}
