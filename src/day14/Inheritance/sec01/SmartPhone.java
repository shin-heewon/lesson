package day14.Inheritance.sec01;

public class SmartPhone extends Phone {

  //필드 선언

  //생성자 선언를 선언해서 부모인 Phone의 필드를 생성자를 통해 해당 SmartPhone 생성자 내에서 초기화 하시오.

  public SmartPhone(String model, String color) {
    //super(model, color);,, 이렇게도 가능함.

    super();
    this.model = model;
    this.color = color;

    System.out.println("SmartPhone(String model, String color)생성자 실행하여 초기화 완료");
  }

  //메소드 선언


  @Override
  protected void bell() {
    super.bell();
  }

  @Override
  protected void sendVoice(String message) {
    super.sendVoice(message);
  }

  @Override
  protected void receiveVoice(String message) {
    super.receiveVoice(message);
  }

  @Override
  protected void hangUp() {
    super.hangUp();
  }
}