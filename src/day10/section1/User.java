package day10.section1;

public class User {//국적, 이름, 주민번호 필드 가진다. 이 필드 중 이름과 주민번호를 입력하여 객체를 생성할 수 있다.
  String nation;
  String name;
  String ssn;


  User() {
  }//디폴트 생성자

  User(String nation, String name, String ssn) {
    this.nation = nation;
    this.name = name;
    this.ssn = ssn;
  }

  User(String name, String ssn) {
    this.name = name;
    this.ssn = ssn;
  }
}
