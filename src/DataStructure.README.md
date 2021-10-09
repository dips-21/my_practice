ADT gives us the blueprint while data structure provides the
implementation part.

The following are the advantages of a data structure:

Efficiency: If the choice of a data structure for implementing a particular ADT is proper, 
it makes the program very efficient in terms of time and space.

Reusability: The data structure provides reusability means that multiple client programs 
can use the data structure.

Abstraction: The data structure specified by an ADT also provides the level of abstraction. 
The client cannot see the internal working of the data structure, so it does not have to worry about the implementation part.
The client can only see the interface.

ARRAY vs LINKED LIST:-

ARRAY:-

An array is a collection of elements of a similar data type.
Array elements store in a contiguous memory location.
Array works with a static memory. 
Here static memory means that the memory size is fixed and cannot be changed at the run time.
Array elements are independent of each other.
Array takes more time while performing any operation like insertion, deletion, etc.
In the case of an array, memory is allocated at compile-time.	
Memory utilization is inefficient in the array. For example, if the size of the array is 6,
and array consists of 3 elements only then the rest of the space will be unused.

LINKED LIST:-

A linked list is a collection of objects known as a node where node consists of two parts, i.e., data and address.
Linked list elements can be stored anywhere in the memory or randomly stored.
The Linked list works with dynamic memory. 
Here, dynamic memory means that the memory size can be changed at the run time according to our requirements.
Linked list elements are dependent on each other.
As each node contains the address of the next node so to access the next node, we need to access its previous node.
Linked list takes less time while performing any operation like insertion, deletion, etc.
Accessing an element in a linked list is slower as it starts traversing from the first element of the linked list.
In the case of a linked list, memory is allocated at run time.
Memory utilization is efficient in the case of a linked list as the memory can be allocated or deallocated at 
the run time according to our requirement.


STACK VS QUEUE:-
=======================
STACK:-
It follows the principle LIFO (Last In- First Out), which implies that the element which is inserted last 
would be the first one to be deleted.
It has only one end from which both the insertion and deletion take place, and that end is known as a top.
It contains only one pointer known as a top pointer. 
The top pointer holds the address of the last inserted or the topmost element of the stack.
It performs two operations, push and pop. The push operation inserts the element in a list while 
the pop operation removes the element from the list.
If top==-1, which means that the stack is empty.
If top== max-1, this condition implies that the stack is full.

QUEUE:-
===================
It follows the principle FIFO (First In -First Out), which implies that the element which is added first
would be the first element to be removed from the list.
It has two ends, i.e., front and rear end.
The front end is used for the deletion while the rear end is used for the insertion.
It contains two pointers front and rear pointer. The front pointer holds the address of the first element,
whereas the rear pointer holds the address of the last element in a queue.
It performs mainly two operations, enqueue and dequeue. 
The enqueue operation performs the insertion of the elements in a queue while
the dequeue operation performs the deletion of the elements from the queue.
If front== -1 or front = rear+1, which means that the queue is empty.
If rear==max-1, this condition implies that the stack is full.
It is of three types like priority queue, circular queue and double ended queue.

TREE vs GRAPH:-TreeMap has complexity of O(logN) for insertion and lookup
===========================
Tree is a non-linear data structure in which elements are arranged in multiple levels.	
It is a collection of edges and nodes. For example, node is represented by N and edge is represented as E, 
so it can be written as:T = {N,E} 
In tree data structure, there is a unique node known as a parent node. 
It represents the topmost node in the tree data structure.
It does not create any loop or cycle.
It is a hierarchical model because nodes are arranged in multiple level, and that creates a hierarchy.
For example, any organization will have a hierarchical model.	
If there are n nodes then there would be n-1 number of edges.	
Tree data structure will always have directed edges.	
t is used for inserting, deleting or searching any element in tree.	


Tree:-
================
TreeMap is a balanced binary search tree.
It has key and value.
Java TreeMap maintains ascending order.
it has sorted order based on comparator if we passed comparator then it will use comparator ,if key type is comparable
then and we didnt pass comparator then it will use comparable..If key type is not comparable n we dont pass comparator
then it will gives class cast exception.

GRAPH:-
=================
A Graph is also a non-linear data structure.
It is a collection of vertices and edges.
In graph data structure, there is no unique node.
In graph, loop or cycle can be formed.
It is a network model. For example, facebook is a social network that uses the graph data structure.
The number of edges depends on the graph.
In graph data structure, all the edges can either be directed edges, undirected edges, or both.
It is mainly used for finding the shortest path in the network.

