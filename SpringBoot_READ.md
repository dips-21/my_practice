**SPRING**

Spring Dependency Injection  (component scanning and creation of object using reflection ):-
================================================================================================
In Dependency injection dependencies of an object are passed to it instead of the object getting it's own dependencies.
Dependency can be passed through constructor or setter or field.
It provides loose coupling.
The object does not look up its dependencies and does not know the location or class of the dependencies,
rather everything is taken care by the Spring Framework.
For eg UserService(SqlRepo repo){  } //Dependency injection <--SqlRepo dependency is passed as a constructor parameter.

UserService(){
repo=new MysqlRepo()}             //No dependency injection ,tight coupling

In Spring @Autowired or @Resource is used to indicate that the dependency needs to be injected

for eg class UserService{
@Autowired
SqlRepo repo
}

By default Spring DI is by type (means matching Interface/Class type).
if multiple matches then which one needs to be specified by using @Qualifier (DI by name) ,
eg @Qualifier("MongoRepo"),
Each object created by Spring is managed by spring and is a spring bean.
By default each spring bean is Singleton (ie only one instance of class exists).
It is per application context.


Dependency Injection:-

Let's imagine that you want to go fishing:
Without dependency injection, you need to take care of everything yourself. You need to find a boat, to buy a
fishing rod, to look for bait, etc. It's possible, of course, but it puts a lot of responsibility on you. In software
terms, it means that you have to perform a lookup for all these things.
With dependency injection, someone else takes care of all the preparation and makes the required equipment
available to you. You will receive ("be injected") the boat, the fishing rod and the bait - all ready to use.

**BEAN**:-
-------------------------------
The objects that form the backbone of your application and that are managed by the Spring IoC container are called beans.
A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.
These beans are created with the configuration metadata that you supply to the container.

Spring IOC Container:-
==============================
The Spring container is at the core of the Spring Framework.
The container will create the objects, wire them together, configure them, and manage their complete life cycle
from creation till destruction.
The Spring container uses DI to manage the components that make up an application.
These objects are called Spring Beans,
The container gets its instructions on what objects to instantiate, configure, and assemble by reading the
configuration metadata provided. The configuration metadata can be represented either by XML, Java annotations, or Java code.
The Spring IoC container makes use of Java POJO classes and configuration metadata to produce a fully configured
and executable system or application.

LIFE-CYCLE OF BEAN:-
-------------------------------------
When a bean is instantiated, it may be required to perform some initialization to get it into a usable state.
To define setup and teardown for a bean, we simply declare the <bean> with initmethod and/or destroy-method parameters.
The init-method attribute specifies a method that is to be called on the bean immediately upon instantiation.
Similarly, destroymethod specifies a method that is called just before a bean is removed from the container.
Similarly, when the bean is no longer required and is removed from the container, some cleanup may be required.


**ApplicationContext:**BEAN SCopes:-
==============================================
Central interface to provide configuration for an spring application.Usually there will be only one
but multiple application contexts can be created per jvm(tomcat).

**singleton**
This scopes the bean definition to a single instance per Spring IoC container (default).

If a scope is set to be singleton, the Spring IoC container creates exactly one instance of the object defined by that bean
definition.This single instance is stored in a cache of such singleton beans, and all subsequent requests
and references for that named bean return the cached object.
and references for that named bean return the cached object.
The default scope is always singleton. However, when you need one and only one instance of a bean,
=========================================
you can set the scope property to singleton in the bean configuration file,

**prototype**(on every injection,when bean is asked a new instance is created)
This scopes a single bean definition to have any number of object instance.

If the scope is set to prototype, the Spring IoC container creates a new bean instance of the object every time
a request for that specific bean is made. As a rule, use the prototype scope for all state-full beans and
the singleton scope for stateless beans.
To define a prototype scope, you can set the scope property to prototype in the bean configuration file.

**RequestScope(one object created by request)**
This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.

**SessionScope** (every http session ,one instance is created ).
This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
A HttpSession is for http state management as http is a state less protocol
(A request has no information on what happened in previous request).
Using a session id,state is saved on server and whenever a request sends that session id it belongs to that session.

**global-session**
This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.

**ApplicationScope** (one per application ie ServletContext)
ServletContext object is per web container (like tomcat) so only 1 instance of ApplicationScope beans will be
there in the web application.

ApplicationContext (manages all beans and spring config )

Jsp bean scopes (Page ,request,session,application)

Controller ,Service,Repository
=====================================================================================================================
@Controller this will url mapping of the method to be called on http requests ,Spring dispatcher servlet will call
it's methods on matching url .For eg GET /questions/

@Service this is for business logic and handle transactions .It will act over data fetched by repository(or reposiotires)

@Repository This is data layer which adds/gets data from database .With Spring data repository we only need to create
a interface extending CRUDRepository and it's implementation is dynamically generated.
It provides methods like findById() ,findAll() ,deleteById() etc .

If we need other methods the queries are generated based on method name
for eg FindByEmail(String email) (this would generate select * from table where email=?)
We can also write our own query using @Query on method

Spring uses reflection to call our controller method with matching url.

