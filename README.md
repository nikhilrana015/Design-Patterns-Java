# Design Patterns in Java

## [1. Builder Design Pattern](https://github.com/nikhilrana015/Design-Patterns-Java/blob/250fb38f5f38d8f12eca0c54490da00ccc7fae00/com.nikhilrana/src/Builder_Design_Pattern)
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

## [2. Decorator Design Pattern](https://github.com/nikhilrana015/Design-Patterns-Java/blob/250fb38f5f38d8f12eca0c54490da00ccc7fae00/com.nikhilrana/src/Decorator_Design_Pattern)
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