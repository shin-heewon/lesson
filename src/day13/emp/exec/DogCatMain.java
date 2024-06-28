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

    Animal x = new Cat();
    x.eat();

    x = new Dog();
    x.eat();
    //x.sound();

    //(Dog) x.sound();

  }

}
