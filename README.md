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

