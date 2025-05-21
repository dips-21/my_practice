Polymorphic method invocations apply only to instance methods.
 You can always refer to an object with a more general reference variable type (a superclass or interface), 
but at runtime, the ONLY things that are dynamically selected based on the actual object (rather than the reference type)
are instance methods. Not static methods. Not variables. 
 Only overridden instance meth-ods are dynamically invoked based on the real object's type.



The rules for overriding a method are as follows:
■   The argument list must exactly match that of the overridden method. If they don't match, you can end up 
with an overloaded method you didn't intend.
■   The return type must be the same as, or a subtype of, the return type declared in the original overridden 
method in the superclass. (More on this in a few pages when we discuss covariant returns.)
■   The access level can't be more restrictive than the overridden method's.
■   The access level CAN be less restrictive than that of the overridden method.
■   Instance methods can be overridden only if they are inherited by the subclass. 
A subclass within the same package as the instance's superclass can override any superclass method that is not 
marked private or final. A subclass in a different package can override only those non-final methods marked pub-lic or 
protected (since protected methods are inherited by the subclass).
■   The overriding method CAN throw any unchecked (runtime) exception, regardless of whether the overridden method 
declares the exception. (More in Chapter 5.)
■   The overriding method must NOT throw checked exceptions that are new or broader than those declared by the 
overridden method. For example, a method that declares a FileNotFoundException cannot be overridden by a method 
that declares a SQLException, Exception, or any other non-runtime exception unless it's a subclass of FileNotFoundException.
■   The overriding method can throw narrower or fewer exceptions. Just because an overridden method "takes risks"
doesn't mean that the overriding subclass' exception takes the same risks. Bottom line: an overriding method doesn't 106    Chapter    2:        Object    Orientation
have to declare any exceptions that it will never throw, regardless of what the overridden method declares.
■   You cannot override a method marked final.
■   You cannot override a method marked static. We'll look at an example in a few pages when we discuss static methods 
in more detail.
■   If a method can't be inherited, you cannot override it. Remember that overriding implies that you're reimplementing
a method you inherited! For example, the following code is not legal, and even if you added an eat()method to Horse,
it wouldn't be an override of Animal's eat() method.

public class TestAnimals {   public static void main (String [] args) {
      Horse h =  new Horse();     
       h.eat();                                                         // Not legal because Horse didn't inherit eat()   
       }
  }
       class Animal {  
        private void eat() {   
          System.out.println("Generic Animal Eating Generically");  
           }
    }
          class Horse extends Animal { 

}




To summarize, which overridden version of the method to call (in other words, from which class in the inheritance tree) is   decided at runtime based on object type, but which overloaded version of the method to call is based on the reference type of the argument passed at compile time. 
If you invoke a method passing it an Animal reference to a Horse object, the compiler knows only about the Animal, so it chooses the overloaded version of the method that takes an Animal. 
It does not matter that at runtime there's actually a Horse being passed.


Unlike downcasting, upcasting (casting up the inheritance tree to a more general type) works implicitly (i.e., you don't have to type in the cast) because when you upcast you're implicitly restricting the number of methods you can invoke, as opposed to downcasting, which implies that later on, you might want to invoke a more specific method. 
For instance:

  class Animal { }
  class Dog extends Animal { }
  class DogTest {  public static void main(String [] args) {  
  Dog d = new Dog();
  Animal a1 = d;           // upcast ok with no explicit cast    
  Animal a2 = (Animal) d;  // upcast ok with an explicit cast  
  }
}


Other rules apply to overriding, including those for access modifiers and declared exceptions, but those rules aren't relevant to the return type discussion.For the exam, be sure you know that overloaded methods can change the return type, but overriding methods can do so only within the bounds of covariant returns.















