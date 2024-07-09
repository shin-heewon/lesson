package day18.objectEx.objectEqualsHashcode;

public class MemberMain {

  public static void main(String[] args) {

    Member m1 = new Member(111, "SSG");
    Member m2 = new Member(112, "SSG");

    //System.out.println(m1 == m2);//객체의 주소값 비교 => false
    System.out.println(m1.equals(m2));//객체의 값 비교 => true

    System.out.println(m1.hashCode() + "\t" + m2.hashCode());
    //hashcode()를 int result = this.name.hashCode(); 으로 오버라이딩 해놨기 때문에 값이 같게 나옴.
    //name이 String이기 때문에 같은 문자열은 리터럴풀에서 관리=> 해시코드 값이 같음

  }

}
