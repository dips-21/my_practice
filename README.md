Virtual table:-
=====================
Every object holds a pointer to a class handle, which contains a vtable. 
This pointer is set as soon as the object is allocated (with NEW) and before any constructors are called. 
So in Java, it is safe for constructors to make virtual method calls,
and they will be properly directed to the target's implementation of the virtual method.

Public static void main:-
================================
First public means that any other object can access it.
static means that the class in which it resides doesn't have to be instantiated first before the function can be called.
void means that the function does not return a value.
"main" means an entry point you can "run".

Yes, We can overload the main method in java but JVM only calls the original main method,
it will never call our overloaded main method.

/Protected - 
======================================
access in same package and child class   other classes through class
eg SimpleList ,protected elements[]
DynamicList extends SimpleList use elements[]

Protected data member and method are only accessible by the classes of the same package and the subclasses present in 
any package. You can also say that the protected access modifier is similar to default access modifier with one
exception that it has visibility in sub classes.
Classes cannot be declared protected. This access modifier is generally used in a parent child relationship.


private - 
======================================
If a class has private constructor then you cannot create the object of that class from outside of the class.
access within the inner class. private or any other can be static.

USE:- validation and controlled,or immutable object.
      less complexity

public -   throughout  the class.thorughout the all package.
=======================
The members, methods and classes that are declared public can be accessed from anywhere. 
This modifier doesn’t put any restriction on the access
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

Constructor:-
===================
A constructor initializes an object when it is created.It has the same name as its class and is syntactically similar to a method. 
However, constructors have no explicit return type.
Typically, you will use a constructor to give initial values to the instance variables defined by the class, 
or to perform any other start-up procedures required to create a fully formed object.
All classes have constructors, whether you define one or not, because Java automatically provides a default 
constructor that initializes all member variables to zero. However, once you define your own constructor, 
the default constructor is no longer used.

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
Abstraction hides concrete implementation type.like we can have a CheckIfEqual method which is used to check equality 
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

Example:-
=========
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
Polymorphism is the capability of a method to do different things based on the object that it is acting upon. 
In other words, polymorphism allows you to define one interface and have multiple implementations.
* In polymorphism, calls resolved  dynamically on correct object type.
* It is also known as dynamic dispatch methods because method called resolved on run time type of object.

Example:--we have a women, man and child class and in that getHobby is a method. When we call getHobby of person then it
         will call on correct run time type of object and gives actual class hobby,
*overridden happens in run time type of polymorphism.


**Overloading
===================                                         
*  In the same class there can be methods with same name but different parameters ,the decision on
   which method will be called is made on the compile time type of parameters.The most specific matching method is call.
   If there is no unique match then it's a compile time error.
*it must be in same classes.                            
*the called resolved on compile time type of object.
* we can change access modifier.

*static,*private ,final  method can be overloaded.                   

* compile time polymorphism (because the method called varies depending on compile time type of parameters)
*
Eg.List has add(position,element)   //list has add method and it takes position and element.
                                    //n other one is list takes only (element)
  list.add(element) ,
   list.add(10)                      //if we call on list.add(10) then it will call on list.add(10) 


**Overriding Polymorphism
===========================
When the method is being call, is present in multiple classes which are in an inheritance hierarchy then the
decision to call which method is based upon run time type of the object.object has virtual pointer n it points to virtual table.
virtual table of it's class has location of all function of that class.

*it must follow inheritance hierarchy.
*private or static or final cannot be overridden.
*we cannot decrease the visibility of method when overriding.(if parent scope is
default then in child class it can be public but not private ).
//for eg addAll uses add ,if we could override add and make it private ,that would break addAll.
*The protected method can be made public but not private in the subclass.
* Run time polymorphism. non-static not final method can be overridden. 
  *If the method is static ,it will be called on class only and can't be overridden.
  *If we provide lesser access in the subclass than that in the superclass, then we will get a compile-time error.
  *private and final can't be overridden  ,final College class getFees() ,
                                          College college = new College() ; college.getFees();
  final class can't be overridden

