package day14.Inheritance.Task.task2;

public abstract class Shape {

  protected double area;
  private String name;

  public Shape() {
  }

  public Shape(String name) {
    this.name = name;
  }

  abstract double calculationArea();

  public void print() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
