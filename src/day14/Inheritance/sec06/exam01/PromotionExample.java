package day14.Inheritance.sec06.exam01;

//1. 객체 타입변환 : 객체의 타입을 다른 타입으로 변환
//2. 참조타입 4가지 : 클래스타입, 인터페이스 타입, Enum, 배열
//3. 클래스의 타입변환은 클래스간 상속(is-A-kind Of) 관계에 있는 클래스 사이에서 발생한다.
//4. 업캐스팅(부모의 타입으로), 다운캐스팅(자식의 타입으로)
//Cat cat = new Cat(); -> Animal animal = cat;(업캐스팅) 자동 타입변환 promotion
// => ”고양이는 동물이다.” + 노션 4-1 참고

class A {//최상위 클래스이므로, B와 C의 공통 부분을 넣어서 디자인 해주면 좋음!

}

class B extends A {

}

class C extends A {

}

class D extends B {

}

class E extends C {

}

public class PromotionExample {

  public static void main(String[] args) {

    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    //상속계층에서 상위타입이라면 자동 타입 변환이 일어난다.(promotion)
    A a1 = b;//업캐스팅
    A a2 = c;//업캐스팅
    A a3 = d;
    A a4 = e;

    B b1 = d;
    //B b2 = e; 상속 구조가 아니므로 타입변환 불가!

    C c1 = e;
    //C c2 = d;// X

  }
}