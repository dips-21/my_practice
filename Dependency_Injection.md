Dependency Injection:-

Let's imagine that you want to go fishing:
Without dependency injection, you need to take care of everything yourself. You need to find a boat, to buy 
a fishing rod, to look for baot, etc. It's possible, of course, but it puts a lot of responsibility on you. 
In software terms, it means that you have to perform a lookup for all these things.
With dependency injection, someone else takes care of all the preparation and makes the required equipment 
available to you. You will receive ("be injected") the boat, the fishing rod and the bait - all ready to use.


✅ Experience with Java, Spring, Spring Boot (Interview Answer)
I have around 3.5+ years of experience working with Java, mainly focusing on backend development. I’ve used Java 8+
features such as Streams,Lambda expressions, Optional, and functional interfaces to write clean and efficient code.
In terms of frameworks, I have hands-on experience with Spring Framework, particularly:

Spring Core – for dependency injection and loosely coupled design.
Spring MVC – to build RESTful web services.
Spring Data JPA – for integrating with relational databases using Hibernate as the ORM.
Spring Security – for implementing role-based access control and JWT-based authentication.

I’ve mainly worked on Spring Boot, which helps to build microservices and REST APIs quickly with minimal
configuration.It simplifies dependency management using Spring Boot Starters, and I’ve used embedded servers like
Tomcat for deployments.

I’ve also worked with:
Spring Profiles to manage environment-specific configs.
Actuator for monitoring application health.
Exception handling, validation, and proper logging with SLF4J and Logback.
In my current project, BroadOne – One Stop Solution, I used Spring Boot to build modules for HR and employee-
related services, ensuring proper request handling, service logic, and database interaction.
In another project related to Order Management Service, I worked on building microservices using Spring Boot,
integrated with REST APIs, handled client requests, and coordinated order flow within the capital market systems.
Overall, my experience spans developing, testing, deploying, and maintaining Spring Boot microservices using best
practices and industry standards.


Q. 2.How to Handle Dependency Injection (DI) in Spring Boot —
✅ What is Dependency Injection (DI)?
Dependency Injection is a design pattern where an object’s dependencies are provided (injected) by an external
source rather than the object creating them itself. This helps achieve loose coupling, better testability, and
cleaner code.

✅ How Spring Boot Handles DI?
Spring Boot (through the Spring Framework) automatically manages dependencies between components using Inversion
of Control (IoC) Container and DI.

✅ Ways to Do Dependency Injection in Spring Boot
1. Constructor Injection (Recommended)
   Dependencies are passed via the class constructor.
   Preferred for mandatory dependencies.
   Easier to write unit tests with constructor injection.
   @Service
   public class OrderService {
   private final PaymentService paymentService;

   // Constructor Injection
   public OrderService(PaymentService paymentService) {
   this.paymentService = paymentService;
   }

   public void processOrder() {
   paymentService.makePayment();
   }
   }
   Spring automatically wires the PaymentService bean into OrderService constructor.

2. Field Injection
   Dependencies are injected directly into the class fields using @Autowired.
   Less preferred because it hides dependencies and is harder to test.
   @Service
   public class OrderService {

   @Autowired
   private PaymentService paymentService;

   public void processOrder() {
   paymentService.makePayment();
   }
   }
3. Setter Injection
   Dependencies are injected via setter methods.
   Useful for optional dependencies or when you want to change dependencies post-construction.
   @Service
   public class OrderService {

   private PaymentService paymentService;

   @Autowired
   public void setPaymentService(PaymentService paymentService) {
   this.paymentService = paymentService;
   }

   public void processOrder() {
   paymentService.makePayment();
   }
   }
   ✅ How Does Spring Know What to Inject?
   Spring scans your classes annotated with @Component, @Service, @Repository, @Controller, etc.,and registers them
   as beans in the application context.
   When it finds a dependency annotated with @Autowired or declared in a constructor, it injects the matching bean
   from the context.
   If multiple beans of the same type exist, you can use @Qualifier to specify which one to inject.

