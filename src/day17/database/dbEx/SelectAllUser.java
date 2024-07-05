package day17.database.dbEx;

import day17.database.dbEx.dbconf.ConnectionFactory;
import day17.database.dbEx.vo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectAllUser {

  static Connection con = null;
  static ResultSet rs = null;
  static ArrayList<User> userList = new ArrayList<User>();

  public static void main(String[] args) {

    String query = "SELECT * FROM users";
    con = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = con.prepareStatement(query);

      rs = pstmt.executeQuery();
      while (rs.next()) {
        User user = new User();
        user.setUserId(rs.getString("userid"));
        user.setUserName(rs.getString("username"));
        user.setUserAge(rs.getInt("userage"));
        user.setUserEmail(rs.getString("useremail"));

        userList.add(user);

      }
      for (User user : userList) {
        System.out.println("회원아이디 : " + user.getUserId());
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
