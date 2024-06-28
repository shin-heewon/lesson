package day13.emp.VO;

public class Animal extends Object {

  public Animal() {
    super();// == new Object();
  }

  public void eat() {
    System.out.println("Animal eat!");//추상적인 객체(대분류)
  }


}
