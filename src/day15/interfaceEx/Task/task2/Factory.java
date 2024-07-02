package day15.interfaceEx.Task.task2;

public abstract class Factory {

  String name;
  int openHour;
  int closeHour;


  public Factory(String name, int openHour, int closeHour) {
    this.name = name;
    this.openHour = openHour;
    this.closeHour = closeHour;
  }

  public String getFactoryName() {
    return name;
  }

  public int getWorkingTime() {

    return closeHour - openHour;
  }

  abstract int makeProducts(char skill);

}
