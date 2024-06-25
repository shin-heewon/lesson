package day10.section1;

public class Car {

  //필드 선언, 회사, 모델, 차량번호, 차량색상, 최대속력, 속력
  String company = "Volvo";
  String model = "V3-1003";
  String carNumber = "1234567";
  String color = "black";
  int maxSpeed = 300;
  int speed;

  /*생성자 오버로딩*/

  Car() {//디폴트 생성자, 지정하지 않아도 컴파일러가 자동으로 붙여줌, 클래스의 이름과 보통 같음
    //참고로 생성자 오버로딩 하면 디폴드 생성자를 자동으로 생성해주지 않음
  }

  Car(String company, String model, String color) {
    this.company = company;
    this.model = model;
    this.color = color;
  }

  // 메소드 선언

}
