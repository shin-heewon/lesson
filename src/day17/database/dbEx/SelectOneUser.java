package day17.database.dbEx;

import day17.database.dbEx.dbconf.ConnectionFactory;
import day17.database.dbEx.vo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOneUser {

  static Connection con = null;
  static ResultSet rs = null;

  public static void main(String[] args) {

    String query =
        "SELECT userid, username, userage, useremail " +
            "FROM users " +
            "WHERE userid=?";
    con = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, "winter");
      rs = pstmt.executeQuery();
      if (rs.next()) {
        User user = new User();
        user.setUserId(rs.getString("userid"));
        user.setUserName(rs.getString("username"));
        user.setUserAge(rs.getInt("userage"));
        user.setUserEmail(rs.getString("useremail"));
        System.out.println(user.toString());
        System.out.println("회원아이디 : " + user.getUserId());
      } else {
        System.out.println("해당 회원은 존재하지 않습니다.");
      }

      rs.close();
      pstmt.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFactory.getInstance().close();
    }

  }

}
