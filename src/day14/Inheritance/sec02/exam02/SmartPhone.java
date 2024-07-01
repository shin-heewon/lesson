package day14.Inheritance.sec02.exam02;

public class SmartPhone extends Phone {

  private boolean wifi;

  public SmartPhone() {
  }

  //자식 생성자 선언, 부모의 필드 초기화하고 자신의 wifi필드를 초기화
  public SmartPhone(String model, String color, boolean wifi) {
    super(model, color);
    this.wifi = wifi;
  }

  public String getWifi() {
    if (this.wifi == true) {
      return "wifi 사용중";
    } else {
      return "wifi 꺼짐";
    }
  }

  public void setWifi(boolean wifi) {
    this.wifi = wifi;
    if (this.wifi == true) {
      System.out.println("wifi 상태정보 on");
    } else {
      System.out.println("wifi 상태정보 off");
    }
    
  }
}