override example
==============================
Ex...If we take Loan as abstract class and it has three implementation class personal loan,home loan and gold loan.
and there is getRateOfInterest method().If we take loan.getRateOfInterest(new homeloan) it will gives the homeLoan\.

In SOLID
L is liskov substitution principle means ,if a method works on parent type it should work on child type also.
for eg addAll works on ArrayList , MyArrayList extends ArrayList and overrides add to make it
private then addAll will break


//IMP-> if the method is non static then override method is resolved on
run time type of its object on which method is being called.


override example
==============================
Ex...If we take Loan as abstract class and it has three implementation class personal loan,home loan and gold loan.
and there is getRateOfInterest method().If we take loan.getRateOfInterest(new homeloan) it will gives the homeLoan\.
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

StringBuffer:-
=======================
StringBuffer in java is used to create modifiable String objects. 
This means that we can use StringBuffer to append, reverse, replace, concatenate and manipulate Strings or 
sequence of characters.

If we want  friends list from different sources then we have to take append(method) from single thread
then string Builder is used.
Buffer is already synchronized n it uses multiple thread.  
============================================================
If a string is going to remain constant throughout the program, then use the String class object because a
String object is immutable.                                            ===============================

If a string can change (for example: lots of logic and operations in the construction of the string)
and will only be accessed from a single thread, using a StringBuilder is good enough.

If a string can change and will be accessed from multiple threads, use a StringBuffer because StringBuffer
is synchronous, so you have thread-safety.

If you don’t want thread-safety then you can also go with StringBuilder class as it is not synchronized.

intern -
============
This method searches the specified string in the memory pool and if it is found then it returns the reference of it, 
else it allocates the memory space to the specified string and assign the reference to it.
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
comparable is tightly coupled with that class to check object comparison.
It is also used to compare the current instance with another object of same type.


            Comparator
*Comparator interface is used to compare two or multiple elements
The Compare interface is used to sort elements that compare two objects and provides additional comparison method.
*It implements comparable.
*It has compare() method to compare. 
*it is in java.util package
syntax--compare(two objects passed )

comparable and comparator returns positive negative and 0 values.
*if the first element is greater than second then it returns -1 negative integer.
  *if the second element is greater than first then it returns 1 positive integer.
  * if both objects are equal then it returns 0 value.
  *It throws null pointer exception if we pass null values to them.
=============
Logically, Comparable interface compares “this” reference with the object specified 
and Comparator in Java compares two different class objects provided.
=============
we can write more than one custom comparators as you want for a given type, 
comparable example we could just sort by only one attribute,
i.e., age but in the comparator, we can use different attributes like weight, name, and year.

**ASSOCIATION: Association
================================
Association refers to the relationship between multiple objects. 
It refers to how objects are related to each other and how they are using each other's functionality.
Composition and aggregation are two types of association.

Association, Composition, and Aggregation in Java
=====================================================
In Object-Oriented Programming (OOP), association, composition, and aggregation are types of relationships that describe
how objects are connected to each other. These relationships define how objects interact and depend on one another.

✅ 1. Association
Association is a relationship between two or more objects where each object has its own lifecycle and they are linked to 
each other. It represents a "uses-a" relationship.
It is a loosely coupled relationship where objects are independent.
Objects can exist without each other.

📌 Example: Student and Teacher
A teacher can teach multiple students, and a student can have multiple teachers.
Both objects have their own lifecycle.
class Student {
String name;
Student(String name) {
this.name = name;
}
}
class Teacher {
String name;
Teacher(String name) {
this.name = name;
}
    void teaches(Student student) {
        System.out.println(this.name + " teaches " + student.name);
    }
}
public class Main {
public static void main(String[] args) {
Student s1 = new Student("John");
Teacher t1 = new Teacher("Mr. Smith");
t1.teaches(s1);
}
}
Output:
Mr. Smith teaches John
When to Use:
When objects are related but do not rely on each other for their existence.

✅ 2. Aggregation
Aggregation is a special form of association where one object contains references to another object, but the contained 
object can exist independently.
It represents a "has-a" relationship.
It is a weak association where the contained object can live without the container.

