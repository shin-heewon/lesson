package day13.emp.VO;

public class RempVO extends Employee {

  public RempVO() {
  }

  /*상속받은 생성자, 부모에게 값을 넘겨줌?*/
  public RempVO(String name, int age, String phone, String addr, String empDate, String dept,
      boolean marriage) {
    super(name, age, phone, addr, empDate, dept,
        marriage);/*부모클래스의 필드가 private이면 이렇게 super를 통해 직접 접근 가능함.*/


    /*super();*//*super()를 통해 부모 클래스? 객체? 를 먼저 생성해 놓아야 아래처럼 부모필드를 내 것(자식)처럼 쓸 수 있다!*//*
    this.name = name; //주의!부모 클래스의 필드들이 private이면 this를 통해 접근할 수 없음!!
    this.age = age;
    this.phone = phone;
    this.addr = addr;
    this.empDate = empDate;
    this.dept = dept;
    this.marriage = marriage;*/
  }

  public RempVO(String name, int age, String phone) {//이런 형태도 가능하지만 필드가 없기 때문에 보관이 불가능
    super(name, age, phone);
  }
}
