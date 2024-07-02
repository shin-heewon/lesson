package day15.interfaceEx.Task.task2;

public class CarFactory extends Factory implements IWorkingTogether {

  public CarFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  int makeProducts(char skill) {

    int num;

    switch (skill) {
      case 'A' -> num = 3;
      case 'B' -> num = 2;
      case 'C' -> num = 1;
      default -> num = 0;
    }

    return num * getWorkingTime();
  }

  @Override
  public int workTogether(IWorkingTogether partner) {

    partner = new CarFactory(name, openHour, closeHour);

    return ((CarFactory) partner).makeProducts('B');
  }
}
