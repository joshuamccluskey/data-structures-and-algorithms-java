package codechallenges.pseudoqueue;

import datastructures.stack.Stack;

public class PseudoQueue<T> {
  Stack<T> helperStack;
  Stack<T> newStack;
  Stack<T> inputStack;

  public PseudoQueue() {
    inputStack = new Stack<>();
  }


  public Stack<T> pseudoEnqueue (Stack<T> inputStack, T value) {
  helperStack = new Stack();
  newStack = new Stack();

  while(inputStack != null) {
    T transfer;
    transfer = inputStack.pop();
    helperStack.push(transfer);
  }

  newStack.push(value);

  while(helperStack != null){
    T transfer;
    transfer = helperStack.pop();
    newStack.push(transfer);
  }

return newStack;


  }

  public Stack<T> pseudoDequeue (Stack<T> inputStack, T value) {
    helperStack = new Stack();
    newStack = new Stack();

    while(inputStack != null) {
      T transfer;
      transfer = inputStack.pop();
      if (value.equals(transfer)){
        break;
      }
      helperStack.push(transfer);
    }

    while(inputStack != null){
      T transfer;
      transfer = inputStack.pop();
      helperStack.push(transfer);
    }

    while(helperStack != null){
      T transfer;
      transfer = helperStack.pop();
      newStack.push(transfer);
    }

    return newStack;

  }

}
