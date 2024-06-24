package day9.section1;

public class SbEx {

  public static void main(String[] args) {
    //StringBuffer , StringBuilder 클래스는 문자열 연산(연결, 변경, 수정)에 주로 활용된다.

    //String 클래스 +, concat() : 문자열을 이어 붙여서 사용함
    // +연산자를 사용하면 literal pool에 기존 문자열과는 다른 새로운 문자열이 생성되는 것임

    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append("StringBuffer");
    sb.append("Nice to meet you");
    sb.append("!!!");
    String result = sb.toString();
    //toString() 메소드
    // : 내부적으로 버퍼(저장공간)가 제공되어 문자열 연산 후 제공하여 최종 결과를 만들어 때 사용 ==> 연산속도가 빠름

    System.out.println(result);

    String str1 = "ABCDEFGHIJKLMN";

    StringBuffer sb1 = new StringBuffer(str1);
    //str1이 StringBuffer타입으로 캐스팅 되면서 StringBuffer에서 제공되는 다양한 메소드 사용 가능해짐

    System.out.println(sb1);

    //sb1을 String casting하세요
    String str2 = sb1.toString();

    String str3 = sb1.substring(3, 10);
    System.out.println(str3);

    sb1.insert(2, "OPQRSTU");
    String str4 = sb1.toString();
    System.out.println(str4);//ABOPQRSTUCDEFGHIJKLMN

    //현재 sb1의 문자열 "ABOPQRSTUCDEFGHIJKLMN"에서 O부터 I까지 삭제한 결과 "ABJKLMN" 출력
    String str5 = sb1.delete(sb1.indexOf("O"), sb1.indexOf("I") + 1).toString();
    System.out.println(str5);

    //현재 sb1 문자열의 총길이 출력
    int sb1Length = sb1.length();

    //현재 sb1의 용량(capacity)출력
    int sb1Capacity = sb1.capacity();

    //현재 sb1의 문자열을 뒤집어 출력하기
    sb1.reverse();

    StringBuffer sb2 = new StringBuffer("가나다");
    boolean a = false;
    System.out.println(sb2.append(a));

    System.out.println(sb2.deleteCharAt(sb2.indexOf("f")));
    System.out.println(sb2);

  }//main end
}
