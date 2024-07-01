package day14.Inheritance.sec05.package2;


import day14.Inheritance.sec05.package1.A;//다른 패키지의 클래스 사용 가능해짐

public class D extends A {

  //생성자 선언
  public D() {
    //A() 생성자 호출
    super();        //o
  }

  //메소드 선언
  public void method1() {
    //A 필드값 변경
    this.field = "value";  //o
    //A 메소드 호출
    this.method();      //o,, A클래스의 protected 메소드를 실행하지만 this 키워드를 통해 내 것(D)처럼 사용 가능함
    System.out.println(this.field);
  }

  //메소드 선언
  public void method2() {
    //A a = new A();    //x, protected이기 때문에 직접 생성해서 사용 할 수 없음. super키워드를 통해서 생성자 호출은 가능함!! public은 가능
    //defalut인 경우 같은 패키지 내에서만 사용 가능해짐.
    //a.field = "value"; 	//x
    //a.method(); 			//x
  }

  public static void main(String[] args) {
    D d = new D();
    d.method1();

  }

}
//D클래스는 A클래스와 다른 패키지에 있지만, A의 자식이므로 protected필드, 생성자, 메소드에 접근할 수 있다.
//단, 객체를 새로 new하여 생성할 수는 없다. super()를 이용한 호출은 가능하다.