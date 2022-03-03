package codechallenges.animalshelter;

import datastructures.queue.Queue;

import java.util.ArrayList;

public class AnimalShelter<T> {

  Queue<T> animalShelter;
  Cat cat;
  Dog dog;

  public AnimalShelter() {
   animalShelter = new Queue<>();
  }

  public void addCat(String name, String breed, int age){
    cat = new Cat(name, breed, age);
    this.animalShelter.enqueue((T) cat);
  }

  public void addDog(String name, String breed, int age){
    dog = new Dog(name, breed, age);
    this.animalShelter.enqueue((T) dog);
  }

  public Queue adoptPreference(Queue<T> animalShelter, Class preference) {
    Queue newQueue = new Queue();

    while(animalShelter != null){
      T animal;
      animal = animalShelter.dequeue();
      if(preference.equals(animal)){
        break;
      }
      newQueue.enqueue(animal);
    }

    while(animalShelter != null){
      T animal;
      animal = animalShelter.dequeue();
      newQueue.enqueue(animal);
    }
    setAnimalShelter(newQueue);
  return newQueue;
  }

  public Queue adopt(Queue<T> animalShelter){
    T animal;
    animal = animalShelter.dequeue();

    return animalShelter;
  }

  public Queue<T> getAnimalShelter() {
    return animalShelter;
  }

  public void setAnimalShelter(Queue<T> animalShelter) {
    this.animalShelter = animalShelter;
  }
  @Override
  public String toString() {
    return "AnimalShelter{" +
      "animalShelter=" + animalShelter +
      '}';
  }


}
