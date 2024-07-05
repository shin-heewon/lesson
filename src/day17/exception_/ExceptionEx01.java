package day17.exception_;

public class ExceptionEx01 {

  public static void main(String[] args) {

    printLengthString("JavaDATABASE_PROGRAMMING");
    printLengthString("null");


  }

  public static void printLengthString(String data) {
    int result = 0;
    try {
      result = data.length();
      System.out.println("문자 수  = " + result);

      Class.forName(
          "Java.lang.String");//반드시 thorw ClassNotFoundException 해줘야 Java.lang.String 패키지 있는지 찾아주겠다~
      System.out.println("String 클래스가 존재합니다.");

    } catch (NullPointerException e) {
      //System.err.println(e.getMessage());
      //System.out.println(e.toString());
      e.printStackTrace();

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.out.println("예외 처리 완료!");
    } catch (Exception e) {
      e.printStackTrace();//예외 처리의 최상위 클래스이지만, 이렇게 하면 예외를 못 잡아낼 수도 있다
    } finally {
      System.out.println("마무리 해!");
    }
  }

}
