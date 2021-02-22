package serialisering;
import java.io.*;

public class deserializingExample {
    public static void main(String[] args) throws Exception {
       
        ObjectInputStream in = new ObjectInputStream(
          new FileInputStream(
            "C:/Users/trong_5qwu0lf/OneDrive/Dokument/EC Javautvecklare/Javakurs/Advancera Java/Projekt/Lecture06/serialisering/account.ser"
          )
        );
        Account a = (Account) in.readObject();
        Account a2 = (Account) in.readObject();
        Account a3 = (Account) in.readObject();
        Account a4 = (Account) in.readObject();
        Account a5 = (Account) in.readObject();



        System.out.println("Bank ID: " + a.bankId + " " + a.balance + " kr. " + a.person);
        System.out.println("Bank ID: " +a2.bankId + " " + a2.balance + " kr. " + a2.person);
        System.out.println("Bank ID: " +a3.bankId + " " + a3.balance + " kr. ");
        System.out.println("Bank ID: " +a4.bankId + " " + a4.balance + " kr. ");
        System.out.println("Bank ID: " +a5.bankId + " " + a5.balance + " kr. ");

        
        in.close();

      }
}
