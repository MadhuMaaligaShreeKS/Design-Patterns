# Factory Design Pattern
The Factory Design Pattern centralizes object creation logic, effectively hiding the details of object instantiation from the client code.

Key Components of the Factory Design Pattern:

**Product**:
An abstract class or interface that defines the common operations for the objects that the factory will create.
Concrete products are the actual classes that implement this interface, each representing a specific type of object to be created.

**Creator (Factory):**
An abstract class or interface that declares the factory method responsible for creating product objects.
The factory method delegates the actual creation to subclasses.

**Concrete Creators:**
Subclasses of the creator that implement the factory method.
These subclasses decide which specific concrete product to create, often based on input parameters or configuration.

**Factory Method:**
A method defined in the creator class that is responsible for creating product objects.
Typically declared as abstract in the creator and implemented in the concrete creators.