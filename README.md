Virtual table:-
=====================
Every object holds a pointer to a class handle, which contains a vtable. 
This pointer is set as soon as the object is allocated (with NEW) and before any constructors are called. 
So in Java, it is safe for constructors to make virtual method calls,
and they will be properly directed to the target's implementation of the virtual method.


/Protected - 
======================================
access in same package and child class   other classes through class
eg SimpleList ,protected elements[]
DynamicList extends SimpleList use elements[]

private - 
======================================
access within the inner class. private or any other can be static.

USE:- validation and controlled,or immutable object.
      less complexity

public -   throughout  the class.thorughout the all package.
======================================
Default -  package level. 
======================================
            

 Encapsulation - (data fields) 
======================================
Binding (or wrapping) method and data together into a single unit are known as encapsulation.
  
  we can hide only data fields in it..like the scope of resize an array is inside the class only
 so we can hide it from others..

* Encapsulation is data hiding it allows to have valid states of object.
  *field is private n methods are public.
  *we can reuse our code.
  *we can do validation at one level.(age is not be negative then we can check it at one level.)
  ArrayList versus array ,array has no encapsulation .Arraylist add hides complexity of resize when it's full.
  
["dipali","mona","sona","mina"]     To store a TrekkingGroup information if we take 3 arrays names[],ages[],cities[] 
25         29      33    16         if we add remove in one array then
P           M      A      N          data of persons can be mismatch if we didnt make changes in other array,bcz one person data
After deletion                      is not encapsulated.Instead of this we can take Person array, Person[] where person 
["dipali","sona","mina"]            has name age and city then it has some encapsulation ,while adding if person array is full 
25         29      33    16         resizing group or condition like add only 18+ age group ,it has to be done everywhere 
P           M      A      N         where person is added to group.
                                    If we make a  TrekkingGroup class with private Person array or list then in addMember
class TrekkingGroup{                 method any validation can be performed and group data in encapsulated inside it.
private Person[] members;
addMember(Person p){
validate age is >18 <60
if  array is full then resize
};
removeMember();
}
[a relative link] (src/test/java/coreJava/encapsulation/TrekkingGroupTest.java)
//Java Heap
person1<<name,age,city  >>    person2<<name,age,city>>  //one person can access only his/her data  fields directly

  * Data is modified at one place because fields are private and it is accessible only within the class.
    only this method can direct access of it.n others from getters and setters method.
    
    
Abstraction:- (types of implementation hiding)
=================================================
abstraction hides concrete implementation type.like we can have a CheckIfEqual method which is used to check equality 
for arraylist,linkedList.
List is an abstraction of arraylist and linkedlist so CheckIfEqual(List<Integer> listOne,List<Integer> listTwo)
same method can be used to check if two linkedlist or arraylist are equal.
CheckIfEqual(List<Integer> listOne,List<Integer> listTwo)
AbstractionCodeReuseTest

loose coupling : If there is a UserService and it has an abstract type SqlRepo then 
                 it is loosely coupled and if the implementation
                 changes from MySqlRepo to MongoRepo then UserService does not need to change.
UserServiceTest

*Abstraction hides the implementation details.
it can be method body.
*it allows loose coupling.
In system there is 3 kind of user men women and child.if we have to add User then we will have to call three separate 
  methods for them.but with the help of abstraction we can define abstract type of it which is person.
If those three classes has same functionality then we can add it in person class and override it into child class with extends keyword.


Inheritance:-
==================================================
When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. 
  It provides code reusability. It is used to achieve runtime polymorphism,  
*in that we can allows code defined in one class and other classes can be reused it.
*Ex.if we have a women class ,in that  we have taken  working and non working women .means we can inherit all the properties
of women in both the classes and also we can add others information in it like working women get salary.
so we dont write women functionality to the both sub classes.
AgeWeightComparator AgeWeightHeightComparator  , we can override(modify) specific behavior (only methods that we need)
,rest of methods will be accessible from parent class 

