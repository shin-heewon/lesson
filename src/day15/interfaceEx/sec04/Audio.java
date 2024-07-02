package day15.interfaceEx.sec04;

public class Audio implements RemoteControl {

  //필드
  private int volume;

  @Override
  public void turnOn() {
    System.out.println("오디오를 켠다.");
  }

  @Override
  public void turnOff() {
    System.out.println("오디오를 끈다.");
  }

  @Override
  public void setVolume(int volume) {

    if (volume > day15.interfaceEx.sec03.RemoteControl.MAX_VOLUME) {
      this.volume = day15.interfaceEx.sec03.RemoteControl.MAX_VOLUME;
    } else if (volume < day15.interfaceEx.sec03.RemoteControl.MIN_VOLUME) {
      this.volume = day15.interfaceEx.sec03.RemoteControl.MIN_VOLUME;
    } else {
      this.volume = volume;
    }

    System.out.println("현재 오디오의 볼륨 : " + this.volume);
  }


  //필드
  private int rememberVolume;

  @Override
  public void setMute(boolean mute) {
    if (mute) {
      this.rememberVolume = this.volume;
      System.out.println("쉿 조용히");
      setVolume(MIN_VOLUME);
    } else {
      System.out.println("조용히 해제");
      setVolume(rememberVolume);
    }
  }

  //turnOn() 추상 메소드 오버라이딩

  //turnOff() 추상 메소드 오버라이딩

  //setVolume() 추상 메소드 오버라이딩

  //필드

  //디폴트 메소드 재정의

}