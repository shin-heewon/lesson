package day14.Inheritance.sec02.exam02;

public class SmartPhoneExample {


  public static void main(String[] args) {
    //SmartPhone 디폴트 생성자를 이용한 객체 생성과 필드값 세팅&읽기
    SmartPhone smartPhone1 = new SmartPhone();

    smartPhone1.setModel("iphone-16 Pro");
    smartPhone1.setColor("yellow");
    System.out.println(smartPhone1.getModel() + " " + smartPhone1.getColor());

    System.out.println("==============================");

    //SmartPhone 생성자 오버로딩을 이용한 객체 생성과 필드값 세팅&읽기
    SmartPhone smartPhone2 = new SmartPhone("iphone-16 Pro", "pink", true);

    System.out.println(
        smartPhone2.getModel() + " " + smartPhone2.getColor() + " " + smartPhone2.getWifi());

  }
}