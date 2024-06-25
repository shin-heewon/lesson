package day9.section7;

public class ArrayCopyExample {

  public static void main(String[] args) {
    //길이 3인 정수형 oldIntArray 배열 1,2,3으로 초기화하여 배열 생성
    int[] oldIntArray = {1, 2, 3};
    //int[] oldIntArray1 = new int[]{1, 2, 3};

    //길이 5인  배열을 새로 생성
    int[] newIntArray = new int[5];

    //배열 항목 복사
    for (int i = 0; i < oldIntArray.length; i++) {
      newIntArray[i] = oldIntArray[i];//남는 것은 0으로 들어감
    }

    //배열 항목 출력
    String result = "";

    for (int i = 0; i < newIntArray.length; i++) {
      result = result.concat(String.valueOf(newIntArray[i]));
      //System.out.print(newIntArray[i] + ", ");
    }
    System.out.println(result);

  }
}

