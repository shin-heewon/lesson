package day12.extendEx.inheritance;

public class CalculationMain {

  public static void main(String[] args) {
    Inheritance01 obj = new Inheritance01();

    int a = 10;
    int b = 2;

    System.out.println("두 수의 덧셈 =" + obj.addition(a, b));
    System.out.println("두 수의 뺄셈 =" + obj.subtraction(a, b));
    System.out.println("두 수의 곱셈 =" + obj.multiplication(a, b));

  }


}
