package day14.Inheritance.Task.task2;

public class Rectangular extends Shape {

  private double width;
  private String height;

  public Rectangular(String name, double width, String height) {
    super(name);
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculationArea() {
    this.area = width * Integer.parseInt(height);
    return area;
  }

  @Override
  public void print() {
    System.out.println(this.getName() + "의 면적은 " + calculationArea());
  }
}
