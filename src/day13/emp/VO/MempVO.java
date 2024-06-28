package day13.emp.VO;

public class MempVO extends Employee {

  private String mdept;

  public MempVO(String mdept) {
    this.mdept = mdept;
  }

  public MempVO(String name, int age, String phone, String mdept) {
    super(name, age, phone);
    this.mdept = mdept;
  }

  public MempVO(String name, int age, String phone, String addr, String empDate, String dept,
      boolean marriage, String mdept) {
    super(name, age, phone, addr, empDate, dept, marriage);
    this.mdept = mdept;
  }
}
