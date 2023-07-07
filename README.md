# Design Patterns in Java
## [1. Builder Design Pattern](https://github.com/nikhilrana015/Design-Patterns-Java/tree/main/com.nikhilrana/src/Builder_Design_Pattern)
The Builder design pattern is a creational design pattern that is used to 
construct complex objects step by step. It provides a flexible and fluent 
interface for creating objects with different configurations or parameters.

The Builder pattern is typically used in scenarios where an object requires a 
large number of optional parameters or complex initialization logic. 
It helps to improve readability, maintainability, and flexibility in object 
construction.

Problems without builder-design pattern are:
- Backward compatibility issues
- Dirty code

### Pros
1. Simplifies the construction of complex objects by separating the construction logic from the object itself.
2. Provides a clear and fluent API for configuring and creating objects, improving readability and maintainability.
3. Allows for the creation of immutable objects, ensuring thread safety.
4. Supports different configurations and variations of objects without the need for multiple constructors or overloaded methods.

### Cons
1. Increased code complexity: Implementing the Builder pattern requires creating additional classes and interfaces, which can increase code complexity.
2. Overhead: The Builder pattern adds extra overhead to the codebase, as it involves creating separate builder objects and executing multiple method calls to construct an object.
3. Potential performance impact: The Builder pattern may have a slight performance impact compared to direct object construction, especially for simple objects with fewer parameters.

## [2. Decorator Design Pattern](https://github.com/nikhilrana015/Design-Patterns-Java/tree/main/com.nikhilrana/src/Decorator_Design_Pattern)
The Decorator design pattern is a structural design pattern that allows 
behavior to be added to an object dynamically at runtime. It provides an 
alternative to subclassing for extending the functionality of an object by 
wrapping it with one or more decorator classes.

Problems without builder-design pattern are:
- Class explosion
- Inflexibility: Inheritance-based approaches rely on static subclassing, 
which means that the behavior of objects is determined at compile-time. 
This limits the ability to dynamically add or remove behaviors at runtime 
based on specific conditions or requirements.
- Tight coupling
- Violation of the Single Responsibility Principle
- Limited code reuse: Inheritance-based approaches can limit code reuse 
since behavior is typically added through subclassing. 
This can result in code duplication, as the same behavior may need 
to be implemented in multiple subclasses.

Here's how the Decorator pattern works:
1. The Decorator pattern involves creating an abstract decorator class that 
implements the same interface as the component it wraps.
2. Concrete decorator classes extend the abstract decorator class and add 
additional functionality to the wrapped component.
3. The decorators can be stacked and combined in various ways to add multiple 
layers of functionality to the original object.

### Pros
1. Flexible extension: Decorators allow for dynamic and flexible extension of an object's functionality without the need for subclassing.
2. Open/Closed Principle: The pattern follows the Open/Closed Principle, as it allows adding new behavior without modifying existing classes.
3. Composition over inheritance: It promotes the use of composition over inheritance, enabling greater flexibility in combining behaviors.
4. Single Responsibility Principle: Decorators provide a way to add responsibilities to an object while keeping each decorator focused on a single 
responsibility.

### Cons
1. Complex object creation: The use of decorators can lead to a more complex object creation process, especially when multiple decorators are involved.
2. Increased number of classes: With the decorator pattern, the number of classes can increase as decorators are added, which can make the codebase more complex.
3. Potential performance impact: Decorators introduce additional layers of indirection, which may impact performance, especially if there are many decorators or frequent method calls.

## [3. Singleton Design Pattern](https://github.com/nikhilrana015/Design-Patterns-Java/tree/main/com.nikhilrana/src/Singleton_Design_Pattern)
The Singleton design pattern is a creational pattern that ensures a class has only one instance, and provides 
a global point of access to it.

Problems without use of singleton design-pattern are:
- Multiple instances: Without enforcing a single instance, multiple instances of a class can be created, 
leading to redundancy and unnecessary resource consumption.
- Inconsistent state: In a multithreaded environment, multiple instances can result in inconsistent state 
if different instances are accessed and modified concurrently.
- Lack of centralized control: Without a Singleton, there is no centralized control over the creation and 
access to the instance, making it harder to manage and coordinate the usage of the class.
- Increased coupling: If multiple instances of a class are created throughout the codebase, it can introduce 
higher coupling between different components, making the code more difficult to maintain and modify.
- Performance overhead: Creating multiple instances when a single instance would suffice can lead to 
unnecessary performance overhead, especially if the class involves heavy initialization or 
resource acquisition.

