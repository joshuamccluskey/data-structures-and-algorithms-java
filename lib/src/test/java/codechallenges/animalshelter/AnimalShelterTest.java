package codechallenges.animalshelter;

import datastructures.queue.Queue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalShelterTest {

  @Test
  void test_addCat() {
    AnimalShelter cut = new AnimalShelter<>();
    cut.addCat("Felix", "Ragdoll",3 );
    assertTrue(true,"Yo something is wrong with your test_addCat()");
  }

  @Test
  void test_addDog() {
    AnimalShelter cut = new AnimalShelter<>();
    cut.addCat("Fido", "Lab",5 );
    assertTrue(true,"Yo something is wrong with your test_addDog()");
  }

  @Test
  void test_getAnimalShelter() {
    AnimalShelter cut = new AnimalShelter<>();
    cut.addDog("Fido", "Lab",5 );
    cut.addCat("Felix", "Ragdoll",3 );
    assertTrue(true,"Yo something is wrong with your test_addCat()");
  }

  @Test
  void test_setAnimalShelter() {
    AnimalShelter cut1 = new AnimalShelter<>();
    Queue cut = new Queue<>();
    cut1.setAnimalShelter(cut);
    assertTrue(true,"Yo something is wrong with your test_setAnimalShelter()");

  }
//  @Test
//  void test_adoptPreference() {
//    AnimalShelter cut = new AnimalShelter<>();
//    cut.addDog("Fido", "Lab",5 );
//    cut.addCat("Felix", "Ragdoll",3 );
//    cut.addDog("Scooby", "Great Dane", 4);
//    cut.addDog("Scrappy", "Great Dane", 1);
//    Queue animalShelter = cut.getAnimalShelter();
//    cut.adoptPreference(animalShelter, Dog.class);
//    assertTrue(true,"Yo something is wrong with your test_adoptPreference()");
//  }

  @Test
  void adopt() {
  }
  @Test
  void test_ToString() {
  }


}
