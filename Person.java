package Projekt.Lecture06.serialisering;

import java.io.Serializable;

public class Person implements Serializable{

  String personName;
  String personAdress;

  public Person(String newPersonName, String newPersonAdress) {
    this.personName = newPersonName;
    this.personAdress = newPersonAdress;
  }

  // public String getPersonName(){
  //     return this.personName;
  // }

  // public double getPersonAdress(){
  //     return this.personAdress;
  // }

  // public void setPersonName(String newPersonName){
  //     this.personName = newPersonName;
  // }

  // public void setPersonName(double newPersonAdress){
  //     this.personAdress = newPersonAdress;
  // }
  public String toString() {
    return "Owner is: " + personName + ". Adress: " + personAdress;
  }
}
