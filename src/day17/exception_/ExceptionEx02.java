package day17.exception_;

public class ExceptionEx02 {

  public static void main(String[] args) {

    String[] array = {"1000", "l000", null, "200"};

    /*for (String str : array) {//향상된 for : 이터레이터 패치기?가 있어서 안전하게 들고옴
      System.out.println(str);
    }*/
    try {
      for (int i = 0; i < 4; i++) {
        int value = Integer.parseInt(array[i]);
        System.out.println("array[" + i + "] : " + value);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println(e.getMessage());//예외처리 해주면 정상종료 되서 exit code 0
    } catch (NullPointerException | NumberFormatException e) {
      e.printStackTrace();
    }
    System.out.println("프로그램 안전 종료");

  }


}
