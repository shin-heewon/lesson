package day14.Inheritance.sec07.exam01;

public class CarExample {

  public static void main(String[] args) {
    //Car 객체 생성
    Car myCar = new Car();

    //Tire 객체 장착
    myCar.tire = new Tire();
    myCar.running();

    //HankookTire 객체 장착
    myCar.tire = new HankookTire();
    myCar.running();

    //KumhoTire 객체 장착
    myCar.tire = new KumhoTire();
    myCar.running();

  }
}