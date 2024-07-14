package day18.wrapEx;

public class WrapEx01 {


  public static void main(String[] args) {
    //100값을 객체로 생성해 주세요 => boxing
    Integer value = 100;//new Integer(100)으로 하지 않아도 자동 박싱(Auto Boxing, 자바1.5부터)
    Boolean b1 = true;
    boolean b2 = b1.booleanValue();

    int v = value.intValue();//unboxing
    int v1 = value;
    v = v + 100;

    /*재포장-박싱*/
    value = v;
    System.out.println(value);

    Integer num1 = 10;
    Integer num2 = 20;
    Integer result1 = num1 + num2;
    System.out.println(result1);

    //객체 값 비교 equls()로 비교해야 한다.
    System.out.println(num1.equals(num2));
    System.out.println(num1 < num2);
    System.out.println(num1 + num2);

    //String문자를 포장 객체가 언방싱할 때
    String str1 = "10";
    String str2 = "10.5";
    int value2 = Integer.parseInt(str1);
    byte value4 = Byte.parseByte(str2);
    short value8 = Short.parseShort(str1);
    long value5 = Long.parseLong(str1);
    float value7 = Float.parseFloat(str2);
    double value3 = Double.parseDouble(str2);

  }


}
