package day13.emp.VO;

public class SempVO extends Employee {

  private String senior;

  public SempVO() {
  }//생성자 오버로딩 하면 디폴트 생성자를 만들어주지 않기 때문에 디폴트 생성자 만들어주는 것이 좋음

  public SempVO(String senior) {
    this.senior = senior;
  }

  public SempVO(String name, int age, String phone, String senior) {
    super(name, age, phone);
    this.senior = senior;
  }

  public SempVO(String name, int age, String phone, String addr, String empDate, String dept,
      boolean marriage, String senior) {
    super(name, age, phone, addr, empDate, dept, marriage);
    this.senior = senior;
  }
}
