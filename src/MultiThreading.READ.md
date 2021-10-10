Multithreading:-
===========================================
The main purpose of multithreading is to provide simultaneous execution of two or more parts of a program
to maximum utilize the CPU time.
A multithreaded program contains two or more parts that can run concurrently.
Each such part of a program called thre
Thread vs Runnable:-
====================

Thread
===============
It is a class.
It can be used to create a thread.
It has  methods such as ‘start’ and ‘run’.
It requires more memory space.
Since multiple inheritance is not allowed in Java, hence, after a class extends the Thread class, it can’t extend to any other class.
Every thread creates a unique object and associates with it.

Runnable
===================
It is a functional interface.
It can be used to create a thread.
It has a single abstract method ‘run’.
It requires less memory space.
When a class implements the ‘runnable’ interface, the class can extend to other classes.
Multiple threads can share the same objects.


Runnable Vs Callable:-
========================
Runnable and Callable both functional interface. Classes which are implementing these interfaces
are designed to be executed by another thread.
Thread can be started with Ruunable and they are two ways to start a new thread:
one is by subclassing Thread class and another is implementing Runnable interface.
Thread class does not have constructor for callable so we should use ExecutorService  class for executing thread.


Thread Pool:-
=============
A thread pool is a pool threads that can be "reused" to execute tasks, so that each thread may execute more than
one task. A thread pool is an alternative to creating a new thread for each task you need to execute.
Creating a new thread comes with a performance overhead compared to reusing a thread that is already created.
That is why reusing an existing thread to execute a task can result in a higher total throughput than creating a
new thread per task.

String Pool:-
=======================
String Pool is a storage area in Java heap. 
String allocation, like all object allocation,proves to be a costly affair in both the cases of time and memory. 
The JVM performs some steps while initializing string literals to increase performance and decrease memory overhead.
To decrease the number of String objects created in the JVM, the String class keeps a pool of strings. 
Each time a string literal is created, the JVM checks the string literal pool first.

Immutable class? How to make immutable?
===============================================
Immutable class means that once an object is created, we cannot change its content. In Java, all
the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable. ...
The class must be declared as final (So that child classes can't be created)
In order to create an immutable class, you should follow the below steps:
1. Make your class final, so that no other classes can extend it.
2. Make all your fields final, so that they're initialized only once inside the constructor and never
   modified afterward.
3. Don't expose setter method


Serializable Interface :=     (to convert object state,without object how will we send data to server )
=======================================================
*The Serializable interface is present in java.io package.
*To use Java serialization a class has to implement Serializable.
*Other serializations are json ,xml based(text) which are language/platform independent.
JVM generates additional metadata means extra information needs to be included in objects of this class ,
in object header metadata like total fields
,offsets,sizes(from to to size of field)) For serializable objects to represent their serialized structure.

*Serialization is a mechanism of converting the state of an object into a byte stream(binary)
that allows to send on socket file....
*Static and transient fields are not serialised ,they are not part of object state.
*Serialization is done using ObjectOutputStream.
*Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
*All fields of serialization must be serializable... or transient...

Serializable Marker Interface:-
====================================
It checks the interface is serializable or not..
They are used because we are telling to JVM that , that class have special behaviour.
(means extra information needs to be included in objects of this class ,in object header metadata like total fields
,offsets,sizes(from to to size of field)).
Serializable is a marker interface means that it contains no methods.
Therefore, a class implementing Serializable does not have to implement any specific methods.

The serialization runtime associates with each serializable class a version number, called a serialVersionUID,
which is used during deserialization to verify that the sender and receiver of a serialized object have loaded
classes for that object that are compatible with respect to serialization.
If the receiver has loaded a class for the object that has a different serialVersionUID than that of the
corresponding sender's class, then deserialization will result in an InvalidClassException.
A serializable class can declare its own serialVersionUID explicitly by declaring a field named serialVersionUID
that must be static, final, and of type long:
ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L;


Why;-
========
Object in memory representation to a representation which can be sent over a network/file .

Transient:-
=================
If we don't want to save value of a particular variable in a file, then we use transient keyword.
When JVM comes across transient keyword, it ignores original value of the variable and save default value of
that variable data type.

implementing Serializable just tells the Java serialization classes that this class is intended for object serialization.

Externalizable
=====================
Externalization provides implementation logic control to the application by overriding readExternal and writeExternal methods.

Starvation:-
==================
Starvation describes a situation where a thread is unable to gain regular access to shared resources and is unable to 
make progress. ... If one thread invokes this method frequently, other threads that also need frequent synchronized
access to the same object will often be blocked.

Executor service:-
=====================


What is thread race condition?
=====================================
A race condition occurs when two threads access a shared variable at the same time. ... 
Then the first thread and second thread perform their operations on the value, and they race to see which 
thread can write the value last to the shared variable.

Race conditions can be avoided by proper thread synchronization in critical sections. 
Thread synchronization can be achieved using a synchronized block of Java code.
Thread synchronization can also be achieved using other synchronization constructs like locks or atomic variables like java.

How do you handle race conditions?
Race condition can be handled by Mutex or Semaphores.
They act as a lock allows a process to acquire a resource based on certain requirements to prevent race condition.
How do you prevent them from occurring? There are various ways to prevent race condition, such as Critical Section Avoidance.