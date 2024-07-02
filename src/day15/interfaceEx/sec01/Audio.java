package day15.interfaceEx.sec01;

public class Audio implements RemoteControl {//인터페이스를 상속받으면 추상메소드 반드시 구현해야함!


  @Override
  public void turnOn() {
    System.out.println("오디오의 전원을 켠다.");
  }


}