package day15.interfaceEx.Task.task1;

public abstract class Animal {

  int speed;
  double distance;

  public Animal(int speed) {
    this.speed = speed;
  }

  abstract void run(int hours);

  double getDistance() {
    return this.distance;
  }
}