📌 Example: Department and Employee
A department can have multiple employees, but an employee can exist without a department(e.g., an employee may be between jobs).
import java.util.*;
class Employee {
String name;
Employee(String name) {
this.name = name;
}
}
class Department {
String deptName;
List<Employee> employees = new ArrayList<>();
    Department(String deptName) {
        this.deptName = deptName;
    }
    void addEmployee(Employee emp) {
        employees.add(emp);
    }
    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            System.out.println("Employee: " + e.name);
        }
    }
}

public class Main {
public static void main(String[] args) {
Employee e1 = new Employee("Alice");
Employee e2 = new Employee("Bob");
        Department dept = new Department("IT");
        dept.addEmployee(e1);
        dept.addEmployee(e2);
        dept.showEmployees();
    }
}
Output:
Department: IT
Employee: Alice
Employee: Bob
When to Use:
When objects have a parent-child relationship but the child object can survive without the parent.

✅ 3. Composition
Composition is a stronger form of aggregation where the contained object’s lifecycle is fully dependent on the container object.
It represents a "part-of" relationship.
If the parent object is destroyed, all its contained objects will also be destroyed.
It is a strong association.
📌 Example: House and Room
A house is composed of rooms. If the house is destroyed, the rooms are destroyed too.
class Room {
String roomName;
Room(String roomName) {
this.roomName = roomName;
}
}
class House {
String houseName;
List<Room> rooms;
    House(String houseName) {
        this.houseName = houseName;
        rooms = new ArrayList<>();
    }
    void addRoom(String roomName) {
        rooms.add(new Room(roomName)); // Room created within House
    }
    void showRooms() {
        System.out.println("House: " + houseName);
        for (Room room : rooms) {
            System.out.println("Room: " + room.roomName);
        }
    }
}
public class Main {
public static void main(String[] args) {
House house = new House("Dream House");
house.addRoom("Living Room");
house.addRoom("Bedroom");
        house.showRooms();
    }
}
Output:
House: Dream House
Room: Living Room
Room: Bedroom
When to Use:
When an object is a part of a bigger entity and cannot exist without it.

Aggregation and Composition
==============================
Aggregation
==============
Aggregation is a way to achieve Association.
Aggregation implies a relationship where the child can exist independently of the parent.

For example, Bank and Employee, delete the Bank and  Employee still exist.

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

tell -> A checked exception is an exception that occurs at the compile time, these are also called as compile time exceptions.
These exceptions cannot simply be ignored at the time of compilation;
the programmer should take care of (handle) these exceptions.
Checked exceptions must be handled either by using try and catch block or by using throws clause/keyword in the method declaration.
If not handles properly, it will give a compile-time error.
Purpose: They are typically used for recoverable situations where the application might want to recover from the exception
(e.g., file not found, database connection failure).

For example, if you use FileReader class in your program to read data from a file,
if the file specified in its constructor doesn't exist, then a FileNotFoundException occurs,
and the compiler prompts the programmer to handle the exception.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            Scanner scanner = new Scanner(file); // This can throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
FileNotFoundException is a checked exception, so the compiler forces us to handle it using a try-catch block.


ClassNotFoundException ,InterruptedException ,InstantiationException ,IOException,SQLException
    IllegalAccessException ,FileNotFoundException, etc

Unchecked Exceptions
================================
These exceptions occur at runtime.
The compiler don't check for these kinds of exceptions.
These kinds of exceptions can’t be caught or handled during compilation time.
This is because the exceptions are generated due to the mistakes in the program.
These are not a part of the ‘Exception’ class since they are runtime exceptions.
The JVM doesn’t require the exception to be caught and handled.
Example of Unchecked Exceptions- ‘No Such Element Exception
=================
Definition: Unchecked exceptions are exceptions that are not checked at compile time. They are checked at runtime.
Purpose: They usually occur due to programming mistakes like invalid data, null references, or array index issues.
==================

tell - An unchecked exception is an exception that occurs at the time of execution. 
These are also called as Runtime Exceptions.
These include programming bugs, such as logic errors or improper use of an API.
Runtime exceptions are ignored at the time of compilation.

