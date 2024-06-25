package day10.section1;
/*class User1{ 클래스 내부에 public 클래스가 두 개일 수는 없다. 둘 중 하나만 public이어야 함.
//한 페이지에 클래스를 같이 보고 싶으면 아래와 같이 표시할 수도 있음
  String nation;
  String name;
  String ssn;


  User(){}//디폴트 생성자

  User(String nation, String name, String ssn) {
    this.nation = nation;
    this.name = name;
    this.ssn = ssn;
  }
}*/

public class UserMain {

  public static void main(String[] args) {
    User me = new User("대한민국", "신희원", "950305-0000000");
    System.out.println("국적 : " + me.nation + ", 이름 : " + me.name + ", 주민번호 : " + me.ssn);

  }
}
