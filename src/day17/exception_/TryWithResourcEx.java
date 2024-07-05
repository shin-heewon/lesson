package day17.exception_;

public class TryWithResourcEx {

  public static void main(String[] args) {

    try (MyResource re = new MyResource("VICTORY")) {

      String data = re.readOne();
      int value = Integer.parseInt(data);

    } catch (Exception e) {
      System.out.println("문자열은 숫자로 바꿀 수 없습니다.");
      e.getMessage();
    }
    System.out.println();
  }

}