Java compiler does not check runtime exception at compile time whether programmer handles them or not. 
If a runtime exception occurs in a method and programmer does not handle it, JVM terminates the program without the 
execution of rest of the code.
For example, if you have declared an array of size 5 in your program, and trying to call the 6th element of the array then 
an ArrayIndexOutOfBoundsException exception occurs.

public class UncheckedExceptionExample {

    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // This will throw NullPointerException
    }
}


ArithmeticException,ClassCastException ,NullPointerException ,ArrayIndexOutOfBoundsException ,NegativeArraySizeException
    ArrayStoreException ,IllegalThreadStateException ,SecurityException, etc.

✅ When to Use Checked vs Unchecked Exceptions?
Checked Exceptions: Use when the application can recover from the exception, like when dealing with File I/O or Database
operations.
Unchecked Exceptions: Use when the issue is a programming bug that needs to be fixed, like null references or invalid array
access.
===================================================

FInal Finally Finalize:-
============================
Final :  final can be initialized only once , they can be initialized during declaration 
            or in constructor if they are class fields

finally : try ,catch will always run once ,clean up can be done ,close()
          try(Connction c:c.getConn()){} //auto after try , try with resources

The finally block in java is used to put important codes such as clean up code 
e.g. closing the file or closing the connection. 
The finally block executes whether exception rise or not and whether exception handled or not.

finalize : not guaranteed to run , finalize method runs on garbage collection.

===============================

throw vs throws:-
===================
✅ 1. throw Keyword
Purpose: The throw keyword is used to explicitly throw an exception (either checked or unchecked) during the execution of a
program.
Scope: It is used within a method or a block of code.
Type: Only one exception object can be thrown at a time.
Exception Object: Requires an exception object of the Throwable class or its subclass (e.g., Exception, Error).
public class ThrowExample {

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        validateAge(16); // This will throw an exception
    }
}
🔎 Explanation:
The throw keyword is used to manually throw an IllegalArgumentException.
Since it's an unchecked exception, it doesn't need to be declared using throws.

