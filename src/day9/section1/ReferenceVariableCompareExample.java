package day9.section1;

public class ReferenceVariableCompareExample {

  public static void main(String[] args) {

    //변수란? 데이터(값) 하나만을 저장하는 상자, 저장해야 할 데이터가 많아지면 변수도 많아진다.
    //배열이란? 많은 양의 값(데이터)를 조금 더 효율적으로 관리(CRUD), 연속된 공간에 값을 나열시키고 각 값에 index를 부여해 놓은 자료구조
    //배열의 인덱스는 0부터 시작하고 대괄호[]를 사용하여 각 항목의 값을 읽거나 저장할 때 사용
    //배열의 특징 :
    //1. 같은! 데이터 타입의 값만 관리한다. (참고로 list는 객체면 다 저장 가능)
    //2. 배열은 초기에 길이가 fix된다. 저장공간을 늘리거나 줄일 수 없다. => 고정 자료형

    //정수형 배열 변수 arr1 선언
    int[] arr1;

    //정수형 배열 변수 arr2 선언
    int[] arr2;
    //정수형 배열 변수 arr3 선언
    int[] arr3;

    //배열은 객체이다. => 객체는 heap영역에 로드 된다. => 객체를 선언할 때 heap영역에 로드 시키는 키워드 new를 사용해줘야 한다.
    //중괄호(brace)를 이용하여 배열 { 1, 2, 3 }을 생성하고 arr1 변수에 대입
    arr1 = new int[]{1, 2, 3};
    //배열 { 1, 2, 3 }을 생성하고 arr2 변수에 대입
    arr2 = new int[]{4, 5, 6};
    //배열 변수 arr2의 값을 배열 변수 arr3에 대입
    arr3 = arr2;

    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);
    for (int i = 0; i < arr1.length;
        i++) { //String.length()-메소드와 다르게 length가 함수가 아닌 내부 변수이다.(참조하는 배열의 length필드를 읽음)
      System.out.println(arr1[i]);
    }

    System.out.println("======");
    System.out.println(arr2[0]);
    System.out.println(arr2[1]);
    System.out.println(arr2[2]);

    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr2[i]);
    }

    // arr1과 arr2 변수가 같은 배열을 참조하는지 검사
    System.out.println("***********");
    System.out.println(arr1 == arr2);//false

    // arr2와 arr3 변수가 같은 배열을 참조하는지 검사
    System.out.println(arr2 == arr3);//true

    char[] data = {'a', 'b', 'c'};
    String str1 = new String(data);
    String str2 = new String();//빈 객체 생성됨
    String str3 = new String("홍길동");
    System.out.println(
        str1.toString() + ", " + str2.toString() + ", " + str3);//String클래스의 toString()은 생략 가능하다.

  }
}