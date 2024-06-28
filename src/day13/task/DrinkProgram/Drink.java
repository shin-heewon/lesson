package day13.task.DrinkProgram;

public class Drink {

  protected String name;
  protected int price;
  protected int count;

  public Drink() {
  }

  public Drink(String name, int count, int price) {
    this.name = name;
    this.count = count;
    this.price = price;
  }

  public int getTotalPrice() {
    return price * count;
  }

  public void printTitle() {
    System.out.println("상품명    단가    수량    금액");
  }

  public void printData() {
    System.out.println(
        this.name + "\t" + this.price + "\t" + this.count + "\t" + getTotalPrice());

  }

}
