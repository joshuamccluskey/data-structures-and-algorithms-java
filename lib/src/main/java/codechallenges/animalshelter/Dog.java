package codechallenges.animalshelter;

import java.time.LocalDate;

public class Dog {
  String name;
  String breed;
  int age;

  public Dog(String name, String breed, int age) {
    this.name = name;
    this.breed = breed;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Dog{" +
      "name='" + name + '\'' +
      ", breed='" + breed + '\'' +
      ", age=" + age +
      '}';
  }
}
