package serialisering;

import java.io.*;

public class serializingExample {

  public static void main(String[] args) throws Exception {
    Account ac1 = new Account("E123", 2000);
    Account ac2 = new Account("A123", 2000);
    Account ac3 = new Account("B123", 2200);
    Account ac4 = new Account("C123", 2300);
    Account ac5 = new Account("D123", 2400);

    Person person1 = new Person("Trong", "Malmö");
    Person person2 = new Person("Dennyu","Stockholm");

    ac1.setPerson(person1);
    System.out.println(ac1);
    
    ac2.setPerson(person2);
    System.out.println(ac2);
    
    //  ac2.withdrawMoney(1000);
    // System.out.println(ac2);
    
    // ac1.depositMoney(ac2.getBalance() );
    // System.out.println(ac1);

    
    ac2.transfer(ac1, 200);
    ac2.transfer(ac1, 200);
    ac2.transfer(ac1, 200);

    ObjectOutputStream out = new ObjectOutputStream(
      new FileOutputStream(
        "C:/Users/trong_5qwu0lf/OneDrive/Dokument/EC Javautvecklare/Javakurs/Advancera Java/Projekt/Lecture06/serialisering/account.ser"
      )
    ); 
    
    out.writeObject(ac1);
    out.writeObject(ac2);
    out.writeObject(ac3);
    out.writeObject(ac4);
    out.writeObject(ac5);

    out.flush();
    System.out.println("success");
    out.close();
  }
}
