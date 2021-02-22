package serialisering.Example;

import java.io.Serializable;

public class Student implements Serializable {

  int id;
  String name;

  public Student(int i, String string) {
    this.name = string;
    this.id = i;
  }
}
