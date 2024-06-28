package day13.emp.exec;

import day13.emp.VO.Animal;
import day13.emp.VO.Cat;
import day13.emp.VO.Dog;

public class PolyMethodTest {

 /* public static void display(Dog d) {
    d.eat();
  }

  public static void display(Cat c) {
    c.eat();
  }*/

  public static void display(Animal ani) {//다형성 인수 : 하나의 타입으로 여러가지 타입을 받을 수 있다.
    ani.eat();
    //ani.night();//err, 형변환 없이 cat의 메서드를 쓸 수 없다.

    if (ani instanceof Cat) {//객체의 타입을 검사하는 instanceof 연산자
      ((Cat) ani).night();//다운캐스팅을 통해 night() 호출 가능
    }

  }

  public static void display1(Animal[] animals) {//다형성 인수 : 하나의 타입으로 여러가지 타입을 받을 수 있다.
    for (Animal ani : animals) {
      ani.eat();
      if (ani instanceof Cat) {
        ((Cat) ani).night();
      }
    }

  }

  public static void main(String[] args) {
    Dog d = new Dog();
    display(d);

    Cat c = new Cat();
    display(c);// 부모타입에게 자식타입의 객체를 전달한다. 부모자식 관계일 때 던질 수 있다.

    System.out.println("==================================");

    Animal[] animals = new Animal[2];
    animals[0] = d;
    animals[1] = c;
    display1(animals);


  }

}
