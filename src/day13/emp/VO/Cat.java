package day13.emp.VO;

public class Cat extends Animal {

  public Cat() {
    super();
  }

  //Override(재정의) : super class의 동일한 이름을 가진(파라미터, 타입까지 같아야 함) 메서드를 재정의
  public void eat() {

    System.out.println("Cat eat!");
  }

  public void night() {
    System.out.println("밤에는 고양이 눈이 빛반사를 해서 갑자기 마주치면 너무 무섭다.");
  }

}
