package day15.interfaceEx.sec08;

public class ExtendsExample {

  public static void main(String[] args) {

    InterfaceCImpl imple = new InterfaceCImpl();

    InterfaceA ia = imple;
    ia.methodA();
    //ia.methodB();

    System.out.println();

    InterfaceB ib = imple;
    ib.methodB();

    System.out.println();

    InterfaceC ic = imple;
    ic.methodA();
    ic.methodB();
    ic.methodC();

    /*결론 : 인터페이스 타입을 가지고 사용자에게 권한을 조정할 수 있다.*/

  }
}