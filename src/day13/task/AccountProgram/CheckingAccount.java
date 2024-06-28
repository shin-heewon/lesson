package day13.task.AccountProgram;

public class CheckingAccount extends Account {

  private String cardNo;

//  @Override
//  public void calcRate() {
//
//  }

  public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
   /* super(accId, balance, ownerName);
    this.cardNo = cardNo;*/

    super();
    this.accId = accId;
    this.ownerName = ownerName;
    this.balance = balance;
    this.cardNo = cardNo;
  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }

  public void pay(String cardNo, long amount) {

    //if (this.cardNo.equals(cardNo) && getBalance() > amount) //super. 생략 가능함
    if (this.cardNo.equals(cardNo) && this.balance >= amount) {
      //super.withdraw(amount);
      this.withdraw(amount);//protected이기 때문에 this로 접근 가능함!
    } else {
      System.out.println("지불이 불가능합니다.");
    }
  }
}
