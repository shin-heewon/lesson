package day14.Inheritance.Task.task2;

import day14.Inheritance.Task.task3.Beverage;

public class Tea extends Beverage {

  public static int amount;

  public Tea(String name) {
    super(name);
    amount++;

  }

  @Override
  public void calcPrice() {
    switch (super.getName()) {
      case "lemonTea" -> this.price = 1500;
      case "ginsengTea" -> this.price = 2000;
      case "redginsengTea" -> this.price = 2500;
    }

  }

}
