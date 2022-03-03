package datastructures.stack;

import datastructures.stack.Node;

public class Stack<T>
{
  Node<T> top;

  public void push(T value)
  {
    Node newNode = new Node(value);
    if (top != null) {
      newNode.next = top;
    }
    top = newNode;
  }

  public T pop()
  {
    T popValue = top.value;
    top = top.next;
    return popValue;
  }

  public T peek()
  {
    return top.value;
  }

  public boolean isEmpty()
  {
    return ((top == null) ? true : false);
  }
}
