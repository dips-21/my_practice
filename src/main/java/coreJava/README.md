/Protected - 
======================================
access in same package and child class
eg SimpleList ,protected elements[]
DynamicList extends SimpleList use elements[]

private - 
======================================
access within the inner class. private or any other can be static.

USE:- validation and controlled,or immutable object.
      less complexity

public -   throughout  the class.
======================================
Default -  package level. 
======================================
            

 Encapsulation - (data fields)
============================================
Binding (or wrapping) code and data together into a single unit are known as encapsulation.
 ex.  A java class is the example of encapsulation.
ex. Java bean is the fully encapsulated class because all the data members are private here.
* Encapsulation is data hiding it allows to have valid states of object.
  *field is private n methods are public.
  *we can reuse our code.
  *we can do validation at one level.(age is not be negative then we can check it at one level.)
  * Data is modified at one place because fields are private and it is accessible only within the class.only this method
    can direct access of it.
    
    
Abstraction:- (types of implementation hiding)
=================================================
Hiding internal details and showing functionality is known as abstraction.
For example phone call, we don't know the internal processing.

*Abstraction hides the implementation details.
it can be method body.
*it allows loose coupling.
In system there is 3 kind of user men women and child.if we have to add User then we will have to call three separate 
  methods for them.but with them help of abstraction we can define abstract type of it which is person.
If those three classes has same functionality then we can add it in person class and override it into child class with extends keyword.


Inheritance:-
================================================
When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. 
  It provides code reusability. It is used to achieve runtime polymorphism.
*Inheritance allows code reusability.
*in that we can allows code defined in one class and other classes can be reused it.
*Ex.if we have a women class ,in that  we have taken  working and non working women .means we can inherit all the properties
of women in both the classes and also we can add others information in it like working women get salary.
so we dont write women functionality to the both sub classes.


Polymorphism:-
==================================================
*in polymorphism, it calls dynamically on correct object type.
It is also known as dynamic dispatch methods because method called on run time type of object.
Example:--we have a women man and child class and in that gethobby is a method.when we call getHobby of person then it will
            called on correct run time type of object and gives actual class hobby,
*overriden happens in run time type of polymorphism.


Interface:-
============================
 *It is mechanism to achieve fully abstraction.
 *There can be only abstract methods in the java interface not method body.
 * 



String BUILDEr/buffer-
========================
Strings are immutable so if we want to change it ,everytime new object will have to create.
but with the help of buffer/builder we can append it n modify it .

builder n buffer- buffer is synchronized.(objects shared by multiple threads )
===================
String is thread safe.

If we want  friends list from different sources then we have to take append(method) from single thread
then string Builder is used.buffer is already synchronized n it uses multiple thread.  

intern -
============


/**Iterator:-
=================
* Iterator is an interface it encapuslated the iteration logic.
   which is applied on collection of objects which can be iterable.
* collection framework provide iterator for it's implementations..eg.arraylist ,linkedlist are implementations of Collection
* Any Iterable has to provide iterator() .
* It has hasnext(),next(),remove() method.
* HasNext() method return boolean value ,if the iterable list has more elements to 
  iterate then it return true value.
* Next() method is used to called the next elements in the list.if the iterator has no next element to iterate
* then it throws NosuchElementsException.
* if we called iterator without next method then it throws IllegalStateException.bcz when we called for remove
* method then iterator check their expected count and actual size of elements.then it will not be matched.
* Remove() method remove the last elements which is called by next() method.
* it is uni directional.It moves forward direction only.


**Why Iterator throws ConcurrentModificationException:-
================================================================
* iterator has a expected count field (==list size)
   while iterating it will check if expected count==size(actual count)
* if list is directly modified (list.add() or list.remove())
   then expected count will not be equal to actual count
   this is treated as concurrent modification and exception is thrown
* This is fail fast iterator.
* when listIerator.remove() is called both iterator expected count and actual count decrease
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


            Comparator
*Comparator interface is used to compare two or multiple elements
*It implements comparable.
*It has compare() method to compare. 
*it is in java.util.package
syntax--compare(two objects passed )

*If we passed primitive type of objects like age to compare then we have to take object of that type.

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


**Overloading                                                  
===================                                         
*overriding is happens when in the same class if there is same method name and different parameters.
*it must be in same classes.                            
*the called resolved on compile time type of            
  object.    
* we can change access modifier.                       
                                                            
*static method cannot be overloaded.                   
*private final 
* compile time polymorphism

**Override
================
*Overriding happens when there is two or more different classes and in that same method name and same parameter is declared.
*it must follow inheritance hirearchy.
*the called resolved on run time type of object.
==========================================================
*we cannot change access modifier more restrictive if their scope
scope is in parent is high (if parent scope is default then in child class it can be public but not more )
*cannot be overridden.
*The protected method can be made public but not private in the subclass. 
If we provide lesser access in the subclass than that in the superclass, then we will get a compile-time error.
* Run time polymorphism. non static not final method can be overriden.

// it the method is non static then override method is resolved on run time type of its object on which method is being called.


override example

Academic 

Course                          College
                         
add(Student p)              add(Student p)
add(Teacher t)              add(Teacher t)

Academic a=new Course();     

Student p=new Teacher()

a.add(p)  //course student
//compile time type of p is student and run time of a is course then it will be add in student course.

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