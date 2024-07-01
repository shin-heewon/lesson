package day14.Inheritance.Task.task2;

import day14.Inheritance.Task.task3.Beverage;

public class Coffee extends Beverage {

  public static int amount;

  public Coffee(String name) {
    super(name);
    amount++;

  }

  @Override
  public void calcPrice() {
    switch (this.getName()) {
      case "Americano" -> this.setPrice(1500);
      case "CafeLatte" -> this.setPrice(2500);
      case "Cappuccino" -> this.setPrice(3000);
    }

  }


}