throws Keyword
Purpose: The throws keyword is used to declare exceptions that a method might throw. It is a part of the method signature.
Scope: It is used in the method declaration.
Type: Multiple exceptions can be declared using commas.
Exception Handling: It informs the caller of the method that it should handle or propagate the exception.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    // Method declares that it might throw IOException
    public static void readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        System.out.println(reader.readLine());
        reader.close();
    }

    public static void main(String[] args) {
        try {
            readFile("test.txt"); // The caller must handle IOException
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
🔎 Explanation:
The throws keyword is used to indicate that the readFile() method may throw an IOException.
The caller (main method) must handle or propagate the exception using a try-catch block.

🔎 Key Differences Between throw and throws
Aspect	                            throw	                                        throws
Purpose	         Used to throw an exception explicitly	           Used to declare exceptions that a method can throw
Location	          Inside a method or block	                   In the method signature (next to the method name)
Exception Type	Only one exception object can be thrown	            Multiple exceptions can be declared using commas
Exception Object	Requires an instance of Throwable or subclass   	Does not throw an exception, only declares it
Handling	Typically followed by a try-catch block or propagated	     Caller needs to handle the declared exceptions
Example Use Case	Validating user input or custom exceptions	  File operations, database connectivity, external resources
✅ When to Use throw vs throws?
Use throw when you want to manually throw an exception based on a specific condition, like invalid input or business logic
errors.
Use throws when a method is likely to throw a checked exception (like IOException or SQLException) and you want to inform
the caller to handle it.


//Inner class :-
====================
class inside the class.For eg If ListIterator is non static inner class of List,then List object
needs to be created first and ListIterator object will have reference to list object.

InstanceOf (operator):-check Run time type.
======================================================
An instanceof in Java is a comparison operator which, given an object instance,
checks whether that instance is of a specified type (class/sub-class/interface) or not.
Just like other comparison operators, it returns true or false.


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
When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. 
In other words, we can wrap a primitive value into a wrapper class object.

Wrapper Class in Java
A Wrapper Class in Java is a class that encapsulates (wraps) a primitive data type into an object.
Java provides a wrapper class for each of its eight primitive data types:
byte → Byte short → Short
int → Integer long → Long
float → Float double → Double
char → Character boolean → Boolean

Why are Wrapper Classes Used?
Object Representation of Primitives:
Java works with objects in collections and frameworks like ArrayList, HashMap, and HashSet, which cannot store primitive
data types. Wrapper classes help convert primitive data types into objects using Autoboxing.

Utility Methods:
Wrapper classes provide useful methods for parsing, comparing, and converting data.
Example: Integer.parseInt(), Double.valueOf(), Character.isDigit().

Support for Generics:
Generics in Java only support objects, not primitive data types.
Wrapper classes allow the use of primitives within generic data structures.

Data Conversion:
Converting strings to numeric values using wrapper class methods like Integer.parseInt("123").

Null Support:
Unlike primitives, wrapper objects can hold a null value, making them suitable for representing the absence of a value.

import java.util.ArrayList;
public class WrapperExample {
public static void main(String[] args) {
// Autoboxing: Primitive to Wrapper
int num = 10;
Integer wrappedNum = num;  // Autoboxing
        // Unboxing: Wrapper to Primitive
        int primitiveNum = wrappedNum;  // Unboxing
        // Using Wrapper class methods
        String str = "123";
        int parsedNum = Integer.parseInt(str);
        System.out.println("Parsed Number: " + parsedNum);
        // Using Wrapper in Collections
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);  // Autoboxing
        list.add(10);
        System.out.println("ArrayList: " + list);
    }
}
Key Points to Remember
Wrapper classes are immutable (cannot be changed once created).
They are part of the java.lang package.
Autoboxing and unboxing make working with wrapper classes seamless.
Using wrapper classes may lead to increased memory consumption compared to primitives.


solid/
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

ENumeration Interface:-
====================================
The Enumeration interface defines a means to retrieve successive elements from a data structure.
For example, Enumeration defines a method called nextElement that is used to get the next element in a data 
structure that contains multiple elements.

MAVEN
==========
Maven is a powerful project management tool that is based on POM (project object model). 
It is used for projects build, dependency and documentation. It simplifies the build process like ANT. ... 
In short terms we can tell maven is a tool that can be used for building and managing any Java-based project.

SOLID:-
===========
S : is for Single Responsibility Principle :- a class or module should do one thing only.
O: is for Open/Closed Principle :-code entities should be open for extension, but closed for modification.
L:Liskov Substitution Principle:-any child type of a parent type should be able to stand in for that parent without things blowing up.
I :is for Interface Segregation Principle:- you should favor many, smaller, client-specific interfaces over one larger.
D is for Dependency Inversion:-encourages you to write code that depends upon abstractions rather than upon concrete details.

InputStreamReader:-
====================
An InputStreamReader is a bridge from byte streams to character streams: 
It reads bytes and decodes them into characters using a specified charset. 
The charset that it uses may be specified by name or may be given explicitly,
or the platform's default charset may be accepted.


✅ Understanding Object Slicing with Upcasting
Upcasting
Upcasting is the process of converting a derived class object to a base class reference.
This is safe because the derived class object "is a" base class object (following the IS-A relationship).

What is Downcasting?
Downcasting is the process of converting a reference of a parent class (superclass) to a reference of its child class 
(subclass). It allows access to the specific methods and properties of the child class, which are not accessible using 
the parent class reference.
Downcasting is typically done manually using type casting in Java.
It is only possible when the object being referred to is actually an instance of the child class.

✅ Why is Downcasting Required?
Downcasting is generally required when:
Accessing Child Class Methods and Properties:
After upcasting (when a child object is referred to using a parent class reference), only the parent class methods are 
accessible. 
Downcasting is used to access the specialized methods of the child class.

Performing Type-Specific Operations:
If you have a collection of parent class objects, but need to invoke child class methods based on the actual type,
downcasting is necessary.

Using Polymorphism:
During runtime, when the actual object type is a subclass, downcasting ensures the correct method or behavior is accessed.

class Animal {
void sound() {
System.out.println("Animal makes a sound");
}
}
class Dog extends Animal {
void bark() {
System.out.println("Dog barks");
}
}
public class Main {
public static void main(String[] args) {
Animal animal = new Dog(); // Upcasting (Child class object referred by Parent class reference)
animal.sound();  // Calls Animal's method
                                                          //Downcasting to access Dog specific methods
        if (animal instanceof Dog) { // Always check before downcasting
            Dog dog = (Dog) animal; // Downcasting
            dog.bark(); // Calls Dog's specific method
        } else {
            System.out.println("Downcasting is not possible.");
        }
    }
}
output- Animal makes a sound
Dog barks

If the object is not actually of the type being casted to, Java will throw a ClassCastException.
Always ensure that the object is compatible before downcasting.

✅ Conclusion
Downcasting is used to convert a parent class reference back to its original child class type to access child-specific
methods and properties.
It should be done carefully using the instanceof operator to avoid runtime exceptions.
It is typically used in scenarios involving polymorphism or collections of objects with mixed types.

Q- Explain with the help of example. What are problems with multiple inheritance?
Multiple Inheritance means a class can inherit from more than one parent class, acquiring the properties and behaviors of
both. In Java, multiple inheritance using classes is not supported to avoid complexity and ambiguity.
However, multiple inheritance using interfaces is allowed.
The main reason Java doesn't support multiple inheritance using classes is to prevent ambiguity and conflicts that arise 
when two parent classes have methods with the same name. This is commonly referred to as the "Diamond Problem."
📌 Example of Diamond Problem (Multiple Inheritance Issue)
Consider a scenario where:
Class A has a method called display().
Classes B and C inherit from Class A and override the display() method.
Class D inherits from both B and C.
Now, if D tries to call the display() method, it will lead to confusion — which version of display() should be called?
This is the Diamond Problem.
class A {
void display() {
System.out.println("Display from Class A");
}
}
class B extends A {
void display() {
System.out.println("Display from Class B");
}
}
class C extends A {
void display() {
System.out.println("Display from Class C");
}
}
// Class D trying to inherit from both B and C // This is not allowed in Java
/
class D extends B, C {
void show() {
display(); // Ambiguity - which display() to call?
}
}
*/
public class Main {
public static void main(String[] args) {
// Not possible in Java
}
}
Java does not support multiple inheritance using classes to prevent the diamond problem.
However, Java supports multiple inheritance using interfaces because interfaces do not store any state and only contain
abstract methods (until Java 8 introduced default methods).

📌 Multiple Inheritance Using Interfaces (Supported in Java)
Since interfaces only provide method signatures (not implementation), Java allows multiple inheritance using interfaces.
If there is any conflict (e.g., same default method in multiple interfaces), it can be resolved using explicit overriding.
Example of Multiple Inheritance Using Interfaces
interface InterfaceA {
default void display() {
System.out.println("Display from InterfaceA");
}
}
interface InterfaceB {
default void display() {
System.out.println("Display from InterfaceB");
}
}
class ImplementingClass implements InterfaceA, InterfaceB {
    // Resolve ambiguity using explicit overriding
    @Override
    public void display() {
        System.out.println("Resolving ambiguity using InterfaceA");
        InterfaceA.super.display(); // Call InterfaceA's method
    }
}
public class Main {
public static void main(String[] args) {
ImplementingClass obj = new ImplementingClass();
obj.display();
}
}
Output:
Resolving ambiguity using InterfaceA
Display from InterfaceA
Explanation:
InterfaceA.super.display() is used to explicitly call display() from InterfaceA.
This approach allows Java to handle multiple inheritance safely without ambiguity.

✅ Problems with Multiple Inheritance (If It Were Allowed Using Classes)
Diamond Problem -As explained, the diamond problem leads to ambiguity in method calls.
Increased Complexity -Maintaining and understanding code becomes difficult when multiple parent classes have similar methods.
Data Management Issues -If multiple parent classes contain similar fields, it leads to data inconsistency and conflicts.
Constructor Chain Issues -Calling constructors from multiple parent classes can be problematic and lead to unpredictable behavior.
Performance Overhead -More complex inheritance structures would result in increased memory consumption and slower performance.


Q-✅ Which are the different types of design pattern? Explain singleton design pattern. 
-> 