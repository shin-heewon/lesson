package day14.Inheritance.sec09.exam01;

public abstract class Phone {

  //필드 선언
  String owner;

  //생성자 선언
  Phone() {
  }

  public Phone(String owner) {
    this.owner = owner;
  }

  abstract void sendVoice();//{}바디가 없는 추상 메서드 : 디자인 개념 => 하위 클래스에서 반드시! 구현해줘야함.

  abstract void receiveVoice();

  void calling() {
  }

  ; //바디 내용은 없어도 {} 설정이 되면 구현된 메서드이다.

  //메소드 선언
  void turnOn() {
    System.out.println("폰 전원을 켭니다.");
  }

  void turnOff() {
    System.out.println("폰 전원을 끕니다.");
  }
}