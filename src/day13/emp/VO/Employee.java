package day13.emp.VO;

public class Employee {

  private String name;
  private int age;
  private String phone;
  private String addr;
  private String empDate;
  private String dept;
  private boolean marriage;

  Employee() {
  }

  public Employee(String name, int age, String phone) {
    this.name = name;
    this.age = age;
    this.phone = phone;

  }

  public Employee(String name, int age, String phone, String addr, String empDate, String dept,
      boolean marriage) {
    this.name = name;
    this.age = age;
    this.phone = phone;
    this.addr = addr;
    this.empDate = empDate;
    this.dept = dept;
    this.marriage = marriage;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", phone='" + phone + '\'' +
        ", addr='" + addr + '\'' +
        ", empDate='" + empDate + '\'' +
        ", dept='" + dept + '\'' +
        ", marriage='" + marriage + '\'' +
        '}';
  }
}
