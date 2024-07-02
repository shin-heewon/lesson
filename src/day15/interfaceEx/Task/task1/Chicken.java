package day15.interfaceEx.Task.task1;

public class Chicken extends Animal implements Cheatable {

  public Chicken(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    distance += (double) (speed * hours);
  }

  @Override
  public void fly() {
    speed = speed * 2;
  }
}
