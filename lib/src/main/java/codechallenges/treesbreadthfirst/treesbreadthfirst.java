package codechallenges.treesbreadthfirst;

import datastructures.tree.Node;
import datastructures.queue.Queue;
import datastructures.tree.BinaryTree;


public class treesbreadthfirst {

    Queue queue = new Queue();
    Queue breadthFirst (Node currentNode) {

        if (currentNode == null) {
            return queue ; }


        Queue leftValue = breadthFirst(currentNode.leftNode);
        queue.enqueue(currentNode.leftNode.value);
        Queue rightValue =breadthFirst(currentNode.rightNode);
        queue.enqueue(currentNode.rightNode.value);
        return queue;
    }

    }