### Pros
1. Controlled access to the sole instance: It guarantees that only one instance of the class exists, 
allowing controlled access to that instance.
2. Global access: The singleton instance can be accessed globally, simplifying the usage and avoiding 
the need for passing instances between different parts of the codebase.
3. Lazy initialization: The singleton instance is created only when it is first requested, 
saving resources and improving performance.
4. Thread safety: Properly implemented singletons can handle concurrent access and maintain thread safety.

### Cons
1. Global state: The use of a singleton can introduce global state, which can make the codebase more 
complex and harder to maintain.
2. Dependency management: The dependency of other classes on the singleton instance can make it 
difficult to test and introduce tight coupling.
3. Potential for overuse: It's important to use the singleton pattern judiciously, 
as overuse can lead to code that is hard to understand and maintain.

## [4. Observer Design Pattern](https://github.com/nikhilrana015/Design-Patterns-Java/tree/main/com.nikhilrana/src/Observer_Design_Pattern)
The Observer design pattern is a behavioral pattern that defines a one-to-many dependency between objects. 
It allows multiple objects, known as observers, to be notified and updated automatically when the state of 
a subject object changes.

Problems without use of observer design-pattern are:
- Tight coupling: Without the Observer pattern, the subject and observers become tightly coupled, 
as the subject needs direct knowledge of the observers to notify them. 
This can result in a less flexible and more difficult to maintain codebase.
- Lack of real-time updates: Without the Observer pattern, there is no automatic mechanism to notify 
observers in real-time when the subject's state changes. Observers would need to constantly poll or 
query the subject for updates, which can be inefficient and result in delayed notifications.
- Manual state tracking: Without the Observer pattern, the subject would need to manually track and 
notify all dependent objects whenever its state changes. This can lead to redundant code and increased 
complexity, as the subject needs to know about each dependent object individually.
- Limited reusability: The lack of a well-defined observer interface can limit the reusability of the 
subject component. It becomes more difficult to reuse the subject with different observers or in different 
contexts without significant modifications.

### Pros
1. Loose coupling: Observers are loosely coupled with the subject. They depend on the subject's interface 
but are not tightly coupled to its implementation, promoting flexibility and maintainability.
2. Easy extensibility: The pattern allows for easy addition or removal of observers without modifying the 
subject or other observers, making it highly extensible.
3. Real-time updates: Observers receive real-time updates when the state of the subject changes, allowing them 
to react and take appropriate actions immediately.
4. Decentralized control: The pattern enables a decentralized control flow, where the subject doesn't need to 
have direct knowledge of the observers. This promotes a more modular and scalable design.

### Cons
1. Inefficiency with large numbers of observers: When there are a large number of observers, notifying all 
of them can impact performance, as each observer needs to be updated individually.
2. Unexpected updates: Observers may receive updates even when they are not interested in or capable of 
handling them, leading to unnecessary processing or potential errors.
3. Potential for memory leaks: If observers are not properly managed or unregistered when they are no longer 
needed, it can result in memory leaks.
4. Order of notification: The order in which observers are notified may not be guaranteed, which can lead to 
different behaviors depending on the order of registration.

## [5. Factory Design Pattern](https://github.com/nikhilrana015/Design-Patterns-Java/tree/main/com.nikhilrana/src/Factory_Design_Pattern)
The Factory design pattern is a creational pattern that provides an interface for creating objects 
without specifying their concrete classes. It encapsulates the object creation logic within a factory 
method, allowing the client code to use the factory method to create instances of objects.

Problems without use of factory-design pattern are:
- Tight Coupling: Without a factory, client code needs to directly instantiate concrete classes using the 
`new` keyword. This creates tight coupling between the client code and the specific implementation classes, 
making it harder to switch or replace implementations without modifying the client code.
- Code Duplication: If object creation logic is scattered throughout the codebase, there is a higher 
chance of code duplication. This can lead to maintenance issues and inconsistencies when creating objects in 
different parts of the code.
- Lack of Abstraction: Directly instantiating concrete classes limits the usage of abstractions and 
interfaces. It becomes harder to work with higher-level types, as the client code is tightly coupled to 
the specific implementation classes.
- Difficulty in Testing: When objects are directly instantiated in the client code, it becomes challenging 
to mock or replace those objects during unit testing. This can make writing comprehensive and isolated tests 
more difficult.
- Lack of Centralized Object Creation Logic: Without a factory, the object creation logic is spread 
across different parts of the code. This makes it harder to maintain and update the object creation process 
consistently.

