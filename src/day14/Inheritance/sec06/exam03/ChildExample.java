package day14.Inheritance.sec06.exam03;

public class ChildExample {

  public static void main(String[] args) {
    //객체 생성 및 자동 타입 변환
    Parent parent = new Child();

    //Parent 타입으로 필드와 메소드 사용
    parent.field1 = "data1";
    parent.method1();
    parent.method2();//Child의 method2()가 실행됨! 동적 바인딩!!

		/*
		parent.field2 = "data2";      	//(불가능)
		parent.method3();         		//(불가능)
		*/

    //강제 타입 변환(다운캐스팅)
    Child child = (Child) parent;

    //Child 타입으로 필드와 메소드 사용
    child.field2 = "data2";      //(가능)
    child.method3();          //(가능)
  }
}