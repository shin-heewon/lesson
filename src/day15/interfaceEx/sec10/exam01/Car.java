package day15.interfaceEx.sec10.exam01;

public class Car {

  //필드
  Tire tire1 = new HankookTire();
  Tire tire2 = new KumhoTire();

  public Car() {
  }

  public Car(Tire tire1) {
    this.tire1 = tire1;
  }


  //메소드
  void run() {
    tire1.roll();
    tire2.roll();
  }
}