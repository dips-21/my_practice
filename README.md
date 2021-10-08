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
            
JVM:-  Java virtual machine is an abstract machine.It is specification that provides run time environment in which java bytecode
can be executed.JVM performs loads code,verifies code,executes code,provides run time env.
JVM provides the memory area,class file format,register set ,garbage collector heap.

CLassloader is sub type of jvm which loads the class files.whenever we run the program it is loaded first by the classloadder.
* bootstrap classloader- it loads the jar.file which contains all class files of java std edition like java.lang package,
java.util,java.io package 

extension:-This is the child classloader of Bootstrap and parent classloader of system classloader.

system/Application classloader:- this is the child classloader of extension classloader..It loads the classfiles from classpath.
by default,classpath is set to current directory.

Execution Engine:-It contains
===============================
Interpreter :-read bytecode stream then execute the instructions.
Just in time(JIT)compiler:-here compiler refers to translator from the instruction set of a java virtual machine to instruction
set of specific cpu.
A Virtual processor.

 Encapsulation - (data fields) 
======================================
Binding method and data together into a single unit are known as encapsulation.
we can hide only data fields in it..like the scope of resize an array is inside the class only
 so we can hide it from others..
  ArrayList versus array ,array has no encapsulation .Arraylist add hides complexity of resize when it's full.
* Encapsulation is data hiding it allows to have valid states of object.
  *field is private n methods are public.
  *we can reuse our code.
  *we can do validation at one level.(age is not be negative then we can check it at one level.)
  
  
["dipali","mona","sona","mina"]     To store a TrekkingGroup information of person if we take 3 arrays names[],ages[],cities[] 
25         29      33    16         if we add remove in one array then
P           M      A      N          data of persons can be mismatch if we didnt make changes in other array,bcz one person data
After deletion                      is not encapsulated.Instead of this we can take Person array, Person[] where person 
["dipali","sona","mina"]            has name age and city then it has some encapsulation ,while modifying data of one peroson 
                                    will not affect on data of another person if person array is full 
25         29      33    16         resizing group or condition like add only between 18 to 25 age group must be added in group
                                    ,it has to be done everywhere  where person is added to group.
P           M      A      N       
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
 
    Benefits: reduces complexity ,better control over data
    
Abstraction:- (types of implementation hiding)
=================================================
abstraction hides concrete implementation type.like we can have a CheckIfEqual method which is used to check equality 
for arraylist,linkedList.
List is an abstraction of arraylist and linkedlist so CheckIfEqual which takes two parameters as a list
not arraylist n linked list.(List<Integer> listOne,List<Integer> listTwo)
same method can be used to check if two linkedlist or arraylist are equal.
CheckIfEqual(List<Integer> listOne,List<Integer> listTwo)
AbstractionCodeReuseTest

loose coupling : If there is a UserService and it has an abstract type SqlRepo then 
                 it is loosely coupled and if the implementation
                 changes from MySqlRepo to MongoRepo then UserService does not need to change.
implemented using interface and abstract class
UserServiceTest

it can be method body.

In system there is 3 kind of user men women and child.if we have to add User then we will have to call three separate 
  methods for them.but with the help of abstraction we can define abstract type of it which is person.
If those three classes has same functionality then we can add it in person class and override it into child class with extends keyword.


Inheritance:-
==================================================
*When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. 
*It provides code reusability. 
*It is used to achieve runtime polymorphism,  
*In that we can allows code defined in one class and other classes can be reused it.

*Ex.if we have a women class ,in that  we have taken  working and non working women .means we can inherit all the properties
of women in both the classes and also we can add others information in it like working women get salary.
so we dont have to write women functionality to the both sub classes.
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
* In polymorphism, calls resolved  dynamically on correct object type.
* It is also known as dynamic dispatch methods because method called resolved on run time type of object.
Example:--we have a women, man and child class and in that gethobby is a method.when we call getHobby of person then it
         will called on correct run time type of object and gives actual class hobby,
*overridden happens in run time type of polymorphism.


**Overloading
===================                                         
*  In the same class there can be methods with same name but different parameters ,the decision on
   which method will be called is made on the compile time type of parameters.The most specific matching method is called
   If there is no unique match then it's a compile time error.
*it must be in same classes.                            
*the called resolved on compile time type of object.
* we can change access modifier.

*static,*private ,final  method be overloaded.                   

* compile time polymorphism (because the method called varies depending on compile time type of parameters)
*
Eg.List has add(position,element)   //list has add method and it takes position and element.
                                    //n other one is list takes only (element)
  list.add(element) ,
   list.add(10)                      //if we call on list.add(10) then it will call on list.add(10) 


**Overriding Polymorphism
===========================
When the method being called is present in multiple classes which are in an inheritance hierarchy then the
decision to call which method is based on run time type of the object.obj has virtual pointer n it points to virtual table.
virtual table of it's class has location of all function of that class.
*it must follow inheritance hirearchy.
*private or static or final cannot be overridden.
*we cannot decrease the visibility of method when overriding.(if parent scope is
default then in child class it can be public but not private ).
//for eg addAll uses add ,if we could override add and make it private ,that would break addAll.
In SOLID
L is liskov substitution principle means ,if a method works on parent type it should work on child type also.
for eg addAll works on ArrayList , MyArrayList extends ArrayList and overrides add to make it
private then addAll will break