STACK VS HEAP:-
===========================
Stack	
Stack provides static memory allocation, i.e., it is used to store the temporary variables.
It is a linear data structure means that elements are stored in the linear manner, i.e., one data after another.
It is used to access the local variables.
As it is a linear data structure, so data is stored in the contiguous blocks.
The main issue that occurs with a stack is the shortage of memory because the memory size cannot be changed at the runtime.
It is of fixed size.
The scope of the variable cannot be changed.

HEAP:-
========
Heap provides dynamic memory allocation. 
It is hierarchical data structure means that the elements are stored in the form of tree.
It is used to access the global variables by default.
As it is hierarchical data structure, so elements are stored in the random manner.


STACK Vs ARRAY:-

Array
===========
It is a data structure that consists of a collection of elements that are identified by their indexes, 
where the first index is available at index 0.	
It is a collection of elements of the same data type.	
It provides random-access, i.e., read and write operations would be performed to any element at
any position through their indexes.	
It is rich in methods or operations like sorting, traversing, reverse, push, pop, etc.
It is used when we know all the data to be processed and require constant changes at any element.

STACK:-
-----------
It is an abstract data type that consists of a collection of elements that implements the LIFO (Last In First Out) principle.
It is a collection of elements of different data types.
As it implements LIFO so it has limited-access. 
We can access the only top element of the stack using push and pop operations.
The limited operations can be performed on a stack like push, pop, peek, etc.
It is good to use when there are dynamic processes. 
It is useful when we do not know how much data would be required.

STACK VS QUEUE:-
=====================
       STACK                                                       QUEUE
    =============                                               =============
   LIFO utility ds.                                                 FIFO
   Push and pop opeartion are done                     enque n deque- different ends "rear","front".
   at same end.
   no types of stack                                    types-linear,circular,priority,deque
   Application-
1)function activation records are created on stack      1)Printer maintains queue of documents to be printed
for each fun call.
2)To solve infix expression by converting          2)Os uses queues for many functinalities-ready queue,waiting queue
to prefix or postfix.                                   ,message queue.
3)to implement algo like dfs                        3) bfs



MAP vs SET:-
=================
Map:-
Map is an interface.
It is a data structure which is used to store key and value pair and we can get/remove value using key..
in the map.   
implementation <------linkedHashSet,HashSet,TreeSet
For eg : map word count ,   <----                     
set : store unique words ,find first duplicate

In Map, one or more keys can have the same values, but two keys cannot be the same.


Set:-
while Set is collection of unique elements which internally uses map and a static final dummy object as dummy value.
Set is a data structure which contains unique elements.Equality of sets does not depend on order
of elements .(HashSet does not have specific order ,TreeSet order on comparator /comparable )
types:-HashSet
       TreeSet
       LinkedHashSet, iterator maintains the insertion order.


HashMap 
======================
Hashmap is a Map implementation based on hash table.It supports get ,put and remove with time complexity of O(1)
It uses hashcode of the key object to find the bucket in hash table
and equals method to find the entry in that bucket .In case of hash collisions multiple entries will be chained in a 
linkedlist in that bucket (in java8 it can be binary search tree if collision size if above threshold)

It does not allow duplicate keys, but duplicate values are allowed.Only one Null key is allowed
It's not thread safe (not synchronized,not safe to be used from multiple threads) 
and iterators are fail fast.
If map is directly modified while iteration ConcurrentModificationException is thrown.

HashSet:-
===========
HashSet contains only key value.
In HashSet, we store objects.
It does not allow duplicate values.
HashSet uses the add() method to add elements in the HashSet. 
it internally uses Hashmap.in that case it has static dummy final object as a value.
It is used when we need to maintain the uniqueness of data.
eg.findDuplicateCharactersInWord
arrays.DuplicateLettersInWordTest

ArrayList
=======================================================================
In arraylist the array is encapsulated in it.

Complexity of get element is O(1).
If we remove elements from middle of first popsition then it then all elements will be shuffle.
cache friendly bcz continuouse memory allocation.when the page is loaded in memory then other elements
are in same place.
fixed memory allocation.
Dynamic array (if array size full then it internally create new array).so memory could be wasted.
in special case adding at last n there is spcae in internal array then complexity is o(1).
o(n)-to add or remove element from any position.


10) Merge sort
    ==================
    Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls
    itself for the two halves, and then merges the two sorted halves. 
    The merge() function is used for merging two halves. 
    The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and
    arr[m+1..r] are sorted and merges the two sorted sub-arrays into one. See the following C
    implementation for details.