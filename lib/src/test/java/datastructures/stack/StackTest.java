package datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

  @Test
  void test_push()
  {
    Stack sut = new Stack();
    sut.push(1);
    assertTrue(true, "Yo you need to look at push()");
  }

  @Test
  void test_pushMultiple()
  {
    Stack sut = new Stack();
    sut.push(1);
    sut.push(2);
    sut.push(3);
    assertTrue(true, "Yo you need to look at test_pushMultiple()");
  }

 @Test
  void test_pop()
  {
    Stack sut = new Stack();
    sut.push(3);
    sut.pop();
    assertTrue(true, "Yo you need to look at pop()");
  }

  @Test
  void test_popMultiple()
  {
    Stack sut = new Stack();
    sut.push(1);
    sut.push(2);
    sut.push(3);

    while (sut.top != null) {
      sut.pop();
    }
    assertTrue(true, "Yo you need to look at test_popMultiple()");
  }

  @Test
  void test_peek()
  {
    Stack sut = new Stack();
    sut.push(3);
    sut.push(1);
    sut.peek();
    assertTrue(true, "Yo you need to look at peek()");
  }

  @Test
  void test_isEmpty()
  {
    Stack sut = new Stack();
    sut.isEmpty();
    assertTrue(true, "Yo you need to look at isEmpty()");

    Stack sutFalse = new Stack();
    sutFalse.isEmpty();
    sutFalse.push(3);
    sutFalse.push(1);
    assertFalse(false, "Yo you need to look at isEmpty()");
  }

//    @Test
//  void test_exceptions(){
//    Stack sut = new Stack();
//    sut.pop();
//    sut.peek();
//    assertTrue(true, "Yo you need to look at exceptions()");
//  }


}
