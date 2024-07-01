package day14.Inheritance.sec09.exam01;

public class SmartPhone extends Phone {

  private String receiveMemver;

  //생성자 선언
  SmartPhone() {
  }

  SmartPhone(String owner) {
    super(owner);
  }

  //메소드 선언
  void internetPlay() {
    System.out.println("인터넷 검색 기능을 실행합니다.");
  }


  @Override
  void sendVoice() {//abstract클래스 상속시 바디가 없는 추상메소드를 반드시 구현해놓아야 함.
    this.receiveMemver = "박다미";
    System.out.println(receiveMemver + "에게 보이스 메시지를 전달합니다.");
  }

  @Override
  void receiveVoice() {

  }
}