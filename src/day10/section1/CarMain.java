package day10.section1;

public class CarMain {/*Car클래스 객체를 생성하여 실행하는 클래스*/

  public static void main(String[] args) {
    //자동차 클래스 ==> 자동차 객체 한 개를 생성하세요
    Car volvo = new Car();

    //volvo 자동차의 값을 출력하세요
    System.out.println("company : " + volvo.company);
    System.out.println("model " + volvo.model);
    System.out.println("color " + volvo.color);
    System.out.println("carNumber " + volvo.carNumber);
    System.out.println("maxSpeed " + volvo.maxSpeed);


    /*생성자 오버로딩*/
    Car myCar = new Car("현대기아", "뉴카니발", "white");
    System.out.println("company : " + myCar.company);
    System.out.println("model " + myCar.model);
    System.out.println("color " + myCar.color);

  }

}
