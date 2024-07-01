package day14.Inheritance.sec07.exam02;

public class Driver {

  //메소드 선언(클래스 타입의 매개변수를 가지고 있음)
  public void drive(Vehicle vehicle) {
    vehicle.run();//어떤 타입이 들어와도 다 운전 할 수 있음!
  }

}