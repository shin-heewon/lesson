package day8.section1;

public class EqualsExam {

  public static void main(String[] args) {
    //상수 리터럴(사용자가 직접 입력한 값) : 고정값=> 상수(constant) 처리 : 한 번만 값을 저장 가능한 변수
    //참고로 자바로 작업하면서 리터럴을 입력할 일은 그리 많지 않음
    String strv1 = "SSG";
    System.out.println(strv1.hashCode());

    String strv2 = "SSG";
    System.out.println(strv2.hashCode());

    strv1 = "SSG";
    System.out.println(strv1.hashCode());

    //변수명이 달라져도 입력된 값은 리터럴풀이라는 하나의 공간에 저장되기 때문에 주소값이 다 같음.
    //리터럴풀에 하나의 같은값은 하나만 저장되어 같은 값이 저장되어 필요한 경우 상수풀을 뒤져 일치하는 값을 찾아내어 같은 주소값을 가져옴.
    //상수풀(constant Pool)에 저장, 컴파일되는 시점

    String str3 = new String("SSG");//new 연산자 사용 => 힙영역에 새로운 객체를 로드
    String str4 = new String("SSG");

    System.out.println(str3.hashCode());
    System.out.println(str4.hashCode());
    //해시코드 값은 똑같이 나옴
    //리터럴 풀에 하나의 리터럴은 한 번만 저장되게 된다.
    //"SSG"라는 리터럴이 이미 한 번 저장되어 있기 때문에 str4에서 "SSG"를 다시 저장해도 새로 저장되는 것이 아니고
    //이미 저장되어있는 "SSG"가 있기 때문에 str3,4의 해시코드값을 비교해도
    //같은 리터럴풀 내부의 "SSG"라는 리터럴의 주소값을 가르키기 때문에 두 개의 해시코드 값은 똑같다.

    System.out.println(str3 == str4);//false,, 참주소값을 비교했기 때문
    if (str3.equals(str4)) {
      System.out.println("같다");//true,, 값 비교
    } else {
      System.out.println("다르다");
    }

    //String ssn = "9510103687516"; -> 변수값을 확인할 때 리터럴풀을 바로 찾아감
    String ssn = new String("9510103687516");
    //힙영역에 String객체 공간이 생기고, 변수 ssn이 가르키는 주소값(스택영역에 있음)을 참조하여 변수값을 확인할 수 있음

    char s = ssn.charAt(6);
    switch (s) {
      case '1':
      case '3':
        System.out.println("남성");
        break;
      case '4':
        System.out.println("여성");
        break;
    }//switch end

    for (int i = 0; i < ssn.length(); i++) {

      System.out.print(ssn.charAt(i));
    }


  }//main end


}