### Pros
1. Encapsulation: The client code is decoupled from the specific implementation classes, as it only interacts 
with the factory interface. This promotes encapsulation and provides flexibility in changing or adding new 
concrete classes without impacting the client code.
2. Abstraction: The factory method creates objects based on a common interface or abstract class, 
allowing the client code to work with the abstract type. This promotes code abstraction and simplifies the 
client code by operating on a higher-level interface.
3. Code reuse: By centralizing the object creation logic in the factory method, 
it can be reused across multiple client code sections. This avoids code duplication and promotes code 
reuse, leading to cleaner and more maintainable code.
4. Flexibility: The Factory design pattern allows for runtime determination of the concrete class 
to be instantiated. This flexibility enables dynamic object creation based on specific conditions or 
configurations.

### Cons
1. Dependency on the factory: The client code becomes dependent on the factory interface, which introduces 
an additional layer of abstraction. If the factory implementation changes, it may require modifications to 
the client code as well.
2. Reduced control over object creation: With the Factory pattern, the client code delegates the 
responsibility of object creation to the factory method. This can limit the control and customization 
options available during object creation.
3. Increased code complexity: The factory classes and the additional abstraction layer can 
add complexity to the codebase. It may require developers to understand and work with the factory 
interfaces and implementation classes.
4. Complexity: Implementing the Factory design pattern can introduce additional complexity and overhead 
compared to directly creating objects using the `new` keyword. It requires defining and maintaining the 
factory interface and implementing factory classes for each concrete object type.

## [6. Abstract Factory Design Pattern](https://github.com/nikhilrana015/Design-Patterns-Java/tree/main/com.nikhilrana/src/AbstractFactory_Design_Pattern)
The Abstract Factory design pattern provides an interface for creating families of related or 
dependent objects without specifying their concrete classes. It allows the creation of objects that follow 
a common theme or belong to a specific family of objects.

Problems without use of abstract factory design pattern are:
- Tight Coupling: Without the Abstract Factory pattern, client code is directly coupled to the concrete 
classes used for object creation. This can make the code less flexible and harder to maintain, 
as any changes in the concrete classes would require modifications in multiple places.
- Lack of Abstraction: The absence of an abstract factory interface means that clients are 
forced to work with concrete factory classes directly. This can limit extensibility and make it 
challenging to introduce new families of related objects.
- Code Duplication: Without an abstract factory, the responsibility of object creation is scattered 
throughout the client code. This can result in code duplication, as similar object creation 
logic needs to be replicated in multiple places.
- Violation of Single Responsibility Principle: Object creation logic may be mixed with other 
application logic, violating the principle of separating concerns. This can make the code harder to 
understand, test, and maintain.

### Pros
1. Encourages Abstraction: Abstract Factory promotes the use of interfaces and abstract classes, 
allowing clients to work with abstract types instead of concrete implementations. This enhances 
flexibility and modularity in the codebase.
2. Supports Dependency Injection: Abstract Factory can be used in conjunction with dependency injection 
frameworks to decouple the client code from the specific implementations. It enables the injection of 
different concrete factories at runtime, providing easy switching between families of related objects.
3. Ensures Consistency: Abstract Factory ensures that all objects created by a specific factory adhere to a 
common theme or design, ensuring consistency across the created objects.
4. Allows Variation and Extensibility: Abstract Factory allows the addition of new concrete 
factories and products without modifying the existing client code. It supports the introduction of new 
families of objects or variations within existing families.
5. Encapsulates Object Creation: The creation of objects is encapsulated within the factory, 
abstracting away the specific implementation details. This promotes encapsulation and information hiding, 
as clients only interact with the abstract factory and product interfaces.

### Cons
1. Complexity: Abstract Factory introduces additional abstraction layers, which can increase the 
complexity of the codebase. It may not be suitable for small or simple projects where the variation of 
families or objects is limited.
2. Increased Code Overhead: The introduction of abstract factories and product families can lead to a 
larger codebase with additional classes and interfaces. This may impact the initial development time 
and maintenance efforts.
3. Limited Extensibility: While Abstract Factory allows the addition of new families or 
variations, it may become challenging to extend the abstract factory itself. Modifying the abstract factory 
interface or adding new abstract methods may require modifications in all concrete factories.
4. Runtime Configuration Challenges: Switching between different families of objects at runtime may introduce 
configuration challenges. The client code needs to select the appropriate concrete factory based on certain 
conditions, which can be complex to manage.
5. Tighter Coupling with Product Families: The client code using the abstract factory is tightly coupled to 
the product families created by that factory. Changing the product families or introducing new ones may 
require modifications in the client code as well.

