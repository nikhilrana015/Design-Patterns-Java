# Design Patterns in Java

## [1. Builder Design Pattern]("./com.nikhilrana/src/Builder_Design_Pattern")
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