✅ Example of Bean Registration and Injection

@Component
public class PaymentService {
public void makePayment() {
// payment logic
}
}

@Service
public class OrderService {
private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
✅ Benefits of DI in Spring Boot:
Promotes loose coupling.
Enables easier unit testing by allowing mock injections.
Spring Boot automatically manages bean lifecycle.
Makes code more modular and maintainable.

Interview Tip:
“I prefer constructor-based injection in Spring Boot for mandatory dependencies as it makes the class immutable
and easier to test. Spring’s IoC container automatically manages beans, and you can use annotations like
@Autowired and @Qualifier for injection.”

Dependency Injection (DI) is the process of passing objects or services (dependencies) into a class, instead of
letting the class create them internally. Key Benefits of DI are, Loosely Coupled Code Easier Unit Testing
Better Maintainability.

dependencies have different lifetimes:
Transient – Created every time it’s requested.
Scoped – Created once per request.
Singleton – Created once for the entire application.

Incorrect mismatches in DI can lead to issues or errors.
Example:
Injecting a scoped service into a singleton can cause unexpected behavior.
Scoped Service cannot be resolved inside a Singleton.

Solution
Instead of injecting ScopedService directly, inject IServiceProvider and resolve it manually
Alternatively, refactor your dependencies to avoid lifetime mismatches.


1. Bean Scopes in Spring Boot
   By default, Spring beans are singleton scoped, meaning a single instance is created and shared throughout the
   application context.

Common Bean Scopes:
Scope						Description
Singleton 					(default) One shared instance per Spring container (default)
Prototype					A new instance every time the bean is requested
Request						One instance per HTTP request (for web apps)
Session		 				One instance per HTTP session
Application					One instance per ServletContext (web app-wide)

How to set scope:
@Component
@Scope("prototype")
public class MyPrototypeBean {
// New instance every injection
}

2. Circular Dependency
   A circular dependency happens when two or more beans depend on each other directly or indirectly, e.g.:
   Bean A needs Bean B
   Bean B needs Bean A
   This causes Spring to fail bean creation because it can't resolve which one to create first.

How to resolve circular dependencies:
Prefer constructor injection to make dependencies explicit.
Use setter injection or @Lazy annotation on one of the dependencies to delay initialization.

Example with @Lazy:
@Service
public class ServiceA {

    private final ServiceB serviceB;

    public ServiceA(@Lazy ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}

@Service
public class ServiceB {

    private final ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
@Lazy tells Spring to initialize the dependency only when it is first needed, breaking the cycle.

3. How Dependency Injection Works Behind the Scenes in Spring
   Spring maintains an ApplicationContext which holds the bean definitions and bean instances.
   When the application starts, Spring scans your classes (with annotations like @Component, @Service).
   It creates and manages beans in the context.
   When a bean needs another bean (a dependency), Spring injects the required bean automatically.
   Injection happens either via constructor, setter, or field (reflection).
   Spring uses reflection and proxies to inject dependencies and manage lifecycle (init, destroy, etc.).

Summary:
Topic								Key Points
Bean Scopes					Singleton (default), Prototype, Request, Session
Circular Dependency			Happens when beans depend on each other, resolved by @Lazy
Behind the Scenes			Spring ApplicationContext manages beans and injects them

Interview Tip:
"Spring’s IoC container manages bean creation and wiring. By default, beans are singletons. Circular dependencies
can be handled with @Lazy or setter injection. Behind the scenes, Spring uses reflection and proxies to inject
dependencies automatically."

1) @Qualifier
   Q: How do you handle multiple beans of the same type in Spring Boot?
->When there are multiple beans implementing the same interface or of the same type, Spring throws an error if it
   doesn’t know which one to inject. I use @Qualifier to specify the exact bean to inject.

Example:
@Component("fastPaymentService")
public class FastPaymentService implements PaymentService { ... }

@Component("securePaymentService")
public class SecurePaymentService implements PaymentService { ... }

@Service
public class OrderService {
private final PaymentService paymentService;

