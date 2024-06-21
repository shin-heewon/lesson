package day8.section1;

public class referEx1 {

  public static void main(String[] args) {//extends Object  적혀있지 않아도 Object를 상속받음.

    referEx1 refex1 = new referEx1();
    referEx1 refex2 = new referEx1();
    System.out.println(refex1.toString() + " "
        + refex2.toString());//day8.section1.referEx1@4eec7777 day8.section1.referEx1@3b07d329
    System.out.println(refex1.hashCode() + " " + refex2.hashCode());//1324119927 990368553

    String str1 = new String("Happy birthday");
    String str2 = new String("Happy birthday");
    if (str1 == str2) {
      System.out.println("주소값이 같은 객체");
    } else {

      System.out.println("주소값이 다르므로 다른 객체");
      //같은 String객체를 가르키더라도(원형은 같지만 공간은 다르다),
      // String객체는 값이 아니라 공간의 개념으로 생각할 것 => new를 통해 String 객체 즉 공간이 2개가 생성된 것 => 주소값이 다름
    }

    String str3 = "Hi wake up!";
    String str4 = "Hi wake up!";
    if (str3 == str4) {
      System.out.println("주소값이 같은 객체");
      //리터럴로 선언된 값은 리터럴풀에서 묶어서 관리하여 같은 주소값을 가르킴(중복을 허용하지 않는 공간)
      //이는 자바에서 JVM이 데이터를 다루는 방식임
    } else {

      System.out.println("주소값이 다르므로 다른 객체");
    }

  }//main end

  public static void method1() {

    System.out.println("method1");
  }

  public static void method2() {
    System.out.println("method2");
  }

}


