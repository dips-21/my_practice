Multithreading:-
===========================================
The main purpose of multithreading is to provide simultaneous execution of two or more parts of a program
to maximum utilize the CPU time.
A multithreaded program contains two or more parts that can run concurrently.
Each such part of a program called thread.
Multithreading means that you have multiple threads of execution inside the same application. 
A thread is like a separate CPU executing your application. Thus, a multithreaded application is like an
application that has multiple CPUs executing different parts of the code at the same time.

Why Multithreading?
=========================
There are several reasons as to why one would use multithreading in an application. Some of the most common reasons for multithreading are:
    Better utilization of a single CPU.
    Better utilization of multiple CPUs or CPU cores.
    Better user experience with regards to responsiveness.
    Better user experience with regards to fairness.

Better Utilization of a Single CPU
=========================================
One of the most common reasons is to be able to better utilize the resources in the computer. For instance,
if one thread is waiting for the response to a request sent over the network, then another thread could use
the CPU in the meantime to do something else. Additionally, if the computer has multiple CPUs, or if the CPU has 
multiple execution cores, then multithreading can also help your application utilize these extra CPU cores.
Better Utilization of Multiple CPUs or CPU Cores:-
If a computer contains multiple CPUs or the CPU contains multiple execution cores, then you need to use multiple 
threads for your application to be able to utilize all of the CPUs or CPU cores. A single thread can at most utilize a 
single CPU, and as I mentioned above, sometimes not even completely utilize a single CPU.
Better User Experience with Regards to Responsiveness:-
Another reason to use multithreading is to provide a better user experience. For instance, if you click on a button
in a GUI and this results in a request being sent over the network, then it matters which thread performs this request.
If you use the same thread that is also updating the GUI, then the user might experience the GUI "hanging" while the GUI
thread is waiting for the response for the request. Instead, such a request could be performed by a background thread so
the GUI thread is free to respond to other user requests in the meantime.
Better User Experience with Regards to Fairness:-
A fourth reason is to share resources of a computer more fairly among users. As example imagine a server that receives 
requests from clients, and only has one thread to execute these requests. If a client sends a requests that takes a long 
time to process, then all other client's requests would have to wait until that one request has finished. By having each 
client's request executed by its own thread then no single task can monopolize the CPU completely.

Multithreading vs. Multitasking
===================================
Back in the old days a computer had a single CPU, and was only capable of executing a single program at a time. 
Most smaller computers were not really powerful enough to execute multiple programs at the same time, so it was not 
attempted. To be fair, many mainframe systems have been able to execute multiple programs at a time for many more years 
than personal computers.

Multitasking
====================
Later came multitasking which meant that computers could execute multiple programs (AKA tasks or processes) at the same time. 
It wasn't really "at the same time" though. The single CPU was shared between the programs. The operating system would
switch between the programs running, executing each of them for a little while before switching.

Along with multitasking came new challenges for software developers. Programs can no longer assume to have all
the CPU time available, nor all memory or any other computer resources. A "good citizen" program should release all 
resources it is no longer using, so other programs can use them.

Multithreading
================================
Later yet came multithreading which mean that you could have multiple threads of execution inside the same program.
A thread of execution can be thought of as a CPU executing the program. When you have multiple threads executing the
same program, it is like having multiple CPUs execute within the same program.

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

READ and WRITE Lock:-
==============================
Read Access   	If no threads are writing, and no threads have requested write access.
Write Access   	If no threads are reading or writing.

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

If a thread is not granted CPU time because other threads grab it all, it is called "starvation". 
The thread is "starved to death" because other threads are allowed the CPU time instead of it. 
The solution to starvation is called "fairness" - that all threads are fairly granted a chance to execute.

Causes of Starvation in Java:-
================================= 
Threads with high priority swallow all CPU time from threads with lower priority.
Threads are blocked indefinately waiting to enter a synchronized block, because other threads are constantly 
allowed access before it.
Threads waiting on an object (called wait() on it) remain waiting indefinitely because other threads are constantly
awakened instead of it.


Executor service:-
=====================



Volatile:-
================
The Java volatile keyword is used to mark a Java variable as "being stored in main memory". More precisely that means, 
that every read of a volatile variable will be read from the computer's main memory, and not from the CPU cache,
and that every write to a volatile variable will be written to main memory, and not just to the CPU cache.

Actually, since Java 5 the volatile keyword guarantees more than just that volatile variables are written to and read
from main memory.

What is thread race condition?
=====================================
A race condition occurs when two threads access a shared variable at the same time. ... 
Then the first thread and second thread perform their operations on the value, and they race to see which 
thread can write the value last to the shared variable.

Race conditions can be avoided by proper thread synchronization in critical sections. 
Thread synchronization can be achieved using a synchronized block of Java code.
Thread synchronization can also be achieved using other synchronization constructs like locks or atomic variables like java.

How do you handle race conditions?
=================================
Race condition can be handled by Mutex or Semaphores.
They act as a lock allows a process to acquire a resource based on certain requirements to prevent race condition.
How do you prevent them from occurring? There are various ways to prevent race condition, such as Critical Section Avoidance.

Concurrency
=====================
Concurrency means that an application is making progress on more than one task - at the same time or at least seemingly
at the same time (concurrently).

If the computer only has one CPU the application may not make progress on more than one task at exactly the same time,
but more than one task is in progress at a time inside the application. To make progress on more than one task concurrently
the CPU switches between the different tasks during execution.

Parallel Execution
======================
Parallelism

The term parallelism means that an application splits its tasks up into smaller subtasks which can be processed in parallel,
for instance on multiple CPUs at the exact same time. Thus, parallelism does not refer to the same execution model as
parallel concurrent execution - even if they may look similar on the surface.

To achieve true parallelism your application must have more than one thread running - and each thread must run on
separate CPUs / CPU cores / graphics card GPU cores or similar. 
Suppose bigger task which is being split up into 4 subtasks. These 4 subtasks are being executed by 4 different threads,
which run on 2 different CPUs. This means, that parts of these subtasks are executed concurrently (those executed on the 
same CPU), and parts are executed in parallel (those executed on different CPUs).

If instead the 4 subtasks were executed by 4 threads running on each their own CPU (4 CPUs in total), then the task 
execution would have been fully parallel. However, it is not always easy to break a task into exactly as many subtasks 
as the number of CPUs available. Often, it is easier to break a task into a number of subtasks which fit naturally with 
the task at hand, and then let the thread scheduler take care of distributing the threads among the available CPUs. 


DeadLock :-
====================================
✅ What is a Deadlock?
A Deadlock in Java occurs when two or more threads are permanently blocked, each waiting for the other to release a resource.
This results in a cyclic dependency where no thread can proceed, causing the program to freeze or hang.
Example of Deadlock Scenario
Thread-1 locks Resource A and waits for Resource B.
Thread-2 locks Resource B and waits for Resource A.
Since both threads are waiting indefinitely, a deadlock occurs.

🔎 Conclusion
Deadlock occurs when threads are stuck waiting for each other to release resources.
You can detect deadlocks using thread dumps, tools like VisualVM, or programmatic detection with ThreadMXBean.
Prevent deadlocks using consistent lock ordering, try-lock with timeout, and minimizing nested locks.