    @Autowired
    public OrderService(@Qualifier("fastPaymentService") PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
2) @Profile
   Q: How do you manage different bean configurations for dev, test, and prod environments?
   ->I use Spring Profiles to load environment-specific beans. Beans annotated with @Profile are only created when that profile is active, which helps to maintain different configurations without changing code.

Example:
@Component
@Profile("dev")
public class DevDatabaseConfig implements DatabaseConfig { ... }

@Component
@Profile("prod")
public class ProdDatabaseConfig implements DatabaseConfig { ... }
Activate a profile in application.properties:

properties
spring.profiles.active=dev

3) Factory Beans
   Q: What is a Factory Bean and when do you use it?
   ->A Factory Bean is used when creating a bean involves complex logic or needs special initialization. Instead of
   Spring creating the bean directly, it calls a factory method that returns the instance.

Example:
@Component
public class ConnectionFactory {
public Connection createConnection() {
// complex connection setup logic
return new Connection(...);
}
}

@Configuration
public class AppConfig {
@Bean
public Connection connection(ConnectionFactory factory) {
return factory.createConnection();
}
}
Spring will call the factory to get the bean instance.

Summary
Feature						Purpose	Example Annotation
@Qualifier					Choose between multiple beans of same type	@Qualifier("beanName")
@Profile					Define beans for specific environment	@Profile("dev")
Factory Beans				Create complex beans via factory method	@Bean with factory method

Interview Tip:
"I use @Qualifier when multiple beans of the same interface exist to specify which one to inject. @Profile helps
me manage beans for different environments like dev or prod. Factory Beans are useful when creating complex
objects that require special initialization."

Q. What is Authentication & Authorization?
->Authentication is the process of verifying the identity of a user or system.
It answers the question: “Who are you?”
Common methods: username/password, biometrics, OTP, tokens.
Example: When you log in to an app with your credentials, the system authenticates you to confirm you are who you
say you are.

What is Authorization?
Authorization is the process of determining what an authenticated user is allowed to do.
It answers the question: “What can you do?”
It controls access to resources, data, and operations based on roles, permissions, or policies.
Example: After login, your user role might allow you to view data but not edit or delete it.

Simple analogy:
Authentication = Showing your ID card at the entrance (proving who you are).
Authorization = Getting access to specific rooms or files based on your ID (permissions granted).

Interview Tip:
"Authentication verifies user identity, while authorization checks if the user has permission to perform certain
actions or access resources."


1) Authentication in Spring Boot
   Usually done via login APIs where the user sends credentials (username/password).
   Spring Security intercepts the request and authenticates the user.
   On success, a JWT token is generated and sent back to the client.
   This JWT token proves the user’s identity for future requests without sending credentials repeatedly.

2) Authorization in Spring Boot
   After authentication, Spring Security checks if the user has permission to access specific endpoints.
   This is typically done using roles and authorities defined in the JWT or in the database.
   You can restrict access using annotations like @PreAuthorize("hasRole('ADMIN')") or via config classes.

3) JWT-based Auth Flow
   Client logs in → Server authenticates → Server issues JWT token → Client sends JWT in HTTP headers for every
   request.
   Server validates JWT token on every request → If valid and user has permission, request proceeds.

4) OAuth2 in Spring Boot
   OAuth2 is an authorization framework that allows third-party applications to access resources on behalf of a user.
   In Spring Boot, you can use Spring Security OAuth2 to implement OAuth flows (Authorization Code, Client
   Credentials).
   OAuth handles both authentication (identity verification) and authorization (scopes and permissions).
   Common for Single Sign-On (SSO) or when integrating with identity providers (Google, Facebook, Okta).

