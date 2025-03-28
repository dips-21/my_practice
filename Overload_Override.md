Overload :-

Same function name more than one in class is known...
           it called on parameter type whether it is float ,int or any other primitive type.   
           we can write same class with different parameter in overload.
           if parameter type is same then it will resolve on the basis of number of parameter and its parameter data type.

           use:- convenience of use as same method name can be used for different parameters ,eg: 
           sort(int[] a)
           sort(List<Integer> a)      //to avoid unnecessary typing energy.

           Not mandatory to pass default values everywhere while calling the method or constructor

           Weight(int kg){
              Weight(kg,0)
           }

           new HashMap(){ capacity=16,loadfactor}
           new TreeSet(Comparator i) //adding comparables like Integer ,why pass comparator
      
           new TreeSet()
          
          Person example
   
   we can avoid default values when calling the method if we have no use of it.
   we can avoid passing default values on method calls .it will make method verbose.            concise * verbose

   static,final ,private,constructor method can be overloaded.
   it is also called as compile time polymorphism. 
       call based on compile time type of parameters, so it is called as compile   
                                                                      //compile time polymorphism.
   ..compile time type pe resolve  LHS of equal to
                                                                      
                                                                 Animal a = new Horse();
                                                                 breed(Animal a)         // breed (a),this will be called    
                                                                 breed(Horse h)



Explanation of above example:-  when we call to horse object then it will firstly look to its 
specific type even if we pass there horse object in animal type. then compiler will check its 
type not an object i.e animal here.so animal method will call over there not horse.  
============================================================================================================================


   if we have same parameter list then it will resolve on more specific type.

Override:-
----------
resolve on RHS of equal to.

same function in child class which is available already in parent class.
arguments list must exactly match with parameter list.
call resolved on run time type of object on which overridden method is called.
it is invoked at run time.
method can be overridden in class.                                            (IS-A relationship follows here)

public static void main (String [] args) {  
  Animal a = new Animal();
  Animal b = new Horse();  //Animal ref, but a Horse object    
   a.eat(); // Runs the Animal version of eat()   
   b.eat(); // Runs the Horse version of eat()  }
   }

*override a method marked public and make it protected). 
The overriding method cannot have a more restrictive access modifier than the method being overridden 
(for example, you can't override a method marked public and make it protected). 

The overriding method CAN throw any unchecked (runtime) exception, regardless of whether the overridden
method declares the exception but cannot throw any new checked exception which parent does not.
constructor cannot be overriden

private or static or final method cannot be overridden.

use:-
 avoid code duplication.run time type decides call eg sort (sort algo is same), how to compare (is different)




* Interface:-
===============
An interface is a type defines contract what behaviours it must have to be of that type. 
  It defines what not how method do.eg . to be human you have to implement all methods in interface like walk talk.
  it is loose coupling.

for any class implementing that interface needs implementation all interface methods or be abstract.

interface can extend interface.       
abstract method doesnt have any body.

Abstraction:-
================






//unit test ,mocking
class PersonServiceImpl{
	PersonRepositoy p

}

* Implicit cast:-
 an implicit cast happens when you're doing a widening conversion. 
 In other words, putting a smaller thing (say, a byte) into a bigger container (like an int).
 when we tried to put a larger thing (say, a long) into a smaller container (like a short)then precision missed. 
 The large-value-into-small-container conversion is referred to as narrowing and requires an explicit cast,
  where you tell the compiler that you're aware of the danger and accept full responsibility. 

implicit cast:
 int a = 100;long b = a; // Implicit cast, an int value always fits in a long

 Explicit casts:float 
 a = 100.001f;int b = (int)a; // Explicit cast, the float could lose info

 Integer values may be assigned to a double variable without explicit casting, 
 because any integer value can fit in a 64-bit double. 

*EXplicit Cast:-




Variables Scope:-

Static variables have the longest scope; they are created when the class is loaded, and they survive as long as the 
class stays loaded in the Java Virtual Machine (JVM).
■   Instance variables are the next most long-lived; they are created when a new instance is created, and they 
live until the instance is removed.
■   Local variables are next; they live as long as their method remains on the stack. however, 
local variables can be alive, and still be "out of scope".
■   Block variables live only as long as the code block is executing


Arrays are declared by stating the type of element the array will hold, which can be an object or a primitive, 
followed by square brackets to the left or right of the identifier.

int[] key;  // brackets before name (recommended)
int key []; // brackets after name (legal but less readable)            // spaces between the name and [] legal, 
but bad





Constructor:-
==============

You can't make a new object without invoking not just the constructor of the object's actual class type, 
but also the constructor of each of its superclasses! 

--- You can't make the new object without creating constructor of class type and its define by new keyword.

constructor and class name is same n it doesn't have return type.

You cannot make a call to an instance method, or access an instance variable, until after the super constructor runs. 
 ■   Only static variables and methods can be accessed as part of the call to super() or this().
     (Example: super(Animal.NAME) is OK, because NAME is declared as a static variable.)

 ■   Abstract classes have constructors, and those constructors are always called when a concrete subclass is
     instantiated.
 ■   Interfaces do not have constructors. Interfaces are not part of an object's inheritance tree.
 ■   The only way a constructor can be in


Static Method/:=

 static = class, nonstatic = instance.

 Making the method called by the JVM (main()) a static method means the JVM doesn't have to create an instance 
 of your class just to start running code.




Mostly, we don't know about the implementation class (which is hidden to the end user), and an object of the 
implementation class is provided by the factory method.

A factory method is a method that returns the instance of the class. 



comparator:-
-------------














