package day15.interfaceEx.sec07;

public interface RemoteControl {

  int MIN_VOLUME = 0;
  int MAX_VOLUME = 30;


  //추상 메소드
  void turnOn();

  void turnOff();


  //default메서드로 setVolume()을 구현
  default void setVolume(int volume) {
    System.out.println("===볼륨 조정===");
    this.setVolume(volume);
  }


  default void setMute(boolean mute) {
    if (mute) {
      System.out.println("쉿 조용히!");
      setVolume(MIN_VOLUME);
    } else {
      System.out.println("무음 해제");
      //setVolume();
    }
  }


}