HeightWeightHairLengthComparator

 equals hashcode toString      
Class Child extends Object{
}
Child c 
c.toString

Class Child{
Object obj
boolean equals(Object o){
obj.equals(o);
}
}
c.equals

Polymorphism:-
==================================================
* In polymorphism, it calls dynamically on correct object type.
* It is also known as dynamic dispatch methods because method called resolved on run time type of object.
Example:--we have a women, man and child class and in that gethobby is a method.when we call getHobby of person then it will
            called on correct run time type of object and gives actual class hobby,
*overriden happens in run time type of polymorphism.


**Overloading
===================                                         
*  happens when in the same class if there is same method name and different parameters.
*it must be in same classes.                            
*the called resolved on compile time type of object.
* we can change access modifier.

*static method be overloaded.                   
*private final 
* compile time polymorphism (because the method called varies depending on compile time type of parameters)
*
Eg.List has add(position,element)   //list has add method and it takes position and element.
                                    //n other one is list takes only (element)
  list.add(element) ,
   list.add(10)                      //if we call on list.add(10) then it will call on list.add(10) 


**Overriding Polymorphism
===========================
When the method being called is present in multiple classes which are in an inheritance hierarchy then the
decision to call which method is based on run time type of the object.
*it must follow inheritance hirearchy.
*the called resolved on run time type of object.
*we cannot decrease the visibility of method when overriding.(if parent scope is
default then in child class it can be public but not private ).
//for eg addAll uses add ,if we could override add and make it private ,that would break addAll.
In SOLID
L is liskov substitution principle means ,if a method works on parent type it should work on child type also.
for eg addAll works on ArrayList , MyArrayList extends ArrayList and overrides add to make it
private then addAll will break
*private or static or final cannot be overridden.

*The protected method can be made public but not private in the subclass.
If we provide lesser access in the subclass than that in the superclass, then we will get a compile-time error.
* Run time polymorphism. non static not final method can be overriden.

//IMP-> if the method is non static then override method is resolved on
run time type of its object on which method is being called.

if the method is static ,it will be called on class only and can't be overriden
private and final can't be overriden  ,final College class getFees()  ,College college=new College() ; college.getFees();
final class cant be overriden

override example

If we take Loan as abstract class and it has three implementation class personal loan,home loan and gold loan.
and there is getRateOfInterest method().If we take loan.getRateOfInterest(new homeloan) it will gives the homeLoan.

Eg. HashCode And Equals:-
put(key,value)  get(key,value)

if we override the hashCode and equals Map.put and map.get method takes generic parameters.It calls hashCode of key object
to get bucket position.bcz of overriding(polymorphism) it will call on correct key object.

java.lang.object    person   man

map.put(man,10)    <---it will internally calls on hashCode of man class to find bucket position.
key.equal(map.entry.key)                     entry<- key value n next  <-node
It will call equals from correct man class.


Interface:-
==================================================
Interface is a type defines contract what behaviour it must have to do of that type.
It defines what but not how methods do.
eg. to be human you have to impplements all methods in interface like walk.talk,
It provides loose coupling.
Interface can extend interface.

 *It is mechanism to achieve fully abstraction.
 *There can be only abstract methods in the java interface not method body.
 * 

Abstract Class:-
=======================
if we know Partial implementation.
Abstract method 


String BUILDEr/buffer-
==================================================
Strings are immutable so if we want to change it ,everytime new object will have to create.
but with the help of buffer/builder we can append it n modify it .

builder n buffer- buffer is synchronized.(objects shared by multiple threads )
=====================
String is thread safe.

If we want  friends list from different sources then we have to take append(method) from single thread
then string Builder is used.buffer is already synchronized n it uses multiple thread.  

intern -
============


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


            Comparator
*Comparator interface is used to compare two or multiple elements
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