## [7. Strategy Design Pattern](https://github.com/nikhilrana015/Design-Patterns-Java/tree/main/com.nikhilrana/src/Strategy_Design_Pattern)
The Strategy design pattern is a behavioral pattern that allows interchangeable algorithms or strategies to be 
selected at runtime. It encapsulates each algorithm into a separate class, making them independent and easily 
replaceable.

Problems without use of strategy design patterns are:
- Code Duplication: When different variations of an algorithm or behavior are implemented directly in the 
client code, there is a higher chance of code duplication. This can lead to maintenance issues and 
inconsistencies when implementing similar behaviors in different parts of the code.
- Lack of Flexibility: Without the Strategy pattern, changing or swapping algorithms or behaviors at 
runtime becomes more challenging. Modifications to the client code would be required, making the codebase 
less flexible and harder to adapt to different scenarios or requirements.
- Violation of Single Responsibility Principle: When different variations of a behavior are directly 
implemented in the client code, it can result in violating the principle of separating concerns. 
The client code may become bloated with multiple responsibilities, making it harder to understand, test, 
and maintain.
- Difficulty in Testing: When behavior is tightly coupled with the client code, it becomes harder to test 
individual behaviors in isolation. This can make writing comprehensive and isolated tests more challenging, 
leading to lower test coverage and potentially overlooked issues.
- Increased Code Complexity: Without the Strategy pattern, the client code may become more complex as it 
needs to handle the logic of multiple behaviors directly. This can make the codebase harder to understand, 
debug, and maintain.

### Pros
1. Encapsulation: Algorithms or strategies are encapsulated in separate classes, promoting cleaner and more 
modular code. Each strategy has its own class, making it easier to understand and maintain.
2. Flexibility: Strategies can be switched or selected at runtime without modifying the client code. 
This allows for dynamic behavior and adaptability based on different conditions or requirements.
3. Reusability: Strategies can be reused across multiple contexts or scenarios, reducing code duplication. 
Once a strategy is implemented, it can be easily applied wherever needed, promoting code reusability.
4. Open/Closed Principle: The Strategy pattern follows the Open/Closed Principle, allowing new strategies to 
be added without modifying existing code. It promotes extensibility and prevents the need for extensive code 
modifications.
5. Testability: With strategies encapsulated in separate classes, they can be individually tested in 
isolation, promoting easier unit testing. This helps ensure the correctness and reliability of each strategy 
implementation.

### Cons
1. Increased Complexity: Implementing the Strategy pattern can add complexity to the codebase, as it requires 
creating multiple strategy classes and managing the interaction between the context and strategies.
2. Increased Number of Classes: Applying the Strategy pattern may result in a larger number of classes, 
which can make the codebase more extensive. This can sometimes be overwhelming for simpler projects or 
scenarios with limited strategy variations.
3. Dependency Injection: The Strategy pattern often relies on dependency injection to provide the 
appropriate strategy to the context. While dependency injection can offer flexibility, it adds complexity 
and may require an additional framework or infrastructure.

## [8. Chain Of Responsibility Design Pattern](https://github.com/nikhilrana015/Design-Patterns-Java/tree/main/com.nikhilrana/src/ChainOfResponsibility_Design_Pattern)
The Chain of Responsibility design pattern is a behavioral pattern that allows a request to be passed 
through a series of handlers until it is handled by an appropriate handler or is not handled at all. 
Each handler in the chain has the ability to handle the request or pass it on to the next handler.

Problem without use of chain of responsibility design pattern are:
- Tight Coupling: Without the Chain of Responsibility pattern, the client code becomes tightly coupled to 
specific handler implementations. The client needs to have direct knowledge of the handlers and their order,
which can make the code more rigid and harder to maintain.
- Lack of Flexibility: Handling logic is directly implemented in the client code, making it less flexible
to accommodate changes or variations in the handling process. Adding or modifying handling logic would 
require modifying the client code itself, leading to potential code duplication or tangled logic.
- Difficulty in Extensibility: Adding new handlers or modifying the handling logic requires making 
changes to the client code, which violates the Open-Closed Principle. This can result in more brittle code 
that is resistant to changes and lacks the ability to easily introduce new handling behaviors.
- Violation of Single Responsibility Principle: Without the Chain of Responsibility pattern, 
the client code becomes responsible for handling multiple types of requests, violating the 
Single Responsibility Principle. This can lead to larger and more complex code segments that are harder 
to understand, test, and maintain.
- Lack of Centralized Control: Without the Chain of Responsibility pattern, there is no centralized control 
or coordination of the request handling process. This can make it harder to manage the flow of requests 
and enforce specific policies or rules.

