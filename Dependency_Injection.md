@Transactional -

@Controller -

@Repository

@Service

@





Java8 -
 
Lambda expression is an annonymous function ( without name, without access modifier , without return type)and having    
one lambda (->) symbol.

Functional interface are those interfaces which can have only one abstract method. It can have any number of static and
default methods. No restrictions on that.
eg. Runnable , callable

@FunctionalInterface
Functional interface is used to provide reference to lambda expression .    -> this is the relation

Whenever we have existing implementation of abstract method of out functional interface then we can go for method
reference . If no such method like testImplementation() is available then go for the lambda expression. 

Default method -> Default method is a way for adding new methods to the interface without affecting the implementing classes.
Hence with this new feature java people defended many compile time errors that may arise due to unimplemented methods
of interface.

default method in interface cope up with diamond problem  - Use interfacename.super.method name(); 

static methods - 

Predicate - Predicate is a predefined functional interface (having only one abstract method)
The only abstract method of predicate is test(T t)
public boolean test(T t) - whenever we want to check some boolean condition  then you can go for predicate.

ex. Predicate<String> checkLength = s -> s.length () >= 5;
Sout("The length is greater than 5: " + checkLength.test("Code decode));

Only one type argument is required which is input type in predicate.
Return type is not required as its a boolean.

Predicate joining - and or negate 

Functions  -  predefined functional interface having only one abstract method ie. apply(T t)
R apply (T t)
Given some input performs some operation on input and return/produce result(not necessary boolean value)
This takes one input and return one output
In predicate we used to take 1 input and return type is always boolean. 
In function return type is not fixed hence we declare both input type and return type. 

Functional chaining - we can combine chain/multiple function with andThen.
There are two ways to combine function :
And then and compose method 

f1.andThen(f2).apply(input) ;   first f1 then f2
f1.compose(f2).apply(input) ;   first f2 then f1 

Consumer<T> - It will consume Item. Consumers never return anything(never supply), they just consume.
eg. Take any Object and save its details in database and dont return anything.

Interface Consumer<T>{
public void accept(T t)}  


Supplier<R> -  It will just supply required objects and will not take any input. 
Its always going to never consume / take any input.
Interface Supplier<R>{
public R get();}

No chaining as no input is given to this. only it gives u output.
=====================================================================================================================

*Streams*-If we want to process bulk objects of collection then go for stream concept.
Way to operate on collection in java8 is stream.
It's a special iterator class that allows processing collections of objects in a functional manner.
Eg.Fetch all objects from collection of list whose value is greater than 5.

Filter and Map difference -
If we want to fetch/filter objects from collection like eg.Filter only even numbers from array list collection then
use filter for configuration of stream.

If we want to perform some operation on each objects of the collection then create another mapped object with different
value(after operation is performed)for each objects of that collection , then use map.

In filter, because of filtering, number of objects in filtered list is less than original list while in map same number
of objects are there is both new and original list created. 


Processing - 
1) Collect - If we want to collect elements of the stream after filtering or mapping and add them to the required
collection then use collect method.
   This will work both filter and collects methods. 











