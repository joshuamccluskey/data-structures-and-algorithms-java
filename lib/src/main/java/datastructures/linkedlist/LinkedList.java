package datastructures.linkedlist;

// Credit:
// Worked and collaborated with Tony Regalado on 02/20/2022 5:00pm
// Worked and collaborated with Tony Regalado on 02/27/2022 7:00pm
// Referenced:  https://www.javatpoint.com/java-program-to-create-and-display-a-singly-linked-list



public class LinkedList<T> {
  // Creating head and tail nodes
  Node head = null;
  Node tail = null;
  int counter = 0;


  public void insert(T value) {
    Node<T> newNode = new Node<>(value);
    newNode.next = head;
    head = newNode;
  }


  public boolean includes(T value) {
    Node<T> curr = head;
    while (curr != null) {
      if (curr.value == value) {
        return true;
      }
      curr = curr.next;
    }
    return false;
  }


  public void append(T value) {
    Node<T> newNode = new Node<>(value);
    if (head != null) {
      Node<T> curr = head;
      while (curr.next != null) {
        curr = curr.next;
      }
      curr.next = newNode;
    } else {
      head = newNode;
    }
  }

  public void insertBefore(T insertValue, T targetValue) {
    Node<T> newNode = new Node<>(insertValue);
    Node<T> curr = head;

    if (curr == null) {
      curr = newNode;
    }
    if (curr.value == targetValue) {
      insert(insertValue);
    }

    while (curr.next != null) {
      if (curr.next.value == targetValue) {
        newNode.next = curr.next;
        curr.next = newNode;
        curr = newNode.next;
      } else {
        curr = curr.next;
      }
    }
  }

  public void insertAfter(T insertValue, T targetValue) {
    Node<T> newNode = new Node<>(insertValue);
    Node<T> curr = head;

    if (curr == null) {
      return;
    }
//    if (curr.value == targetValue){
//      append(insertValue);
//    }
    while (curr.next != null) {

      if (curr.value == targetValue) {
        newNode.next = curr.next;
        curr.next = newNode;
      }
      if (curr.next.value == targetValue) {
        curr = curr.next;
        curr.next = newNode;
      }
      curr = curr.next;
    }
  }

  public <T> Object kthFromEnd(int k) {
    Node<T> curr = head;

    try {
      while (curr != null) {
        curr = curr.next;
        counter++;
      }
      if (counter >= k) {
        curr = head;
        for (int i = 0; i < counter - k; i++) {
          curr = curr.next;
        }
      }return curr.value;
    }catch (NullPointerException npe){
      System.out.println("Yo you're k value is out of bounds for this linked list!");
      npe.printStackTrace();
    }
    return false;
  }

//   public static void zip (LinkedList linkedList1){
//    Node previousNode = head;
//    Node currNode2 = linkedList1.head;
//
//    while (previousNode != null && currNode2 != null){
//      previousNode.next = currNode2.next;
//      currNode2.next = previousNode;
//
//      previousNode = previousNode.next;
//      currNode2 = currNode2.next;
//
//      linkedList2.head =currNode2;
//    }
//  }


  @Override
  public String toString() {
    String nodeString = "";
    Node<T> currentNode = head;

    while (currentNode != null) {
      nodeString +=  "{ " + currentNode.value + " } -> ";
      currentNode = currentNode.next;
    }
     nodeString += " NULL";
    return nodeString;
  }

}
