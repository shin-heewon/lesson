package day14.Inheritance.sec09.exam01;

public class PhoneExample {

  public static void main(String[] args) {
    Phone phone = new SmartPhone("SSG");//abstract 클래스는 new를 통해 실체화될 수(구현될 수) 없다!!=> 자식 객체 생성
    phone.turnOn();
    phone.calling();
    phone.sendVoice();//private로 선언된 smartPhone 객체 필드에 접근 가능!
    phone.receiveVoice();
    phone.turnOff();

  }
}