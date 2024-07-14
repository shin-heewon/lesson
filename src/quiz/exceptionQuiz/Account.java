package quiz.exceptionQuiz;


public class Account {

  static final int MIN_BALANCE = 0;
  static final int MAX_BALANCE = 1000000;//상수(값이 정해져서 변경 불가)

  private int balance = 0;

  String accountNum;
  String owner;
  int firstDeposit = 0;

  public void withdraw(int amount) {
    balance -= amount;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {

    if (balance < Account.MIN_BALANCE || balance > MAX_BALANCE) {
      return; // 조건에 맞지 않으면 아무 것도 하지 않음
    }

    this.balance += balance;
//    int money = getBalance();//이렇게 하면 getBalance() 호출 없이 set메소드 단일로 사용할 수 있음. 그러나 자바에서는 단일 기능을 권장함!
//    System.out.println(money+"원이 입금되었습니다.");
  }

  public String getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getFirstDeposit() {
    return firstDeposit;
  }

  public void setFirstDeposit(int firstDeposit) {
    this.firstDeposit = firstDeposit;
    this.balance = this.firstDeposit;
  }


}

