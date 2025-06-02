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


Iterator:-
==================================
An iterator is a universal cursor that can be applied to any collection object.
It provides a single direction iteration. By using an iterator, we can perform both read and remove operation,
but we cannot perform replace operation. Iterator must be used whenever we want to enumerate elements in
all collection framework implemented interfaces like Set, List, Queue, DeQue, and also implemented classes
of Map interface.
Iterator object can be created by calling iterator() method present in the Collection interface

/**Iterator:-
==========================================================================
* Iterator is an interface it encapsulated the iteration logic
  which is applied on collection of objects which can be iterable.
* collection framework provide iterator for it's implementations.eg.arraylist ,linkedList are implementations
  of Collection.
* Any Iterable has to provide iterator() .
* It has hasNext(),next(),remove() method.
* HasNext() method return boolean value ,if the iterable list has more elements to iterate then it return true value.
* Next() method is used to call the next elements in the list. If the iterator has no next element to iterate
  then it throws NoSuchElementsException.
* if we called iterator without next method then it throws IllegalStateException.bcz when we called for remove
  method then iterator check their expected count and actual size of elements.Then if it  will not be matched then 
  he throws IllegalStateException bcz size of list elements always checked when we use next method.
* Remove() method remove the last elements which is called by next() method.
* it is uni directional.It moves forward direction only.


**Why Iterator throws ConcurrentModificationException:-
=========================================================================
* iterator has expected count field (==list size) ,while iterating it will check if expected count==size(actual count).
* if list is directly modified (list.add() or list.remove()) then expected count will not be equal to actual count
  this is treated as concurrent modification and exception is thrown
* This is fail fast iterator.
* when listIterator.remove() is called both iterator expected count and actual count decrease
* so no exception is thrown.

Enumerator:-
=============================
Enumeration is an interface. 
It is used in the collection framework in java to retrieve the elements one by one. 
Enumeration is a legacy interface that is applicable only for legacy classes like Vector, HashTable, Stack, etc. 
It provides a single direction iteration. By using enumeration, we can perform only read operation, 
and we cannot perform remove operation.
Enumeration object can be created by calling elements() method present in the Vector class.

**Comparable And Comparator:-
==================================
            Comparable                                             
*comparable interface is used to compare single elements    
*A comparable object is capable of comparing itself with another object                                                
*It has compareTo() method.                                   
*it is in java.lang.package

syntax---compareTo(one object passed to compare with this.object itself)

Comparison logic is coupled in comparable .
comparable is tightly coupled with that class to check object comparison.
It is also used to compare the current instance with another object of same type.

      Comparator
===================================
*Comparator interface is used to compare two or multiple elements
The Comparator interface is used to sort elements that compare two objects and provides additional comparison method.
*It implements comparable.
*It has compare() method to compare.
*it is in java.util package
syntax-> compare(two objects passed )

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
If we remove elements from middle of first position then it then all elements will be shuffle.
cache friendly bcz continuous memory allocation.when the page is loaded in memory then other elements 
are in same place.
fixed memory allocation.
Dynamic array (if array size full then it internally create new array).so memory could be wasted.
in special case adding at last n there is spcae in internal array then complexity is o(1).
o(n)-to add or remove element from any position.

LinkedList:-
========================================================================
The linked List node is encapsulated in it.
get element complexity is O(n) in worst case.
Need not shuffle while adding or removing elements.
At start complexity is O(1) to get element.

It only has Sequential access with linked node .
Non cache friendly because memory allocation is not continuous so when a page is loaded in memory ,
chances are less that other elements will be in same page (unlike in an array )

It is dynamic memory allocation.
Memory will allocate dynamically so no waste.
Doubly Linked List additional memory will take for adding new node ,prev code.

If too many elements removes then use linked list otherwise use arrayList. <-When to use
========================================================================================
we can get elements easily bcz we know position.(memory allocation is continuous so direct access
eg int[]a =new int[10]  and a[4] will be at address size of int*4 )


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
============================================================================================================
Its a mapping between object to integer for even distribution in hash based structure like hashMap,hashSet.
It allows constant time to get and put element.                                         O(1)->constant time
Equal objects should have equal hashCode.   (a.equals(b)).
and Unequal objects may have same hashCode due to collision but that can be minimized using a good hash function.
First position is found using hashCode % array size ,in that entry will be found using equals.
If we want logical equality (not identity ,memory address based) then we need to override equals.

for eg "dog" new String("dog") , not same by == but are logically same ,
p1=new Person("Jaanhvi") p2=new Person("Jaanhvi").

for new objects to be equal which are logically same we have to override equals.

Also if in a class we override equals but not hashcode then it will not behave correctly when used in a HashMap,HashSet.
map.put(new Person("Jaanhvi"),"hachi")       =============
map.get(new Person("Jaanvi") should have returned "hachi"  ,Even if keys are equal by equals since new object has different  ,
hashcode so it will check at different position so it will not be found and will return null.
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

LinkedHashMap:-
========================================================================
Its iterator gives element in insertion order.
Internally it uses a doubly linked list in addition to hashMap to maintain insertion order .
It internally use 
complexity   <---O(1)
non synchronized
non thread safe

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
Add---it will throw exception while adding element if blockingQueue is full.
Offer---Offer will returns false if queue is full.It returns immediately or after waiting given time out.

Remove---it will throw exception while removing element if blockingQueue has no element..
Poll---Poll will returns null value if queue is empty.It returns immediately or after waiting given time out.

this is for blocking queue only.

Take--Take wait(blocks calling thread) wait until an element is available.

Example:--
Producer consumer ,Reader Writer:-Problem
The producer consumer pattern is a concurrency design pattern where one or more producer threads produce objects
which are queued up, and then consumed by one or more consumer threads.

//When queue is full then put() will block the thread trying to add until there is capacity. 
               //roti dabba full then wait to space to be available
//When queue is empty then take() will block the thread trying to remove until there is an element.


A blocking queue is a queue that blocks when you try to dequeue from it and the queue is empty, 
or if you try to enqueue items to it and the queue is already full.  
A thread trying to dequeue from an empty queue is blocked until some other thread inserts an item into the queue. 
A thread trying to enqueue an item in a full queue is blocked until some other thread makes space in the queue, 
either by dequeuing one or more items or clearing the queue completely.

A BlockingQueue with one thread putting into it, and another thread taking from it.

Abstract class:- and Interface
=======================================
The purpose of Abstract class is to have partial implementation,i.e it needs to have at least one abstract method and 
partial initialization can be done in abstract class constructor.
It's constructor will be called when Child class object is created 
eg AbstractList (implements equals method) ,helps in code reuse

The purpose of Interface is to define a contract on what behaviors will an object have(i.e methods declarations)
Since java8 interface can have default method implementations (because earlier if method was added to interface
all it's implementation will have to be modified to add the new method).
It can't have constructor (i.e any object initialisation logic)
eg: List  only defines methods like add,remove,get //pure abstraction

2)A class can extend only one abstract class ,so it cannot be extend any other class 
Interface is more loosely coupled ,if a class implements an interface ,it can implement other interfaces.
for eg: ArrayList implements Iterable Serializable 

Interface can only have public static final fields ,Abstract class can have any type of fields
All methods in interface are implicitly public ,abstract can have private,protected ,default or public methods


Hashmap vs Hashtable:-
==========================
HashMap and HashTable are both key-value storage classes in Java. HashMap is non-synchronized, making it faster
for single-threaded tasks, while HashTable is inherently synchronized, providing thread safety. HashTable doesn’t
allow any null keys or values, but HashMap lets you have one null key and several null values. Additionally,
HashMap can be molded to retain insertion order or sorted order using its various implementations, whereas
HashTable doesn’t guarantee any particular order for its entries.

HashMap
A hashmap is a class that is a part of the Java collection framework since Java 1.2. 
This class belongs to java.util package. Java's Map interface can be implemented using this hashmap class.
It usually stores the data in key, value pair (key, value), and you can access the value with the help of key
in constant time, for example, an Integer. Inside a hashmap, one object is used as a key (index) to another 
object (value). If there is a key already existing in the hashmap and we again try to insert the same key, 
this time with a different value, then the value will be replaced with the new one of the corresponding key.

Syntax :
HashMap<Integer,String> hm = new HashMap<Integer,String>();

Example :
import java.util.*;
import java.lang.*;
import java.io.*;

// Name of the class has to be "Main"
// only if the class is public
class MyClass
{
public static void main(String args[])
{
// Creating HashMap class object
HashMap<Integer,String> hm=new HashMap<Integer,String>();

        // Adding data inside the HashMap
        hm.put(10,"Ball");
        hm.put(20,"Bat"); 
        hm.put(30,"Wicket");
        hm.put(40,"Tennis bat");
        
        // Printing the key and value of HashMap
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

Output :
-----------Hash map-----------
20 Bat
40 Tennis bat
10 Ball
30 Wicket

HashTable
============
A hashtable is a class that is a part of the Java collection framework.
It implements a hash table, and it stores the data in key value pair (key, value). Inside a hashtable, we can
store any non null object like a key or a value, that is, null values and keys are not allowed in hashtable.
To store and retrieve objects successfully from a hashtable, the objects used as a key must implement the 
hashCode method and the equals method, that is the object which is used as a key is hashed, and the resulting
hashCode which we get after hashing the object key is used as an index to get the value which is associated 
with the object key.

Although HashMap and HashTable are similar, there are certainly notable differences between,
Syntax :
Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
Example :
import java.util.*;
import java.lang.*;
import java.io.*;

// Name of the class has to be "Main"
// only if the class is public
class MyClass
{
public static void main(String args[])
{
// Creating HashTable class object
Hashtable<Integer,String> ht=new Hashtable<Integer,String>();

        // Adding data inside the HashTable
        ht.put(10,"Cricketers");
        ht.put(20,"Footballers");
        ht.put(30,"Boxer");
        ht.put(40,"Swimmer");
        
        // Printing the key and value of HashTable
       System.out.println("-------------Hash table--------------");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
Output :-------------Hash table--------------
10 Cricketers
20 Footballers
30 Boxer
40 Swimmer

Key Difference Between HashMap and HashTable
The main difference between HashMap and HashTable is their approach to synchronization and thread safety. 
While HashTable is inherently synchronized, ensuring that only one thread can access it at a time, HashMap
is non-synchronized, allowing simultaneous access by multiple threads. This makes HashMap generally faster 
in single-threaded scenarios, due to the absence of synchronization overhead.

Why HashTable Doesn’t Allow null and HashMap Do?
A HashTable stores the object in the key, value pair. In order to store and retrieve the object successfully,
the object which is used as a key must implement the hashCode method and the equals method. Since null is not
an object, it cannot implement these hashCode method and the equals method. So if we store null inside the
HashTable, it will not work and throw a null pointer exception error. However, HashMap is a modern version
of HashTable and it was created later. It will allow one null key and any number of null values.

Conclusion
HashMap is a class within the Java collection framework introduced in Java 1.2. It implements the Map 
interface and stores data as key-value pairs.
HashTable implements a hash table and similarly stores data as key-value pairs.
For successful storage and retrieval in a HashTable, keys must implement both the hashCode and equals methods.
The key’s hashCode, derived post-hashing, serves as an index to retrieve its associated value. Only non-null
objects can be stored as keys or values.

HashMap is non-synchronized, while HashTable is synchronized.
HashMap can accommodate one null key and multiple null values. In contrast, HashTable prohibits both null 
keys and values, leading to a NullPointerException upon attempting such insertions.
Altering a HashMap during iteration can result in a ConcurrentModificationException. However, modifying a 
HashTable under the same conditions doesn’t raise any exceptions.
HashTable disallows null keys and values because, to function correctly, keys must implement the hashCode 
and equals methods. Since null isn’t an object, it doesn’t implement these methods, and attempting to store 
null in a HashTable results in a NullPointerException.


15. Can you tell us the difference between the fail-safe and fail-fast iterator in java? - fail fast
fail-fast iterator– It fails as soon as they realize that the structure of the collection is changed since
the beginning of the iteration. The structural changes here are removing, adding, or updating any element
from the collection when one thread is iterating over that other collection. The fail-fast can be implemented
by maintaining a modification count. When the iteration thread will realize the change in the count, it throws
ConcurrentModificationException.

fail-safe iterator in Java- It does not throw an Exception when the collection is modified in a structural
manner while one iteration is working over it. It works on the clone collection instead of the original 
collection.

ConcurrentHashMap
ThreadSafe: One of the most significant differences between both is that a Cocurrenthashmap is synchronized
internally and thread-safe which makes it suitable for a multithreaded environment whereas a hashmap is 
non-synchronized as well non-thread-safe which makes it unsuitable for a multithreaded environment.
Null Keys And Null Values: As we all know, data is kept in the form of key and value pairs in a hashmap and
we can store as many null values in a hashmap as we want but only 1 null key can be stored whereas in a
concurrent hashmap null keys, as well as null values, are not permitted.