Example: Securing REST APIs with JWT in Spring Boot
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/login").permitAll()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .anyRequest().authenticated()
            .and()
            .addFilter(new JwtAuthenticationFilter(authenticationManager()))
            .addFilter(new JwtAuthorizationFilter(authenticationManager()));
    }
}
Interview Tip:
“In Spring Boot, authentication verifies user identity — often done with username/password and JWT tokens.
Authorization restricts access based on roles or permissions. OAuth2 is widely used for delegating authorization
and single sign-on scenarios.”

Q.What are the error codes used?
->Common HTTP Status Codes and Their Meaning
Code			Name					Meaning / Usage
200				OK					Request succeeded, and response contains the result
201				Created				Resource successfully created (e.g., POST request)
204				No Content			Request succeeded but no content to return
400				Bad 				Request	Client sent invalid request or data
401				Unauthorized		Authentication failed or missing credentials
403				Forbidden			Authenticated but not allowed to access the resource
404				Not Found			Requested resource does not exist
409				Conflict			Conflict with current state, e.g., duplicate resource
415				Unsupported Media Type	Client sent a request with unsupported format
500				Internal Server Error	Server encountered an unexpected error
503				Service Unavailable		Server temporarily unable to handle the request

Example usage in API:
400 Bad Request: When input validation fails.
401 Unauthorized: When JWT token is missing or invalid.
403 Forbidden: When user doesn’t have permission.
404 Not Found: When trying to access a resource that doesn’t exist.
500 Internal Server Error: For unexpected server-side errors.

Interview Tip:
“I follow REST standards for HTTP status codes, returning 200 for success, 201 for resource creation, 400 for bad
requests, 401/403 for security-related errors, and 500 for server issues.”

5. What is 404,402, 502, 503, 401 error codes
   HTTP Error Codes Explained
   Code	Name	                           Meaning & Use Case
   401	Unauthorized	:- User is not authenticated — missing or invalid credentials (e.g., no token or wrong login). The client must authenticate to get the resource.
   402	Payment Required :-	Reserved for payment-related errors (rarely used in practice). Originally meant for
   digital payment systems, but not widely implemented.
   404	Not Found :-	The requested resource or URL does not exist on the server. For example, wrong endpoint or
   missing data.
   502	Bad Gateway	:- Server acting as a gateway/proxy received an invalid response from an upstream server.
   Often happens in microservices or API gateways.
   503	Service Unavailable	:- Server is temporarily unable to handle the request due to overload or maintenance.
   Client should retry later.

Interview Tip:
“401 means the client must authenticate first. 404 means resource not found. 502 indicates a bad response from
another server (gateway issue), and 503 means the server is temporarily down or overloaded. 402 is rarely used
but related to payment.”

Q.How to handle "Not Found" error?
-> 1. Throw a custom exception when resource is not found
Define a custom exception class, e.g., ResourceNotFoundException:
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
public ResourceNotFoundException(String message) {
super(message);
}
}
2. Throw the exception from your service or controller when resource is missing
   public User getUserById(Long id) {
   return userRepository.findById(id)
   .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
   }
3. Create a global exception handler to handle the exception and return proper response
   @ControllerAdvice
   public class GlobalExceptionHandler {
   @ExceptionHandler(ResourceNotFoundException.class)
   public ResponseEntity<?> handleResourceNotFound(ResourceNotFoundException ex) {
   Map<String, Object> errorDetails = new HashMap<>();
   errorDetails.put("timestamp", LocalDateTime.now());
   errorDetails.put("message", ex.getMessage());
   errorDetails.put("status", HttpStatus.NOT_FOUND.value());

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
   }
   }
   Summary:
   Detect missing resource and throw ResourceNotFoundException.
   Annotate exception with @ResponseStatus(HttpStatus.NOT_FOUND) for default behavior.
   Use @ControllerAdvice with @ExceptionHandler for a consistent error response format.
   Return HTTP 404 with a meaningful message to the client.

