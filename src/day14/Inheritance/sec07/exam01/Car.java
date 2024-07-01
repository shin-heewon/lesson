package day14.Inheritance.sec07.exam01;

public class Car {

  //필드 선언
  public Tire tire;//타이어 달기-> 상속을 이용하여 여러 하위 객체를 주입해서 쓸 수 있는 필드!!

  public void running() {
    tire.roll();
  }


}