# Graphs
Graphs is type of non-linear data structure that contain from vertices (nodes) and edges, where the edges line segments to connect any two vertices in the graph. so based on prives the neighbors of a vertice its adjacent nodes and the degree of a vertex is the number of edges connected to that vertex.

## Challenge
Implement Graph. The graph should be represented as an adjacency list, and should include the following methods:

- add node

- add edge

- get nodes

- get neighbors

- size

## Approach & Efficiency
> Big o
- Space  complexity -> O(n+2e)
- time   complexity -> o(n)
- where n (number of input) and e (edge)
## API
- add node
1. Arguments: value
1. Returns: The added node
1. Add a node to the graph
- add edge
1. Arguments: 2 nodes to be connected by the edge, weight (optional)
1. Returns: nothing
1. Adds a new edge between two nodes in the graph

- get nodes
1. Arguments: none
1. Returns all of the nodes in the graph as a collection (set, list, or similar)
- get neighbors
1. Arguments: node
1. Returns a collection of edges connected to the given node
1. Include the weight of the connection in the returned collection
- size
1. Arguments: none
2. Returns the total number of nodes in the graph