Interview Tip:
"I handle 404 errors by throwing a custom exception when a resource is not found and using a global exception
handler to return a clear, consistent error response with status 404."


Q.What is the issue behind "Bad Request" error?
-> What is the issue behind a "400 Bad Request" error?
400 Bad Request means the client has sent an invalid or malformed request to the server.
The server cannot process the request due to incorrect syntax, invalid data, missing required parameters, or
validation failures.
It indicates a client-side error, not a server issue.

Common causes of 400 Bad Request:
Missing required fields in JSON or form data.
Sending data in an unsupported format.
Malformed JSON or XML body.
Invalid query parameters or headers.
Violating API contract (e.g., sending string instead of integer).

How to handle it?
Validate input on both client and server side.
Use proper request DTOs with validation annotations (e.g., @NotNull, @Size).
Return descriptive error messages explaining what is wrong.
Example in Spring Boot: use @Valid on request body and handle MethodArgumentNotValidException.

Interview Tip:
“A 400 Bad Request error occurs when the client sends invalid data or malformed requests. It’s important to
validate input and return meaningful error messages to guide the client.”

Q.What is Error and Exception?
-> What is an Error?
Error represents serious problems that a program usually cannot recover from.
These are external to the application and mostly related to the JVM environment.
Examples: OutOfMemoryError, StackOverflowError, VirtualMachineError.
You generally do not catch or handle Errors in your code because they indicate problems you can’t fix programmatically.

What is an Exception?
Exception represents conditions that a program can handle or recover from.
Exceptions occur during normal program execution.
Examples: IOException, NullPointerException, SQLException.
You handle exceptions using try-catch blocks or by declaring them with throws.

Interview Tip:
“Errors are serious JVM problems that applications cannot handle, while exceptions are issues during program
execution that can be caught and managed to maintain normal flow.”

checked and unchecked exception:-

Q.What is OutOfMemoryError?
It’s a serious JVM error indicating the Java heap is full and cannot allocate more objects.
It usually happens when your application uses more memory than the JVM heap size.

How to handle OutOfMemoryError?
Since it’s an Error (not an Exception), it’s generally not recommended to catch it in your code because it
indicates a critical resource problem. Instead, you should prevent it by:

Prevention & Best Practices:
Increase JVM Heap Size
Adjust JVM startup parameters:
bash
-Xms512m -Xmx1024m > to increase initial and max heap memory.

Find Memory Leaks
Use profiling tools like VisualVM, JProfiler, or Eclipse Memory Analyzer to analyze heap dumps and identify
objects consuming excessive memory.
Optimize Code->Avoid unnecessary object creation.
Use efficient data structures.
Close resources properly (e.g., streams, connections).
Cache wisely, don’t hold references longer than needed.

Use Garbage Collection Tuning
Tune GC parameters to optimize memory management based on your application’s behavior.

Can you catch OutOfMemoryError?
Technically, you can catch it, but it’s risky since the JVM may be in an unstable state.
If caught, you can try to log the error or perform minimal cleanup before shutting down gracefully.

try {
// risky memory operation
} catch (OutOfMemoryError e) {
// log and clean up resources
System.err.println("Out of memory! Shutting down...");
// optionally exit or restart
}
Interview Tip:
“OutOfMemoryError is a serious JVM error, and the best approach is to prevent it by monitoring memory, optimizing
code, and tuning JVM parameters rather than catching it in code.”

*Question 12. How to handle "Service Not Found" error even when the beans are properly registered?* error
->What does “Service Not Found” mean?
It usually means Spring could not inject or find a required bean at runtime despite the bean being declared.
This can happen due to issues like bean ambiguity, incorrect component scanning, or configuration errors.

