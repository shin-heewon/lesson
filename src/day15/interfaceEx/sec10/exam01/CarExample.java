package day15.interfaceEx.sec10.exam01;

public class CarExample {

  public static void main(String[] args) {

    Tire tire = new HankookTire();
    Tire tire2 = new KumhoTire();

    //자동차 객체 생성
    Car car = new Car();

    //run() 메소드 실행
    car.run();

    System.out.println("=============================");

    //타이어 객체 교체
    car = new Car(tire);
    car.run();
    System.out.println("==============================");

    //run() 메소드 실행(다형성: 실행 결과가 다름)
    car = new Car(tire2);
    car.run();
  }
}