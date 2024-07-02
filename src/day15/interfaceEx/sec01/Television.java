package day15.interfaceEx.sec01;

public class Television implements RemoteControl {//리모컨을 통해서 TV의 전원을 켠다.

  @Override
  public void turnOn() {
    System.out.println("tv 전원을 켠다.");
  }
}