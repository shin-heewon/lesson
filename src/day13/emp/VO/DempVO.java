package day13.emp.VO;

public class DempVO extends Employee {

  private String period;

  public DempVO() {
  }

  public DempVO(String period) {
    this.period = period;
  }

  public DempVO(String name, int age, String phone, String period) {
    super(name, age, phone);
    this.period = period;
  }

  public DempVO(String name, int age, String phone, String addr, String empDate, String dept,
      boolean marriage, String period) {
    super(name, age, phone, addr, empDate, dept, marriage);
    this.period = period;
  }
}
