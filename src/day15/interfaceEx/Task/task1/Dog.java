package day15.interfaceEx.Task.task1;

public class Dog extends Animal {

  public Dog(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    distance += speed * ((double) hours / 2);
  }


}
