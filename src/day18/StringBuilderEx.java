package day18;

public class StringBuilderEx {

  public static void main(String[] args) {
    String data = new StringBuilder().append("abc")
        .append('k').insert(0, "ABC").delete(0, 1).toString();//마지막 toString을 통해 불변객체로 고정

    System.out.println(data);

    //StringBuilder data1 = (StringBuilder) data; -> X ,, Inconvertible types; cannot cast 'java.lang.String' to 'java.lang.StringBuilder'

  }

}