common causes and solutions:
Component Scanning Issue
The package containing the service might not be scanned by Spring.
Solution: Ensure your @SpringBootApplication or @ComponentScan includes the package of your service.
Multiple Beans of Same Type (Ambiguity)
Spring finds multiple beans for the same interface and cannot decide which one to inject.
Solution: Use @Qualifier or @Primary to specify which bean to inject.
Bean Lifecycle / Proxy Issue
Circular dependencies or incorrect bean scope may cause the bean not to initialize properly.
Solution: Check for circular dependencies, use constructor injection, and verify bean scopes (@Singleton, @Prototype).
Incorrect Bean Name or Injection Point
If you inject by name, bean name might be wrong or mismatched.
Solution: Verify bean names and injection points are consistent.
Conditional Beans
Bean may be conditionally created using @Profile, @ConditionalOnProperty but conditions aren’t met.
Solution: Verify active profiles and conditional properties.

Debugging Steps:
Enable Spring Boot debug logs by adding logging.level.org.springframework=DEBUG to application.properties.
Use ApplicationContext’s getBeanDefinitionNames() method to list all registered beans.
Use IDE tools to check if your service class is annotated with @Service, @Component, or equivalent.

“If a ‘Service Not Found’ error occurs despite proper bean registration, I verify component scanning, check for
multiple beans ambiguity, confirm correct bean names and scopes, and ensure conditional beans are active under
the current profile.”

Q. How to debug in local and remote repository??
-> Interview Tip:
“I start debugging by pulling the latest code from the remote repository, then reproduce issues locally using IDE
debug tools. For remote environments, I enable remote debugging ports, securely connect my IDE, and combine logs
and monitoring tools for effective troubleshooting.”

Q. What happens when there is a collision in HashMap?
->  collision occurs when two different keys have the same hash code
(or their hash codes map to the same bucket index in the underlying array).

How does HashMap handle collisions?
Chaining (Using Linked Lists or Trees):
Initially, entries that collide (same bucket) are stored in a linked list at that bucket.
When a new key’s hash maps to an already occupied bucket, the new key-value pair is added to the end of the
linked list.

Summary of collision handling flow:
Calculate hash code → find bucket index.
If bucket empty → add entry.
If bucket has entries → compare keys:
If key exists → update value.
If key different → add new entry to linked list or tree at that bucket.

Why is collision handling important?
It ensures HashMap works efficiently even when multiple keys have the same hash code.
Treeify improves performance from O(n) to O(log n) in worst-case collisions.

Interview Tip:
“HashMap handles collisions by storing multiple entries in the same bucket using a linked list, and if collisions
grow large, it converts the list into a balanced tree to optimize lookups.”

Q. What is hashcode() and equals() method and its uses?
-> What is hashCode()?
hashCode() is a method in the Object class that returns an integer hash code for an object.
It is used to efficiently locate objects in hash-based collections like HashMap, HashSet, and Hashtable.
The hash code helps determine the bucket location in the hash table where the object will be stored.

What is equals()?
equals() is a method in the Object class used to compare two objects for logical equality.
By default, equals() compares object references (i.e., checks if two references point to the same object).
You override equals() to define custom equality based on object properties.

Why are both important?
In hash-based collections, when two objects have the same hash code (collision), the collection uses equals() to
check if the objects are actually equal or different.

To maintain the contract between hashCode() and equals():
- If two objects are equal according to equals(), they must have the same hashCode().
- If two objects have the same hashCode(), they may or may not be equal (must use equals() to confirm).

Uses:
Properly overriding hashCode() and equals() is essential for the correct functioning of collections like HashMap,
HashSet.
Ensures no duplicate objects in sets or keys in maps.

Example:
@Override
public boolean equals(Object o) {
if (this == o) return true;
if (!(o instanceof Person)) return false;
Person p = (Person) o;
return this.id == p.id && this.name.equals(p.name);
}

@Override
public int hashCode() {
return Objects.hash(id, name);
}
Interview Tip:
“hashCode() generates an integer to quickly find an object in a hash-based collection, and equals() checks logical
equality when hash codes collide. Both must be overridden together to maintain consistency.”

