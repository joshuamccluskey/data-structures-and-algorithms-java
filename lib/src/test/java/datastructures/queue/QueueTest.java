package datastructures.queue;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

  @Test
  void test_enqueue()
  {
    Queue sut = new Queue();
    sut.enqueue(1);
    assertTrue(true, "Yo you need to look at enqueue()");
  }

  @Test
  void test_enqueueMultiple()
  {
    Queue sut = new Queue();
    sut.enqueue(1);
    sut.enqueue(2);
    sut.enqueue(3);
    assertTrue(true, "Yo you need to look at test_enqueueMultiple()");
  }

  @Test
  void test_dequeue()
  {
    Queue sut = new Queue();
    sut.enqueue(1);
    Object testResult = sut.dequeue();
    assertTrue(true, "Yo you need to look at dequeue()");
    assertEquals(testResult, 1);
  }

  @Test
  void test_peek()
  {
    Queue sut = new Queue();
    sut.enqueue(5);
    sut.enqueue(4);
    Object testResult = sut.peek();
    assertTrue(true, "Yo you need to look at peek()");
    assertEquals(testResult, 4); // Remember the order of the call stack
  }

  @Test
  void test_dequeueMultiple()
  {
    Queue sut = new Queue();
    sut.enqueue(1);
    sut.enqueue(2);
    sut.enqueue(3);
    while (sut.front != null){
      sut.dequeue();
    }
    assertTrue(true, "Yo you need to look at test_dequeueMultiple()");
  }

  @Test
  void test_isEmpty(){
    Queue sut = new Queue();
    sut.isEmpty();
    assertTrue(true, "Yo you need to look at isEmpty()");
  }

//  @Test
//  void test_exceptions(){
//    Queue sut = new Queue();
//    sut.dequeue();
//    sut.peek();
//    assertTrue(true, "Yo you need to look at exceptions()");
//  }

}
