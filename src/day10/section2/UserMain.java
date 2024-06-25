package day10.section2;
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
    //System.out.println("국적 : " + me.nation + ", 이름 : " + me.name + ", 주민번호 : " + me.ssn);

    String oldmename = me.getName();
    String oldmessn = me.getSsn();

    //me 객체의 이름을 "홍길동"으로 변경하고 ssn을 1111111"로 변경
    me.setName("홍길동");
    me.setSsn("1111111111");
    //변경된 이름과 ssn을 조회하여 출력

    System.out.println("변경전 이름 : " + oldmename + ", 주민번호 : " + oldmessn);
    System.out.println("현재 이름 : " + me.getName() + ",주민번호 : " + me.getSsn());
  }
}
