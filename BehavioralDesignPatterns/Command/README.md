# Command Design Pattern

The Command Design Pattern is a behavioral design pattern that allows you to encapsulate requests or actions as objects. It decouples the sender (client) from the receiver (object performing the operation) and supports undoable operations. 
In this pattern:

**Command Interface or Abstract Class:**
Defines the contract for concrete commands.
Contains an execute() method that represents the action to be performed.

**Concrete Command Classes:**
Implement specific actions (such as turning on a TV, opening files, etc.).
Store information required for executing the action.

**Receiver:**
Performs the actual work when a command is executed.
Understands how to carry out the requested action.

**Invoker (or Client):**
Initiates command execution.
Holds references to commands and can execute them.
Acts as an intermediary between the sender and the receiver.