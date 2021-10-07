COLLECTIONS:-
=======================================================================
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
Java Collections can achieve all the operations that you perform on a data such as searching, sorting,
insertion, manipulation, and deletion. Java Collection means a single unit of objects.

Iterable :
================
Abstraction of types that can be iterated using iterator ,iterate over big data set .
An Iterable can represent group of objects whose size is not known .
It can be like a FacebookFeed where all objects are not loaded in memory.
and can provide an iterator implementation to iterate over large data set .For eg iterator can query from db
or another web service on next() calls
It is root(parent) of all collections .List ,Set,Queue all are iterable .

/**Iterator:-
==========================================================================
* Iterator is an interface it encapsulated the iteration logic
  which is applied on collection of objects which can be iterable.
* collection framework provide iterator for it's implementations..eg.arraylist ,linkedlist are implementations
  of Collection.
* Any Iterable has to provide iterator() .
* It has hasnext(),next(),remove() method.
* HasNext() method return boolean value ,if the iterable list has more elements to
  iterate then it return true value.
* Next() method is used to called the next elements in the list.if the iterator has no next element to iterate
  then it throws NosuchElementsException.
* if we called iterator without next method then it throws IllegalStateException.bcz when we called for remove
  method then iterator check their expected count and actual size of elements.then if it  will not be matched then he throws
  IllegalStateException bcz size of list elements always checked when we use next method..
* Remove() method remove the last elements which is called by next() method.
* it is uni directional.It moves forward direction only.


**Why Iterator throws ConcurrentModificationException:-
=========================================================================
* iterator has a expected count field (==list size)
  while iterating it will check if expected count==size(actual count)
* if list is directly modified (list.add() or list.remove())
  then expected count will not be equal to actual count
  this is treated as concurrent modification and exception is thrown
* This is fail fast iterator.
* when listIterator.remove() is called both iterator expected count and actual count decrease
* so no exception is thrown.


**Comparable And Comparator:-
==================================
            Comparable                                             
*comparable interface is used to compare single elements    
*A comparable object is capable of comparing itself with
another object                                                
*It has compareTo() method.                                   
*it is in java.lang.package

syntax---compareTo(one object passed to compare            
with this.object itself)

Comparison logic is coupled in comparable .
comparable is tighly coupled with that class to check object comparsion.
It is also used to compare the current instance with another object of same type.


      Comparator
=======================
*Comparator interface is used to compare two or multiple elements
The Comparer interface is used to sort elements that compare two objects and provides additional comparison method.
*It implements comparable.
*It has compare() method to compare.
*it is in java.util package
syntax--compare(two objects passed )

comparable and comparator returns positive negative and 0 values.
*if the first element is greater than second then it returns -1 negative integar.
*if the second element is greater than first then it returns 1 positive integar.
* if both objects are equal then it returns 0 value.
  *It throws null pointer exception if we pass null values to them.

Logically, Comparable interface compares “this” reference with the object specified
and Comparator in Java compares two different class objects provided.

we can write more than one custom comparators as you want for a given type,
comparable example we could just sort by only one attribute,
i.e., age but in the comparator,we can use different attributes like weight, name, and year.

ArrayList
=======================================================================
In arraylist the array is encapsulated in it.

Complexity of get element is O(1).
If we remove elements from it then it will be shuffle if elements is at middle or first .
cache friendly bcz continuouse memory allocation.
fixed memory allocation.
Dynamic array (if array size full then it internally create new array).so memory could be wasted.


LinkedList:-
========================================================================
The linked List node is encapsulated in it.
get element complexity is O(n) in worst case.
Need not shuffle while adding or removing elements.
At start -O(1) to get element.


Sequential access with linked node.
Non cache friendly because memory allocation is not continuous so when a page is loaded in memory ,
chances are less that other elements will be in same page (unlike in an array )

It is dynamic memory allocation.
Memory will allocate dynamically so no waste.
DOubly Linked List additional memory will take for adding new node ,prev code.

If too many elements removes then use linked list otherwise use arrayList. <-When to use
========================================================================================
we can get elements easily bcz we know position.(memory allocation is continuous so direct access
eg int[]a =new int[10]  and a[4] will be at address size of int*4 )


Map is an interface.It is a data structure which is used to store key and value pair and we can get/remove value using key..
while Set is collection of unique elements which internally uses map and a static final dummy object as dummy value  
in the map.   
implementation <------linkedHashSet,HashSet,TreeSet
For eg : map word count ,   <----                     
set : store unique words ,find first duplicate


TreeMap:=
=================================================================================
It provides an efficient means of storing key-value pairs in sorted order.
Java TreeMap contains values based on the key.
It implements the NavigableMap interface and extends AbstractMap class.
Java TreeMap contains only unique elements.
Java TreeMap is non synchronized.


TreeMap is a balanced binary search tree.
It has key and value.
Java TreeMap maintains ascending order.
it has sorted order based on comparator if we passed comparator then it will use comparator ,if key type is comparable
then and we didnt pass comparator then it will use comparable..If key type is not comparable n we dont pass comparator
then it will gives class cast exception.


HashCode and Equals:-
=================================================================================
HashSet contains only Keys whereas HashMap contains an entry(key and value).
Mapping between key(object) to integer is known as hashing.

Its a mapping between object to integer for even distribution in hash based structure like hashMap,hashSet.
It allows constant time to get and put element.                                         O(1)->constant time
Equal objects should have equal hashCode.   (a.equals(b))
and Unequal objects may have same hashCode due to collision but that can be minimized using a good hash function.
First position is found using hashCode % array size ,in that entry will be found using equals.
If we want logical equality (not identity ,memory address based) then we need to override equals.

for eg "dog" new String("dog") , not same by == but are logically same ,
p1=new Person("Dipali") p2=new Person("Dipali").

for new objects to be equal which are logically same we have to overrride equals.

Also if in a class we override equals but not hashcode then it will not behave correctly when used in a HashMap,HashSet.
map.put(new Person("Dipali"),"hachi")       =============
map.get(new Person("Dipali") should have returned "hachi"  ,Even if keys are equal by equals since new object has different hashcode ,
so it will check at different position so it will not be found and will return null.
GET/PUT  First find position using hashcode, then find entry in that bucket using equals.
If we dont override HashCode and Equals then we will not get element at same position if we put it earlier on that position.


coreJava.collections.HashMapTest
HashMap takes key and value.
HashMap
Use of hashcode :
Use of equals :
Person(age ) hashcode(){return age;)  //not even distribution
new Person("Dipali") //hashcode = 56 ,hashcode%size of array =1 , in array at position 1
new Person("Dipali") can be 60 , 60%5=0
int result=0                             //object.hash(built in method java util.library)
result = 31 * result + age;              //collision
result = 31 * result +pincode;
result = 31 * result +name.hashcode();
return result
= = = = =

LinkedHashMap:-
========================================================================
Its iterator gives element in insertion order.
Internally it uses a queue in addition to hashMap.
complexity   <---O(1)


Comparison Table of LinkedHashMap and HashMap
=======================================================================
Consider the below comparison table of HashMap and LinkedHashMap:
Property 	                           HashMap 	                            LinkedHashMap
===============                 =====================                   =====================
Order of Iteration          	   No guarantee order  	                    Insertion order
Implements (Interface) 	                 Map 	                                  Map

Implementation 	                        Buckets 	                        Double-linked buckets
Synchronized 	                    Non-synchronized 	                      non-synchronized
Performance 	                         Fast 	                          Almost Similar to HashMap
Extends 	                        AbstractMap class 	                        HashMap class
Memory 	                                Low Memory                  	More memory as compared to HashMap.
Thread-safety 	                    Non-thread-safe 	                        Non-thread-safe



Queue:-
================================================================================
It is FIFO data structure.
It has poll,remove,add,offer methods.
Add---it will throws exception while adding element if blockingQueue is full.
Offer---Offer will returns false if queue is full.It returns immediately or after waiting given time out.

Remove---it will throws exception while removing element if blockingQueue has no element..
Poll---Poll will returns null value if queue is empty.It returns immediately or after waiting given time out.

this is for blocking queue only.

Take--Take wait(blocks calling thread) wait until an element is available.

Example:--
//Producer consumer ,Reader Writer:-

//When queue is full then put() will block the thread trying to add until there is capacity.   //roti dabba full then wait to space to be available
//When queue is empty then take() will block the thread trying to remove until there is an element.
