package day14.Inheritance.sec02.exam01;

public class SmartPhoneExample {

  public static void main(String[] args) {
    //SmartPhone 객체 생성
    SmartPhone smartPhone1 = new SmartPhone("갤럭시s24", "white");
    System.out.println(smartPhone1.getModel() + " " + smartPhone1.getColor());
    System.out.println();
    System.out.println("private 필드의 값 리셋은 setter를 통해서 초기화");
    smartPhone1.setColor("black");
    smartPhone1.setModel("아이폰 16 pro");
    System.out.println(smartPhone1.getModel() + " " + smartPhone1.getColor());

  }
}