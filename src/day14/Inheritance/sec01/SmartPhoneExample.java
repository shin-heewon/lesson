package day14.Inheritance.sec01;

public class SmartPhoneExample {

  public static void main(String[] args) {
    //1. SmartPhone 객체 생성
    SmartPhone smartPhone1 = new SmartPhone("갤럭시24", "Black");
    //2. Phone으로부터 상속받은 필드 읽기
    System.out.println(smartPhone1.model + " " + smartPhone1.color);
    //3.Phone으로부터 상속받은 메소드 호출
    smartPhone1.sendVoice("안녕 친구야. 이번주 토요일 몇 시에 만날까?");
    smartPhone1.receiveVoice("시 어때");
    smartPhone1.bell();
    smartPhone1.hangUp();
    //SmartPhone의 필드 읽기
    //SmartPhone의 메소드 호출

  }
}