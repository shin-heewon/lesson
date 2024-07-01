package day14.Inheritance.Task.task1;

public class Truck extends Wheeler {

  public Truck(int velocity, String carName, int wheelNumber) {
    super(velocity, carName, wheelNumber);
  }

  @Override
  public void speedUp(int speed) {
    velocity += 5 * speed;

    if (velocity > 100) {
      velocity = 100;
      System.out.println("트럭의 최고 속도 위반으로 속도를 " + velocity + "로 내립니다.");
    } else {
      System.out.println("트럭의 현재 속도는 " + velocity + "입니다.");

    }
  }

  @Override
  public void speedDown(int speed) {
    velocity -= 5 * speed;

    if (velocity < 50) {
      velocity = 50;
      System.out.println("트럭의 최저속도 위반으로 속도를 " + velocity + "으로 올립니다.");
    } else {
      System.out.println("트럭의 현재 속도는 " + velocity + "입니다.");
    }


  }
}
