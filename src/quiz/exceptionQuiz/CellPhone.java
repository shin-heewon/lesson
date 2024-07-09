package quiz.exceptionQuiz;

public class CellPhone {

  String model;
  double battery;

  public CellPhone(String model) {
    this.model = model;
  }

  public void charge(int time) throws IllegalArgumentException {
    try {
      if (time < 0) {
        throw new IllegalArgumentException("충전시간입력오류1 ");
      } else {
        System.out.println("충전 시간  : " + time + "분");

        battery += (double) time * 3;
        if (battery > 100) {
          battery = 100.0;
        }
      }
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage() + "충전시간입력오류2");
    }

  }


  void printBattery() {
    System.out.printf("남은 배터리 양 : %.1f\n", battery);
  }

  void call(int time) throws IllegalArgumentException {
    try {
      if (time < 0) {
        throw new IllegalArgumentException("통화시간 입력오류2");
      } else {
        System.out.println("통화 시간  : " + time + "분");
        battery -= time * 0.5;
        if (battery < 0) {
          battery = 0.0;
        }

      }
    } catch (IllegalArgumentException e) {

      System.err.println(e.getMessage() + " 통화시간입력오류1");
    }

  }

}
