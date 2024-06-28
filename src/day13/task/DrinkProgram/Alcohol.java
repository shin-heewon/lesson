package day13.task.DrinkProgram;

public class Alcohol extends Drink {

  double alcper;

  public Alcohol(String name, int count, int price, double alcper) {
    super(name, count, price);
    this.alcper = alcper;
  }

  @Override
  public void printData() {
    System.out.println(
        this.name + "(" + this.alcper + ")\t" + this.price + "\t" + this.count + "\t"
            + getTotalPrice());
  }

  @Override
  public void printTitle() {
    System.out.println("상품명(도수[%])    단가    수량    금액");
  }
}
