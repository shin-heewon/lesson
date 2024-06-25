package day9.section5.quiz;

public class Exam02_0422 {

  public static void main(String[] args) {

    char[][] alphabet = new char[5][5];
    char start = 'A';

    //1.배열에 알파벳 입력
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = start++;
      }
    }

    //2.원본 배열 출력
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        System.out.print(alphabet[i][j]);
      }
      System.out.println();
    }

    //3. 배열 수정
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        char ch = alphabet[i][j];
        alphabet[i][j] = Character.toLowerCase(ch);
        ch++;
      }
    }
    System.out.println();
    //4. 수정된 배열 출력
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        System.out.print(alphabet[i][j]);
      }
      System.out.println();
    }

  }
}