### Pros
1. Decoupling: The pattern decouples the sender of a request from its receivers, allowing them to vary 
independently. The sender does not need to know the specific handler that will handle the request, 
promoting loose coupling.
2. Flexibility and Extensibility: Handlers can be added or removed from the chain dynamically at runtime 
without affecting the client code. This makes it easy to extend the chain of responsibility and introduce 
new handlers without modifying existing code.
3. Single Responsibility Principle: Each handler has a specific responsibility and focuses on handling a 
particular type of request. This promotes the Single Responsibility Principle, making the codebase more 
modular and easier to understand.
4. Customizable Handling Order: The order of the handlers in the chain can be configured or modified, 
allowing flexibility in defining the sequence of request handling. This enables customization based on 
specific business rules or requirements.
5. Improved Maintainability: The Chain of Responsibility pattern can improve code maintainability by 
providing a clear and structured approach to handle different types of requests. Each handler is 
responsible for its own logic, making it easier to modify or update individual handlers without affecting 
others.

### Cons
1. Handling Guarantee: There is no guarantee that a request will be handled by any handler in the chain. 
If the request is not handled by any handler, it may result in an unhandled request or require additional 
handling logic in the client code.
2. Performance Impact: The request may need to traverse through multiple handlers in the chain, 
which can introduce a performance impact, especially if the chain is long or the request requires 
processing from all handlers.
3. Complexity: As the number of handlers and the complexity of the chain increase, the overall complexity 
of the system can also increase. It may become harder to debug and trace the flow of requests through the 
 chain.

## [9. Proxy Design Pattern](https://github.com/nikhilrana015/Design-Patterns-Java/tree/main/com.nikhilrana/src/Proxy_Design_Pattern)
The Proxy design pattern is a structural pattern that provides a surrogate or placeholder for another 
object to control its access and behavior. It allows for additional functionality to be added to an object 
without modifying its core implementation.

Problems without use of proxy design pattern are:
- Lack of Access Control: Without a proxy, there is no centralized mechanism to control access to 
sensitive or expensive resources. Clients can directly interact with the resource without any additional 
validation or security checks, potentially leading to unauthorized access or misuse.
- Performance Issues: Without a proxy, clients may need to directly access and manipulate resources, 
even if it involves expensive or time-consuming operations. This can lead to performance bottlenecks, 
inefficient resource utilization, and degraded system performance.
- Performance Issues: Without a proxy, clients may need to directly access and manipulate resources, 
even if it involves expensive or time-consuming operations. This can lead to performance bottlenecks, 
inefficient resource utilization, and degraded system performance.
- Inefficient Resource Utilization: In situations where resources are expensive or limited, not having a 
proxy can lead to inefficient resource utilization. Proxies can implement strategies like caching or lazy 
loading to optimize resource usage, which may be missing without the pattern.

### Pros
1. Performance Optimization: Proxies can implement caching mechanisms or lazy loading strategies to optimize
the performance of resource-intensive operations. They can defer the creation or loading of objects 
until they are actually needed, improving efficiency and reducing unnecessary overhead.
2. Remote Access: Proxies can act as a local representative for remote objects, allowing clients to 
interact with them as if they were local. This enables transparent access to remote resources and 
facilitates remote method invocation.
3. Controlled Access: Proxies can control access to sensitive or expensive resources by implementing 
security checks, authentication, or additional validation logic. This helps enforce access restrictions 
and protect resources from unauthorized access.
4. Simplified Interface: Proxies can provide a simplified interface to clients, hiding the complexity of 
the underlying object or system. They can act as a facade, providing a unified and consistent interface 
that encapsulates intricate details and simplifies client interactions.
5. Logging and Auditing: Proxies can intercept method calls and add logging or auditing functionality 
without modifying the original object. This enables tracking and monitoring of method invocations, 
aiding in debugging, performance analysis, or compliance requirements.

### Cons
1. Increased Complexity: The introduction of proxy objects can add complexity to the codebase, as it 
involves the creation of additional classes and coordination between the proxy and the real object. 
This can make the code harder to understand and maintain, especially in complex systems.
2. Performance Overhead: Depending on the implementation, the use of proxies can introduce additional overhead, 
such as method interception, validation, or remote communication. Care should be taken to ensure that 
the benefits of the proxy outweigh any potential performance impact.
3. Tight Coupling: In some cases, the proxy may need to have knowledge of the real object's interface or 
implementation details. This can introduce a tight coupling between the proxy and the real object, 
potentially affecting modularity and flexibility.
4. Potential Synchronization Issues: If multiple clients access the same proxy concurrently, 
synchronization mechanisms may be required to ensure thread-safety and prevent race conditions. 
This adds complexity and potential performance implications.