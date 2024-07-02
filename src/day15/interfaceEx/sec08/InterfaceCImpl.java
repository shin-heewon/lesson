package day15.interfaceEx.sec08;

import day15.interfaceEx.sec9.exam01.C;


/*인터페이스의 다중 상속*/
public class InterfaceCImpl implements InterfaceC {//==implements InterfaceA, InterfaceB한 것과 같음.

  @Override
  public void methodC() {
    System.out.println("method C");
  }

  @Override
  public void methodA() {
    System.out.println("method A");
  }

  @Override
  public void methodB() {
    System.out.println("method B");
  }
}