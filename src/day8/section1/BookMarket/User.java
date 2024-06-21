package day8.section1.BookMarket;

public class User {//실행 클래스가 아닌 값만 저장하는 용도의 VO클래스(value of class)

  private String id;//아이디
  private String name;//이름
  private String mobileNumber;//폰번호
  private String address;//주소
  private String password;//비밀번호

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;//this는 인스턴스의 주소값이 저장된다. 즉 실행클래스에서 선언한 변수 user1을 지칭한다.
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", mobileNumber='" + mobileNumber + '\'' +
        ", address='" + address + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}



