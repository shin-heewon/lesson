package day14.Inheritance.sec02.exam01;

public class SmartPhone extends Phone {

  //자식 생성자 선언
  public SmartPhone() {
  }

  //private이므로 생성자를 통해서만 초기화가 가능하다!
  public SmartPhone(String model, String color) {
    super(model, color);
    System.out.println("SnartPhone의 String model, String color 초기화 완료");
  }


}