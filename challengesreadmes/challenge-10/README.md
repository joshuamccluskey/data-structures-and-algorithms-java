# Stacks and Queues
Using a Linked List as the underlying data storage mechanism, implement both a Stack and a Queue


## Challenge
Build  push;pop;peek;isEmpty methods for Stack
Build enqueue;dequeue;peek;isEmpty methods for Queue

Build test for all methods
Test multiple values for push;pop;enqueue; and dequeue
Test excpetions thrown for pop;peek empty Stack;dequeue;peek for Queue

## Approach & Efficiency
The test were straight forward testing methods.
Stacks and queues have time complexity O(1) and space complexity of  O(n).

## API
STACK:
pop(): removes node from stack returns the nodes value
push(): adds node to the top of stack
peek(): returns the stack's top node value;
isEmpty(): returns true if stack is empty

QUEUE:
enqueue(): adds node to front of Queue
dequeue(): removes node from front of Queue and returns the node's value
peek(): returns the front nodes value
isEmpty(): returns true if the queue is empty
