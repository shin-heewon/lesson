package day15.interfaceEx.sec9.exam01;

public class PromotionExample {

  public static void main(String[] args) {
    //구현 객체 생성=>클래스 생성
    B b = new B();
    D d = new D();
    C c = new C();
    E e = new E();

    //인터페이스 변수 선언
    A a;

    //변수에 구현 객체 대입
    a = b;
    a = c;
    a = d;
    a = e;

    /*결론 : A만 알면 b,c,d,e가 갖고있는 기능 전부 다 쓸 수 있다.
     * => user는 A를 통해서 뒷단은 알 필요 없고 b,c,d,e로부터의 메시지를 받을 수 있다.*/

  }
}