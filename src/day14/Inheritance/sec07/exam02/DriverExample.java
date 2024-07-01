package day14.Inheritance.sec07.exam02;

public class DriverExample {

  public static void main(String[] args) {
    //Driver 객체 생성
    Driver driver = new Driver();

    //매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
    Bus bus = new Bus();
    driver.drive(bus);

    //매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
    Taxi taxi = new Taxi();

    driver.drive(taxi);
  }
}

//택시와 버스를 운전할 수 있는 기사가 있다. => 택시, 버스, 기사 객체 필요함
//기사가 낮에는 택시, 밤에는 버스를 운전하도록 클래스를 설계하고 기능을 구현해주세요. => 운전이라는 공통점=> 운송수단이라는 상속관계 만들기