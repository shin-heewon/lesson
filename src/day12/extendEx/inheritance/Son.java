package day12.extendEx.inheritance;

public class Son extends Father {

  String name = "길동";

  void printDetails() {

    System.out.println("나의 이름은 " + super.familyName + this.name);
    System.out.println("나의 아버지는 " + super.fatherJob);
    System.out.println("나의 집은 " + super.houseAddress);
  }

}
