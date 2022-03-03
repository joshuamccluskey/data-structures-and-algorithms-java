package datastructures.linkedlist;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
  @Test void test_insert()
    {
      LinkedList<Integer> sut = new LinkedList<>();
      sut.insert(8);
      System.out.println("test_insert(): " + sut);
      assertEquals("{ 8 } ->  NULL",sut.toString(),"Yo you need to look at insert()");
    }

  @Test void test_insertMultiple()
  {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(8);
    sut.insert(8);
    sut.insert(8);
    sut.insert(8);
    System.out.println("test_insertMultiple(): " + sut);
    assertEquals("{ 8 } -> { 8 } -> { 8 } -> { 8 } ->  NULL",sut.toString(),"Yo you need to look at test_insertMultiple()");
  }
  @Test void test_includes()
  {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(1);
    System.out.println("test_includes(): " + sut.includes( 1));
    assertTrue(sut.includes(1),  "Yo you need to look at contains()" );
  }
  @Test void test_append() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(2);
    sut.insert(3);
    sut.append(4);
    System.out.println("test_append(): " + sut);
    assertEquals("{ 3 } -> { 2 } -> { 4 } ->  NULL", sut.toString());
  }

  @Test void test_appendMultiple() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(2);
    sut.insert(3);
    sut.append(4);
    sut.append(3);
    sut.append(2);
    sut.append(1);
    System.out.println("test_append(): " + sut);
    assertEquals("{ 3 } -> { 2 } -> { 4 } -> { 3 } -> { 2 } -> { 1 } ->  NULL", sut.toString());
  }

  @Test void test_insertBefore() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.insertBefore(4,2);
    System.out.println("test_insertBefore(): " + sut);
    assertEquals("{ 3 } -> { 4 } -> { 2 } -> { 1 } ->  NULL", sut.toString());
  }

  @Test void test_insertBefore_FirstNode() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.insertBefore(4,3);
    System.out.println("test_insertBeforeBefore_FirstNode(): " + sut);
    assertEquals("{ 4 } -> { 3 } -> { 2 } -> { 1 } ->  NULL", sut.toString());
  }

  @Test void test_insertAfter() {
    LinkedList<Integer> sut = new LinkedList<>();
//    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.insertAfter(4,2);
    System.out.println("test_insertAfter(): " + sut);
    assertEquals("{ 3 } -> { 2 } -> { 4 } ->  NULL", sut.toString());
  }

  @Test void test_insertAfter_LastNode() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(2);
    sut.insert(3);
    sut.insertAfter(4,2);
    System.out.println("test_insertAfte_LastNode(): " + sut);
    assertEquals("{ 3 } -> { 2 } -> { 4 } ->  NULL", sut.toString());
  }

  @Test void test_kthFromEnd_lengthGreater() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.insert(8);
    sut.kthFromEnd(5);
    assertFalse(false, "Yo you need to look at to test_kthFromEnd_lengthGreater()");
  }
    @Test void test_kthFromEnd_negativeInteger() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.insert(8);
    sut.kthFromEnd(-1);
    assertFalse(false, "Yo you need to look at to test_kthFromEnd_negativeInteger() ");
  }
  @Test void test_kthFromEnd_lengthSame() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.insert(8);
    assertEquals(8, sut.kthFromEnd(4));
  }

  @Test void test_kthFromEnd_sizeOfOne() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(1);
    assertEquals(1, sut.kthFromEnd(1));
  }

  @Test void test_kthFromEnd_happyPath() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.insert(8);
    assertEquals(2, sut.kthFromEnd(2));
  }

//  @Test void test_zip() {
//    LinkedList<Integer> linkedList1 = new LinkedList<>();
//    linkedList1.insert(1);
//    linkedList1.insert(2);
//    linkedList1.insert(3);
//    linkedList1.insert(8);
//    LinkedList<Integer> linkedList2 = new LinkedList<>();
//    linkedList2.insert(1);
//    linkedList2.insert(2);
//    linkedList2.insert(3);
//
//
//    zip(linkedList1, linkedList2);
////    assertEquals(8, sut.kthFromEnd(4));
//  }

  @Test void test_toString()
 {
  LinkedList<Integer> sut = new LinkedList<>();
  sut.toString();
  assertTrue(true, "Yo you need to look at toString()");
 }
}
