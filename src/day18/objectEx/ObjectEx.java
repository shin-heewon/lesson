package day18.objectEx;

class Myobject implements Cloneable {//클래스를 클론할 경우 대부분 Cloneable인터페이스 구현하여 사용함!!
  private String name;
  private int age;

  @Override
  protected Object clone() throws CloneNotSupportedException {//clone메서드는 protected이며, 예외 처리 필수이다
    try {
      return (Myobject) super.clone();//나 자신의(자식타입) 타입으로 다운캐스팅 하여 클론하겠다.

    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}

public class ObjectEx {

  public static void main(String[] args) throws CloneNotSupportedException {

    Myobject myobject = new Myobject();
    System.out.println(myobject.toString());//myObject 객체의 자신의 정보를 문자열로 반환

    Object copyobject = myobject.clone();
    System.out.println(myobject);
    System.out.println(copyobject);//myobject와 객체값 다름

  }
}
