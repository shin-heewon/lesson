package day7.section1;

import java.util.Scanner;

public class MethodEx1 {

  static Scanner sc = new Scanner(System.in);


  static void getPlayerInfo(int group, int n) {

    String diceGroupName = new String("");

    System.out.println("그룹 : " + group + " " + " 각 그룹의 인원수 : " + n);
  }


  //주사위 게임을 몇개의 그룹에서 몇명이 참여하여 차례대로 한 번 씩 주사위를 던질 수 있도록 제공하는 프로그램
  public static void main(String[] args) {

    MethodEx1 mex1 = new MethodEx1();//변수 mex1: 인스턴스

    int group = 0;
    int n = 0;

    for (int i = 0; i < 2; i++) {

      group = mex1.settingGroup();
      n = mex1.playerSetting();

      mex1.dicePlay(group, n);
    }

    getPlayerInfo(group, n);


  }//main end


  int settingGroup() {

    System.out.println("몇 개의 그룹으로 진행할까요?");

    int n = sc.nextInt();//클래스 내에 sc가 static으로 선언되어 있어 매번 선언하지 않고 바로 사용 가능

    return n;
  }


  int playerSetting() {
    Scanner sc = new Scanner(System.in);

    System.out.println("참여자의 인원 수를 입력해주세요.");

    int n = sc.nextInt();

    return n;
  }

  /*MethodeEx1사용자 정의 클래스의 메소드*/
  public void dicePlay(int group, int n) {//파라미터 전달받음

    Scanner sc = new Scanner(System.in);

    for (int j = 1; j <= group; j++) {
      System.out.printf("%d그룹의 플레이가 시작됩니다.\n", j);

      for (int i = 0; i < n; i++) {

        int num = (int) (Math.random() * 6) + 1; // 6+1:최대범위, 1 : 시작값

        if (num == 1) {
          System.out.println("1번이 나왔습니다.");
        } else if (num == 2) {
          System.out.println("2번이 나왔습니다.");
        } else if (num == 3) {
          System.out.println("3번이 나왔습니다.");
        } else if (num == 4) {
          System.out.println("4번이 나왔습니다.");
        } else if (num == 5) {
          System.out.println("5번이 나왔습니다.");
        } else {
          System.out.println("6번이 나왔습니다.");
        }
      }//second for end
    }//first for end

  }

}
