package day12.extendEx.inheritance;

class Parent {//최상위 클래스
  String name = "홍길순";

  void details() {
    System.out.println(this.name);
  }
}

class Child extends Parent {

  String name = "홍길동";

  void details() {
    super.details();
    System.out.println(this.name);
  }

  void printDetails() {
    details();
    System.out.println("부모 이름 : " + super.name);
    System.out.println("자식 이름 : " + this.name);
  }
}


public class Inheritance04 {

  public static void main(String[] args) {
    Child obj = new Child();
    obj.printDetails();
  }

}