17. What is multithreading? How multithreading is implemented in my project?
    -> Multithreading is a Java feature that allows multiple threads to run concurrently within a single process,
    enabling parallel execution and better CPU utilization.

A thread is the smallest unit of execution.
Multithreading improves application performance by performing multiple tasks simultaneously.
Threads can share resources but require synchronization to avoid conflicts.

How multithreading is implemented in my project:
We use Spring’s @Async annotation to run certain service methods asynchronously, allowing the main thread to
continue processing without waiting.
For example, in order management, tasks like sending notifications or updating audit logs are handled
asynchronously to improve performance.
Thread pools are managed via Spring Boot’s configuration to optimize resource usage.
Care is taken to avoid race conditions and ensure thread safety by using synchronized blocks or thread-safe
collections when necessary.

18. What is NullPointerException? and How it is handled?
    -> NullPointerException (NPE) is a runtime exception thrown when the JVM attempts to use an object reference
    that points to null where an object is required.

Common causes:
Calling a method on a null object.
Accessing or modifying a field of a null object.
Using null in arrays or collections improperly.

How it is handled:
Use null checks before accessing object methods or fields.
Use Java 8’s Optional class to safely handle possible null values.
Initialize objects properly before usage.

Handle NPE in global exception handlers (e.g., @ControllerAdvice in Spring) to return user-friendly error messages.
Use static analysis tools or IDE inspections to identify possible null dereferences during development.


Q. Are server port and debug port the same?
No, they are different and serve distinct purposes:

1. Server Port
   This is the port on which your application’s server (like Spring Boot’s embedded Tomcat) listens for incoming
   client requests (HTTP/HTTPS).

Example: Default Spring Boot server port is 8080.
When users access your application via browser or API calls, they connect to this server port.
Configured in application.properties or application.yml as:

properties
server.port=8080

2. Debug Port
   This is the port used by the Java Virtual Machine (JVM) to allow a debugger (like your IDE) to connect remotely
   or locally to the running application.
   It’s used only during development or troubleshooting to attach a debugger and step through the code.

Typical debug port example: 5005.

Enabled by JVM options like:

-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005
This port is not accessible to end users and is strictly for debugging purposes.

Summary:
Port Type				Purpose					Example Port					Configured Where
Server Port			Handle user HTTP requests		8080					server.port in app config
Debug Port			Enable IDE debugger connection	5005					JVM args for remote debug

Interview Tip:
“Server port is for client-server communication, while debug port is for developer tools to connect and debug
the running JVM process.”

20. DB @Bean and @Autowired?
    -> @Bean: Annotation used on a method inside a @Configuration class to define and register a bean explicitly in
    the Spring application context.
    It tells Spring to call that method and manage the returned object as a bean.
    Useful for third-party classes or custom object creation.

@Autowired:
Used on fields, constructors, or setters to inject Spring-managed beans automatically.
Spring resolves the dependency by type and injects the appropriate bean at runtime.

Example:
@Configuration
public class AppConfig {
@Bean
public DataSource dataSource() {
return new HikariDataSource(); // Bean definition
}
}

@Service
public class MyService {
@Autowired
private DataSource dataSource; // Dependency injection
}

21. What is FunctionalInterface?
    -> A Functional Interface in Java is an interface with exactly one abstract method.
    It can have any number of default or static methods, but only one abstract method.
    Functional interfaces enable lambda expressions and method references in Java 8+.
    Common example: Runnable, Callable, Comparator, and Java’s java.util.function interfaces.
    Example:
    @FunctionalInterface
    public interface MyFunctionalInterface {
    void performTask();
    }

22. What is ClassCastException?
    -> ClassCastException is a runtime exception thrown when you try to cast an object to a class of which it is
    not an instance.
    For example, casting a String object to an Integer will cause this exception.
    It indicates an invalid downcasting or type mismatch in your code.
    Example:
    Object obj = "Hello";
    Integer num = (Integer) obj; // Throws ClassCastException at runtime


