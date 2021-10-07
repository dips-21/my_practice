STACK VS QUEUE:-
=====================
       STACK                                                       QUEUE
     
   LIFO utility ds.                                                 FIFO
   Push and pop opeartion are done                     push n pop- different ends "rear","front".
   at same end.
   no types of stack                                    types-linear,circular,priority,deque
   Application-
1)fun activation records are created on stack      1)Printer maintains queue of documents to be printed
for each fun call.
2)To solve infix expression by converting          2)Os uses queues for many functinalities-ready queue,waiting queue
to prefix or postfix.                                   ,message queue.
3)to implement algo like dfs                        3) bfs



map vs set:-
---------------
map:-
It can have the same value for different keys.
Map contains unique key and repeated values. 
In Map, one or more keys can have the same values, but two keys cannot be the same.
The insertion order is also not maintained by the Map.

Set:-
It cannot contain repeated values.
We can iterate the Set elements using the keyset() and the entryset() method of it.
Insertion order is not maintained by the Set interface.
 like LinkedHashSet, maintains the insertion order.

HashMap 
======================
Hashmap contains key value pair.
It does not allow duplicate keys, but duplicate values are allowed.
HashMap uses the put() method to add the elements in the HashMap.
Always prefer when we do not maintain the uniqueness.



HashSet:-
===========
HashSet contains only key value.
In HashSet, we store objects.
It does not allow duplicate values.
HashSet uses the add() method to add elements in the HashSet.
it internally uses Hashmap.in that case it has static dummy final object as a value.
It is used when we need to maintain the uniqueness of data.




