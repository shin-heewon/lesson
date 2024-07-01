package day14.Inheritance.sec04.exam02;

public class SportsCar extends Car {

  @Override
  public void speedUp() {
    speed += 10;
  }

  // final 붙은 메소드는 오버라이딩을 할 수 없음

  public void stop11() {//메소드 이름을 달리 함. 즉 새로운 메서드를 만듬
    System.out.println("스포츠카를 멈춤");
    speed = 0;
  }
}