**ASSOCIATION: Association
================================
Association refers to the relationship between multiple objects. 
It refers to how objects are related to each other and how they are using each other's functionality.
Composition and aggregation are two types of association.

Aggregation and Composition
==============================
Aggregation
==============
Aggregation is a way to achieve Association.
Aggregation implies a relationship where the child can exist independently of the parent.

For example, Bank and Employee, delete the Bank and the Employee still exist.
It represents the weak relationship between objects.
It is another way to reuse objects.

Aggregation

Aggregation is a weak association. 
An association is said to be aggregation if both Objects can exist independently. 
For example, a Team object and a Player object.
The team contains multiple players but a player can exist without a team.


Composition   HAS -A - RELATIONSHIP
====================================
The composition is also a way to achieve Association. 
The composition represents the relationship where one object contains other objects as a part of its state. 
Composition implies a relationship where the child cannot exist independent of the parent.
There is a strong relationship between the containing object and the dependent object.
It is the state where containing objects do not have an independent existence. 
If you delete the parent object, all the child objects will be deleted automatically. 


The composition is the strong type of association.
If an Object depends on another object and another object cannot exist without the owner object. 
Consider the case of Human having a heart. 
Here Human object contains the heart and heart cannot exist without Human.



Generics:-
================

//Java generic feature added into java language from java5.
Generic allows us to create parametrized types ,we can re-use same class with different type parameters.
The compiler checks at compile time if all usages of that instance match the specified parameter type in generics .
For eg->List<String> list=new ArrayList<>() , list is one instance and it's usages will be checked by compiler for type match
We can create List<String>, List<Integer> or list of any type with the same List class and it gives compile time safety
as we can only add or get strings in a List<String> .
Without generics ,for eg in a raw type list we can add multiple type in list but
at run time we have to type cast it from Object to our specific type and it can fail
with classCastException ,if the type is not correct.The responsibility is on caller of List to type cast it correctly.

If we have a list n we added string to it  get from list n assign to integer then it will allow but
it will fail at run time with class cast exception.,
but with generics it would be compiler error.
Java generic gives compile time safety.

Generics also done by inserting casts but compiler checks all usages are matching the
parameterised type so it can't fail.
Type erasure , generics are erased after compilation.

@see com.my.package.Class#rawArrayListIsUnsafe()
[a relative link](src/test/java/coreJava/collections/CollectionOfArrayListTest.java)
//(Integer)list.get(i) 




Iterable :
================
Abstraction of types that can be iterated using iterator ,iterate over big data set .
An Iterable can represent group of objects whose size is not known .
It can be like a FacebookFeed where all objects are not loaded in memory
and can provide an iterator implementation to iterate over large data set .For eg iterator can query from db 
or another web service on next() calls
It is root(parent) of all collections .List ,Set,Queue all are iterable 

