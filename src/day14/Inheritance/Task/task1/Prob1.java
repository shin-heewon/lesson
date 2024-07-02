package day14.Inheritance.Task.task1;

public class Prob1 {

  public static void main(String[] args) {

    Truck truck = new Truck(0, "트럭", 4);
    Bike bike = new Bike(0, "자전거", 2);

    truck.sayWheelNumber();
    bike.sayWheelNumber();
    truck.speedUp(20);
    bike.speedUp(25);
    truck.speedDown(15);
    bike.speedDown(20);
    truck.stop();
    bike.stop();
    truck.speedUp(10);

  }
}
