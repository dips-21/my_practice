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