@Transaction for transactional method.Transaction management is done by spring (Declarative transaction management)
AOP aspect oriented programming

What is Spring Data Repository?
=========================================
* In spring data repository we use Repository annotation on interface which extends CrudRepository
* it's implementation is dynamically generated by Spring .It works on an Entity
  and methods to find/delete by primary key are already available ,findById() deleteById() ,findAll()
* Entity is the class mapped to table and object to relational form (i.e query) and query result to object conversion is
  done by Spring ORM (like hibernate).
* We can also define our methods in interface using standard naming pattern and query will be generated
  based on the method name for eg findByQuestionDescription(String description); //where description =?
* We can also write custom query on method using @Query.


MVC design
===========================================================
MVC Pattern stands for Model-View-Controller Pattern.
This pattern is used to separate application's concerns.

Model - Model represents an object or JAVA POJO carrying data. It can also have logic to update controller if its data changes.

View - View represents the visualization of the data that model contains.

Controller - Controller acts on both model and view. It controls the data flow into model object and
updates the view whenever data changes. It keeps view and model separate.

This is simply a specialization of the @Component class, which allows us to auto-detect implementation classes
through the classpath scanning.
We use @Controller in combination with a @RequestMapping annotation for request handling methods.

Transaction management      
=============================
Transaction management [1, 2] refers to the tasks of processing multiple transactions issued by various 
clients of a database server in such a way that the ACID contract can be fulfilled, that is, 
the properties of atomicity, consistency preservation, isolation, and durability of each individual transaction can be .

REST CONTROLLER:-
=====================
RestController is a Spring annotation that is used to build REST API in a declarative way. 
RestController annotation is applied to a class to mark it as a request handler, and Spring will do the building 
and provide the RESTful web service at runtime.

Session:-
================
Session management is the process of securely handling multiple requests to a web-based application or service 
from a single user or entity.

SESSION MANAGEMENT:-
=====================
Spring Session provides an API and implementations for managing a user's session information .


What is Spring Data Repository?
=========================================
* In spring data repository we use Repository annotation on interface which extends CrudRepository
* it's implementation is dynamically generated by Spring .It works on an Entity
  and methods to find/delete by primary key are already available ,findById() deleteById() ,findAll()
* Entity is the class mapped to table and object to relational form (i.e query) and query result to object conversion is
  done by Spring ORM (like hibernate).
* We can also define our methods in interface using standard naming pattern and query will be generated
  based on the method name for eg findByQuestionDescription(String description); //where description =?
* We can also write custom query on method using @Query

Spring IOC Container:-
==============================
The Spring container is at the core of the Spring Framework.
The container will create the objects, wire them together, configure them, and manage their complete life cycle
from creation till destruction.
The Spring container uses DI to manage the components that make up an application.
These objects are called Spring Beans,
The container gets its instructions on what objects to instantiate, configure, and assemble by reading the
configuration metadata provided. The configuration metadata can be represented either by XML, Java annotations, or Java code.
The Spring IoC container makes use of Java POJO classes and configuration metadata to produce a fully configured
and executable system or application.

Transaction management
=================================
ACID:-  
Atomicity -The entire transaction takes place at once or doesnt happen at all.  abort n commit
Consistency:-the database must be consistent before and after the transaction.
Isolation:-Multiple transaction occur independently without reference.
Durability:-The changes of a successful transaction occurs even if the system failure occurs.


Why we are using spring boot instead of spring              
==========================================================================================
Easy to use but powerful database transaction management capabilities. Spring simplifies
integration with other Java frameworks like JPA/Hibernate ORM, Struts/JSF/etc. web
frameworks. State of the art Web MVC framework for building web applications.

Difference between Stream and Parallel Stream

Different ways to handle exception 

Java 8 features you are aware of, right? Stream API and Function Interfaces. Let's say, for example, I have a Function Interface and I am having one abstract method and a couple of default and static methods. Now I want to access the default method from the Function Interface.

can we add in run-time exceptions in Java? Which one? Run-time exceptions.
-> Yes , in Java, you can add or throw runtime exceptions at runtime — in fact, runtime exceptions are unchecked 
exceptions, meaning they do not require explicit handling using try-catch or throws declarations.

what's the difference between abstraction and data hiding?

so how does Java manage its memory with the broadband collection?

so how does SpringBoot handle the dependency injection, so with annotations like auto-align and component?
-> Spring Boot handles Dependency Injection (DI) using annotations and its built-in Inversion of Control (IoC) container. This helps create loosely coupled code.


What is the difference between Fetched Type Lazy and Fetched Type Eager in Hibernate?

let me understand, so you are working on microservices architecture, correct?so what is the communication mechanism,
I mean, like, basically, inter-service communication, right? So, between microservices, so what are the different ways
you are using now?


What is the role of API Gateway in microservices?

AWS Experience?

Have you involved in the print security and the authentication operations?
-> Yes, I’ve been involved in implementing basic authentication features for secured access, but I haven’t worked directly on print security solutions. However, I understand that secure print solutions often involve user authentication via ID badges, PINs, or smart cards, and integrate with systems like LDAP or SSO. I’d be keen to learn more and work in that area if given the opportunity."