*The protected method can be made public but not private in the subclass.

If we provide lesser access in the subclass than that in the superclass, then we will get a compile-time error.
* Run time polymorphism. non static not final method can be overriden.

//IMP-> if the method is non static then override method is resolved on
run time type of its object on which method is being called.

if the method is static ,it will be called on class only and can't be overriden
private and final can't be overriden  ,final College class getFees()  ,College college=new College() ; college.getFees();
final class cant be overriden

override example
==============================
Ex...If we take Loan as abstract class and it has three implementation class personal loan,home loan and gold loan.
and there is getRateOfInterest method().If we take loan.getRateOfInterest(new homeloan) it will gives the homeLoan.
======================================================================================================================
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
eg. to be human you have to implements all methods in interface like walk.talk,
It provides loose coupling.
Interface can extend interface.

 *It is mechanism to achieve full abstraction.
 *There can be only abstract methods in the java interface not method body.
 * It contains a declaration part only.

Multiple inheritance can be achieved using interface.
It doesn’t contain a constructor.
It doesn’t contain static members.
It contains public access modifier since everything in an interface is considered public.
The performance of interface is not good.
It is slow since it needs time to search for an actual method in the respective class.
It is used to implement peripheral abilities of a class.
It can use multiple interface.
If multiple implementations share methods, then the ‘Interface’ can be used.
Interface can contain methods only.
It needs to be fully implemented.

Abstract Class:-
=======================
if we know Partial implementation.
It contains the declaration and definition part.
Multiple inheritance can’t be implemented using abstract class.
It contains the constructor.
It can also contain some static members.
It can contain multiple types of access modifiers such as public, private, protected.
The performance of an abstract class is very good, because it is quick.
It is used to implement the core identity/functionality of a class.
A class can use only one abstract class.
If many implementations are same, and they have a common behaviour, it is suggested to use an abstract class.
Abstract classes contain methods, fields, constants.
It can be fully implemented, partially implemented or not even implemented.


String BUILDEr/buffer-
==================================================
Strings are immutable so if we want to change it ,everytime new object will have to be  created.
but with the help of buffer/builder we can append it n modify it .

builder n buffer- buffer is synchronized.(objects shared by multiple threads )
=====================
String is thread safe.

If we want  friends list from different sources then we have to take append(method) from single thread
then string Builder is used.
Buffer is already synchronized n it uses multiple thread.  

intern -
============
returns the canonical representation of the string



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


Solutions on Producer and Consumer Problems:-
=================================================

Exceptions:-
----------------------
Exception vs error;-
=====================
Exceptions and errors both are subclasses of Throwable class.
The error indicates a problem that mainly occurs due to the lack of system resources and our application should not catch 
these types of problems. Some of the examples of errors are system crash error and out of memory error.
Errors mostly occur at runtime that's they belong to an unchecked type.

Exceptions are the problems which can occur at runtime and compile time.
It mainly occurs in the code written by the developers.  
Exceptions are divided into two categories such as checked exceptions and unchecked exceptions.

Sr. No.	                                    Key	Error	                                            Exception
1                                             Type        `                                           Package
                                Classified as an unchecked type                     Classified as checked and unchecked

2  .                                          Package
                                    It belongs to java.lang.error                      It belongs to java.lang.Exception

3                                  Recoverable/ Irrecoverable
                                       It is irrecoverable                              It is recoverable


4                              It can't be occur at compile time
Example
                                OutOfMemoryError ,IOError                               NullPointerException , SqlException





Checked Exceptions
=============================
They occur at compile time.
The compiler checks for a checked exception.
These exceptions can be handled at the compilation time.
It is a sub-class of the exception class.
The JVM requires that the exception be caught and handled.
Example of Checked exception- ‘File Not Found Exception’

A checked exception is an exception that occurs at the compile time, these are also called as compile time exceptions. 
These exceptions cannot simply be ignored at the time of compilation; 
the programmer should take care of (handle) these exceptions.

For example, if you use FileReader class in your program to read data from a file,
if the file specified in its constructor doesn't exist, then a FileNotFoundException occurs,
and the compiler prompts the programmer to handle the exception.

Unchecked Exceptions
================================
These exceptions occur at runtime.
The compiler doesn’t check for these kinds of exceptions.
These kinds of exceptions can’t be caught or handled during compilation time.
This is because the exceptions are generated due to the mistakes in the program.
These are not a part of the ‘Exception’ class since they are runtime exceptions.
The JVM doesn’t require the exception to be caught and handled.
Example of Unchecked Exceptions- ‘No Such Element Exception

An unchecked exception is an exception that occurs at the time of execution. 
These are also called as Runtime Exceptions.
These include programming bugs, such as logic errors or improper use of an API.
Runtime exceptions are ignored at the time of compilation.

For example, if you have declared an array of size 5 in your program, and trying to call the 6th element of the array then 
an ArrayIndexOutOfBoundsException exception occurs.
===================================================


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