✅ 1. What is a Scheduler in Microservices?
A Scheduler is a component that runs tasks automatically at defined intervals (e.g., every hour, every day at
midnight). In microservice architecture, each service can independently schedule and run background jobs without
affecting others.

🔧 Common Use Cases in Microservices:
Sending daily reports or email notifications.
Data cleanup/archive.
Refreshing caches.
Syncing with external systems (e.g., fetching HR data from another service).

🔨 How to Implement a Scheduler in Spring Boot
Spring Boot supports scheduling using the @Scheduled annotation.
@Configuration
@EnableScheduling
public class SchedulerConfig {
}

@Service
public class EmailNotificationService {

    @Scheduled(cron = "0 0 9 * * ?") // Every day at 9 AM
    public void sendDailyEmails() {
        // Logic to send emails
    }
}
@Scheduled(fixedRate = 60000): Run every 60 seconds.

@Scheduled(cron = "..."): Cron expression for advanced scheduling.

You must enable scheduling using @EnableScheduling.

✅ 2. How We Used Scheduler in BroadOne – One Stop Solution
If you implemented any scheduled tasks in the BroadOne application, here’s how you can explain it:
🧠 Sample Answer (Tailored for Interview):
In the BroadOne – One Stop Solution project, we used Spring Boot's scheduling capability to automate background
tasks. For example, we had a scheduled job that:
Synced employee data from the internal HR database every night at midnight.
Sent automated email reminders for pending leave approvals to managers every morning at 9 AM.
We used the @Scheduled annotation with cron expressions, and ensured these jobs were fault-tolerant and logged
for monitoring. Each microservice that required scheduling had its own isolated task to maintain loose coupling
and scalability.

✅ Tip:
“While I didn't write the scheduling code myself, I worked closely with the team that did and integrated the
outcomes into our workflows—for instance, consuming data from scheduled sync tasks.”


7. What is unit testing?
   Unit testing is the process of testing a single unit of code in an isolated manner. The unit of code can be a
   method, a class, or a module. Unit testing aims to focus on the smallest building blocks of code to get
   confidence to combine them later to produce fully functioning software.

A unit test invokes the code and verifies the result with the expected result. If the expected and actual
outcomes match, then the unit test passes. Otherwise, it fails.

A good unit test has the following characteristics:

It should test a single piece of functionality.
It is fully automated and repeatable.
It should run quickly and provide immediate feedback.
It should be isolated and shouldn’t interact with external dependencies such as network, database, or file system
unless needed. You can use the mocking technique to simulate the external dependencies and isolate the code under
test.

5. What is SDLC in software testing?
   In short, SDLC (Software Development Life Cycle) enables the development of high-quality, low-cost software with
   the shortest possible development time. A major objective of the SDLC is to produce high-quality software that
   meets and exceeds the expectations of customers. SDLC provides a detailed plan with a series of stages, or phases,
   that encompass their own processes and deliverables. By adhering to the SDLC, developers can enhance the speed of
   their projects and minimize risks and costs.

   
Monolithic architecture  multiple components are combined in single large app.
single code base
deployed in single bundle
change in one service then whole app is redeployed
product users orders payment shipment cart
building problem : developers has to communicate
problem in scale
cumbersome over time

Microservices - Large apps are divide into small parts
product users order payment   - communicate using rest APIs    microservices
Different codebase
Each module managed independently
different tech stack
handling microservices is complex > drawback


Feign Client :-
The feign is declarating HTTP web client developed by Netflix
If you want to use Feign,create and interface and annotate it.

*API Gateway *
=========================================
A single entry point for client requests, routing them to appropriate microservices.
Acts as a reverse proxy, handling crosscutting concerns like authentication, rate limiting and logging .

Key features - Maps client requests to services(eg. /orders>. order-service)
Authentication/Authorization: Validates JWTs or OAuth tokens.
Rate Limiting - Prevents abuse eg. max 100 requests/min per user.


