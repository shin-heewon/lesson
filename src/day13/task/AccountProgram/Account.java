package day13.task.AccountProgram;

public class Account {

  protected String accId;
  protected long balance;
  protected String ownerName;

  public Account() {

  }

  public Account(String accId, long balance, String ownerName) {
    this.accId = accId;
    this.balance = balance;
    this.ownerName = ownerName;
  }

  //public abstract void calcRate();

  public void deposit(long money) {
    this.balance = this.balance + money;

  }

  public void withdraw(long money) {
    this.balance = this.balance - money;
  }

  public long getBalance() {
    return this.balance;
  }

  public String getAccId() {
    return accId;
  }

  public void setAccId(String accId) {
    this.accId = accId;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }


}
