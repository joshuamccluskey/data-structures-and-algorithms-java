# Linked List Insertions

Without using built-in java methods, create a linked list and insert a node before and after target node. Append linked list by adding new node at the tail of the linked list

### Contributor: Joshua McCluskey

### White Board Process

![Whiteboard linked list insertions](img/linked-list-insertions.png)

## Approach & Efficiency

Each method creates a new node with the methods parameter value passed when called. The before and after methods also have a target node passed as parameters. Append and after methods use next and move next until it reaches target node order. Before method incorperates previous node to set the target node to the previous node and the new node takes it spot.

The Big O for time O(1) and the space is O(n).

#### Work Time: 2 hours
