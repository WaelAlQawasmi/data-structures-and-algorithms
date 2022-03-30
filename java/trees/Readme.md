# Trees
A tree data structure can be defined recursively as a collection of nodes, where each node is a data structure consisting of a value and a list of references to nodes. The start of the tree is the "root node" and the reference nodes are the "children".
- Node - A Tree node is a component which may contain its own values, and references to other nodes
- Root - The root is the node at the beginning of the tree
- K - A number that specifies the maximum number of children any node may have in a k-ary tree. In a binary tree, k = 2.
- Left - A reference to one child node, in a binary tree
- Right - A reference to the other child node, in a binary tree
Edge - The edge in a tree is the link between a parent and child node
- Leaf - A leaf is a node that does not have any children
- Height - The height of a tree is the number of edges from the root to the furthest leaf

## Traversals

- Depth First
- Breadth First
### Depth First
Depth first traversal is where we prioritize going through the depth (height) of the tree first. There are multiple ways to carry out depth first traversal, and each method changes the order in which we search/print the root. Here are three methods for depth first traversal:

- Pre-order: root >> left >> right
- In-order: left >> root >> right
- Post-order: left >> right >> root

### Binary Tree 
rees can have any number of children per node, but Binary Trees restrict the number of children to two (hence our left and right children).
### Binary Search Tree (BST)
 is a type of tree that does have some structure attached to it. In a BST, nodes are organized in a manner where all values that are smaller than the root are placed to the left, and all values that are larger than the root are placed to the right.
## Challenge
- ### Create a Node 
class that has properties for the value stored in the node, the left child node, and the right child node.
- ### Create a Binary Tree class
Define a method for each of the depth first traversals:
- pre order
- in order
- post order 
which returns an array of the values, ordered appropriately.


- ### Create a Binary Search Tree
Binary Search Tree Class, with the following additional methods:
- Add
Arguments: value
Return: nothing
Adds a new node with that value in the correct location in the binary search tree.
- Contain
Argument: value
Returns: boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency
the big O  for space is O(n)
in time for BT O(n)
for BST login

## API
-  Comparable<T>
- java.util.ArrayList;

