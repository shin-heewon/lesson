package day11.model;

public class Person {

  public String name;
  public int age;
  public String phone;

  public Person(String name, String phone) {
    this.name = name;
    this.phone = phone;//값 저장!
  }//생성자-나주인 객체 만들 때 사용

  public Person() {
  }//디폴트 생성자-홍길동 만들 때 사용함

  public void play() {
    System.out.println("운동을 한다.");
  }

  public void eat() {
    System.out.println("음식을 먹다.");
  }

  public void walk() {
    System.out.println("걷다.");
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", phone='" + phone + '\'' +
        '}';
  }
}