/**Iterator:-
==========================================================================
* Iterator is an interface it encapuslated the iteration logic 
  which is applied on collection of objects which can be iterable.
* collection framework provide iterator for it's implementations..eg.arraylist ,linkedlist are implementations of Collection
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
* when listIerator.remove() is called both iterator expected count and actual count decrease
* so no exception is thrown.



Collections:-
=======================================================================
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
Java Collections can achieve all the operations that you perform on a data such as searching, sorting, 
insertion, manipulation, and deletion. Java Collection means a single unit of objects.

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

we can get elements easily bcz we know position.(memory allocation is continuous so access direct access
eg int[]a =new int[10]  and a[4] will be at address size of int*4 )


TreeMap:=
=================================================================================
It provides an efficient means of storing key-value pairs in sorted order.
    Java TreeMap contains values based on the key. 
It implements the NavigableMap interface and extends AbstractMap class.
    Java TreeMap contains only unique elements.
   // Java TreeMap cannot have a null key but can have multiple null values.
    Java TreeMap is non synchronized.
    Java TreeMap maintains ascending order.

TreeMap is a balanced binary search tree.
It has key and value.
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
map.put(new Person("Dipali"),"hachi") 
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
Null key/values 	        Only one null key & multiple values 	    Only one null key & multiple values
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

Solutions on Producer and Consumer Problems:-
=================================================






//checked unchecked exception

//final :  final can be initialized only once , they can be initialized during declaration 
            or in constructor if they are class fields

finally : try ,catch will always run once ,clean up can be done ,close()
          try(Connction c:c.getConn()){} //auto after try , try with resources

The finally block in java is used to put important codes such as clean up code 
e.g. closing the file or closing the connection. 
The finally block executes whether exception rise or not and whether exception handled or not.

finalise : not guaranteed to run , finalize method runs on garbage collection.

//Inner class :-
====================
class inside the class.For eg If ListIterator is non static inner class of List,then List object
needs to be created first and ListIterator object will have reference to list object.

InstanceOf (operator):-check Run time type.



static class:-
=================
Static is like a normal top level class,inside namespace of outer class .
It's object is created directly without outer class object.
It does not have reference to its outer class object.
          class House{      static class Window{} }
new pkg.House.Wndow() //House object not needed to created window.

A static nested class may be instantiated without instantiating its outer class.
Inner classes can access both static and non-static members of the outer class.
A static class can access only the static members of the outer class.

Private class :- 
===================
This class is only accessible inside class.only inner class can be private.
 Only that class has access of it.

//Immutable class :
====================
It has private constructor ,
                   public method which calls private constructor and returns created object
                   no setter and getters
                   return copy if returning a reference type which is not immutable.  
    
The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
The class is final so we cannot create the subclass.
There is no setter methods i.e. we have no option to change the value of the instance variable.

These points makes this class as immutable.

Wrapper class:-
====================
A Wrapper class is a class whose object wraps or contains primitive data types. 
When we create an object to a wrapper class, it contains a field and in this field, 
we can store primitive data types. 
In other words, we can wrap a primitive value into a wrapper class object.

Serializable Interface :=     (to convert object state,without object how will we send data to server )     
=======================================================
The Serializable interface is present in java.io package.To use Java serialization a class has to implement Serializable.
Other serializations are json ,xml based(text) which are language/platform independent. JVM generates additional metadata for
serializable objects to represent their serialized structure.
Serialization is a mechanism of converting the state of an object into a byte stream(binary) that allows to send on socket file.
Static and transient fields are not serialised ,they are not part of object state.
Serialization is done using ObjectOutputStream.
Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
All fields of serialization must be serializable..or transient..


Why;-
========
Object in memory representation to a representation which can be sent over a network/file .

Transient:-
=================
if we don't want to save value of a particular variable in a file, then we use transient keyword. 
When JVM comes across transient keyword, it ignores original value of the variable and save default value of 
that variable data type.

Serializable Marker Interface:-
====================================
It checks the interface is serializable or not..
They are used because we are telling to JVM that , that class have special behaviour.
(means extra information needs to be included in objects of this class ,in object header metadata like total fields 
,offsets,sizes(from to to size of field)).
Serializable is a marker interface means that it contains no methods. 
Therefore, a class implementing Serializable does not have to implement any specific methods. 
Implementing Serializable just tells the Java serialization classes that this class is intended for object serialization.

Externalizable
=====================
Externalization provides implementation logic control to the application by overriding readExternal and writeExternal methods.



collection definiion:-
checked unchecked/solid/

Thread -Runnable versus thread
executorService
volatile ,lock,synchronised

Concurrent Collection 
ConcurrentHashMap

java8 lambda ,streams

Socket Connection , 3way tcp handshake , SeverSocket and Socket
Udp socket (datagram)
blocking and non blocking IO

Stream versus Reader classes
BufferedReader , BufferedInputStream

Spring dependency injection  (component scanning and creation of object using reflection )
MVC design 
Transaction management


