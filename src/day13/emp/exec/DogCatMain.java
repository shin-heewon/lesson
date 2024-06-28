package day13.emp.exec;

import day13.emp.VO.Animal;
import day13.emp.VO.Cat;
import day13.emp.VO.Dog;

public class DogCatMain {

  public static void main(String[] args) {

    Dog dog = new Dog();
    dog.eat();

    Cat cat = new Cat();
    cat.eat();
    cat.night();

    Animal x = new Cat();//업캐스팅
    x.eat();
    //x.night();
    Cat cat1 = (Cat) x;//다운캐스팅,, x는 여전히 Animal타입!!
    cat1.night();

    Animal cat2 = new Cat();
    cat2.eat();
    cat2 = (Cat) cat2;
    ((Cat) cat2).night();//업캐스팅한 것을 다시 다운캐스팅

    x = new Dog();
    x.eat();

    //(Dog) x.sound();

  }

}
