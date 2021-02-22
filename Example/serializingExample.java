package serialisering.Example;

import java.io.*;



public class serializingExample {
    

    public void main(String[] args) throws Exception{

    Student newStudent = new Student(123,"Trong");
    ObjectOutputStream out = new ObjectOutputStream(
      new FileOutputStream(
        "C:/Users/trong_5qwu0lf/OneDrive/Dokument/EC Javautvecklare/Javakurs/Advancera Java/Projekt/Lecture06/serialisering/Example/student.ser"
      )
    ); 
    
    out.writeObject(newStudent);
    // out.writeObject(ac2);
    // out.writeObject(ac3);
    // out.writeObject(ac4);
    // out.writeObject(ac5);

    out.flush();
    System.out.println("success");
    out.close();
} 

    
}
