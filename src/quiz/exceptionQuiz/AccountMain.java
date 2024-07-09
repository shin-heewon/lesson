package quiz.exceptionQuiz;

import java.util.Scanner;

public class AccountMain {

  static Scanner sc = new Scanner(System.in);

  static int i = 0;
  static boolean flag = true;

  public void menuSelect(int num, Account[] acc) {

    switch (num) {
      case 1 -> createAccount(acc);
      case 2 -> getAccountList(acc);
      case 3 -> deposit(acc);
      case 4 -> withdraw(acc);
      case 5 -> programOff();

    }

  }//menuSelect method end

  public void createAccount(Account[] acc) {
    System.out.println("계좌생성");
    System.out.println("-----------");
    System.out.print("계좌번호: ");
    acc[i] = new Account();
    acc[i].setAccountNum(sc.nextLine());
    System.out.print("계좌주: ");
    acc[i].setOwner(sc.nextLine());
    System.out.print("초기입금액: ");
    acc[i].setFirstDeposit(sc.nextInt());
    sc.nextLine();
    System.out.println("결과 : 계좌가 생성되었습니다.");

    i++;
  }

  void getAccountList(Account[] acc) {
    System.out.println("계좌목록");
    System.out.println("-----------");
    for (Account account : acc) {
      if (account == null) {
        break;
      }
      System.out.println(account.accountNum + "  " + account.owner + "  " + account.getBalance());

    }
  }

  void deposit(Account[] acc) {
    System.out.println("예금");
    System.out.println("-----------");
    System.out.print("계좌번호: ");
    String accNum = sc.nextLine();
    for (int j = 0; j < acc.length; j++) {
      if (accNum.equals(acc[j].getAccountNum())) {
        i = j;
        break;
      }
    }
    System.out.print("예금액: ");
    acc[i].setBalance(sc.nextInt());
    sc.nextLine();
    System.out.println("출금이 성공됐습니다.");
  }

  void withdraw(Account[] acc) {
    System.out.println("출금");
    System.out.println("-----------");
    System.out.print("계좌번호: ");
    String accNum = sc.nextLine();
    for (int j = 0; j < acc.length; j++) {
      if (accNum.equals(acc[j].getAccountNum())) {
        i = j;
        break;
      }

    }
    System.out.print("출금액: ");
    int withdrawlCash = sc.nextInt();
    sc.nextLine();
    if (withdrawlCash > acc[i].getBalance()) {
      System.out.println("현재 잔액 " + acc[i].getBalance() + "원 보다 큰 금액은 출금할 수 없습니다.");
      return;
    }
    acc[i].withdraw(withdrawlCash);
    System.out.println("결과 : 출금이 성공됐습니다.");
  }

  void programOff() {
    System.out.println("프로그램 종료");
    flag = false;
  }


  public static void main(String[] args) {
    Account[] acc = new Account[100];
    AccountMain q20 = new AccountMain();

//    acc[0].setAccountNum("dd");
//    System.out.println(acc[0].getAccountNum());

    while (flag) {

      System.out.println("---------------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("---------------------------------------------");
      System.out.print("선택>");
      int num = Integer.parseInt(sc.nextLine());
      System.out.println("-----------");

      q20.menuSelect(num, acc);


    }//end of while

  }//end of main
}
