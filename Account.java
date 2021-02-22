package serialisering;

import java.io.Serializable;

//import jdk.internal.agent.resources.agent;

public class Account implements Serializable {

  String bankId;
  double balance;
  Person person;

  //AccountOwner accountOwner;

  public Account(String newOwner, double newBalance) {
    this.bankId = newOwner;
    this.balance = newBalance;
  }

  // public AccountOwner getAccountOwner(){
  //     return this.accountOwner;
  // }
  public String getOwner() {
    return this.bankId;
  }

  public double getBalance() {
    return this.balance ;
  }
  
  public Person getPerson(){
      return this.person ;
  }
  // public void setOwner(AccountOwner newOwner){
  //     this.accountOwner = newOwner;
  // }
  public void setOwner(String newOwner) {
    this.bankId = newOwner;
  }

  public void setBalance(double newBalance) {
    this.balance = newBalance;
  }

  public void setPerson(Person newPerson) {
    this.person = newPerson;
  }

  public void depositMoney(double transferBalance) {
      System.out.println("Transfer success!");
    this.balance += transferBalance;
  }

  public void withdrawMoney(double minusBalance){
      if(balance > minusBalance){
     this.balance -= minusBalance;
        }
        else if(balance <= minusBalance){
            System.out.println("oops no money boo hoo");
        }
    }

    public void transfer(Account owner, double amount){
        if(this.balance >= amount) {
            owner.balance += amount;
            this.balance -= amount;
            System.out.println("Transaction Successful");
        }
        else {
            System.err.println("Insufficient Funds!");
        }
    }

    

  public String toString() {
    return "Bank Id: " + bankId + ", amount of money in bank: " + balance  + " kr" + ", " + person;
  }
}
