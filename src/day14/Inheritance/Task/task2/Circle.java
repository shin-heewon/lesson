package day14.Inheritance.Task.task2;

public class Circle extends Shape {

  double radius;


  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  @Override
  public double calculationArea() {
    this.area = radius * radius * Math.PI;
    return area;
  }

  @Override
  public void print() {
    System.out.println(this.getName() + "의 면적은 " + calculationArea());
  }
}
