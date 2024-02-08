<h1>Design Patterns Cheat Sheet</h1>

<h2>Table of contents (23)</h2>

> **Note:** Patterns with [x] mark excluded from code samples due to simplicity or specific nature of the
> implementation.

- <a href="#creational_patterns">Creational Patterns (5)</a>
    - <a href="#abstract_factory">Abstract Factory</a>
    - <a href="#factory_method">Factory Method</a>
    - <a href="#builder">Builder</a>
    - <a href="#prototype">Prototype [x]</a>
    - <a href="#singleton">Singleton [x]</a>
- <a href="#structural_patterns">Structural Patterns (7)</a>
    - <a href="#adapter">Adapter</a>
    - <a href="#bridge">Bridge</a>
    - <a href="#composite">Composite</a>
    - <a href="#decorator">Decorator</a>
    - <a href="#facade">Facade</a>
    - <a href="#flyweight">Flyweight</a>
    - <a href="#proxy">Proxy</a>
- <a href="#behavioral_patterns">Behavioral Patterns (11)</a>
    - <a href="#chain_of_responsibility">Chain of Responsibility</a>
    - <a href="#command">Command</a>
    - <a href="#interpreter">Interpreter [x]</a>
    - <a href="#iterator">Iterator</a>
    - <a href="#mediator">Mediator</a>
    - <a href="#memento">Memento</a>
    - <a href="#observer">Observer</a>
    - <a href="#state">State</a>
    - <a href="#strategy">Strategy</a>
    - <a href="#template_method">Template Method [x]</a>
    - <a href="#visitor">Visitor</a>

<h2 id="creational_patterns">Creational Patterns</h2>
<h3 id="abstract_factory">Abstract Factory</h3>

- <b>Intent:</b> Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
- <b>Use Case:</b> In a game development framework, an abstract factory can create families of related objects such as characters, weapons, and enemies for different game levels or scenarios.
- <b>Benefits:</b>
  - Encapsulates object creation.
  - Promotes consistency within families of objects.
- <b>Liabilities:</b>
  - Can become complex when adding new product variations or families.
- <b>Related Patterns:</b> Factory Method, Prototype, Singleton.

<h3 id="factory_method">Factory Method</h3>

- <b>Intent:</b> Define an interface for creating objects, but let subclasses decide which class to instantiate.
- <b>Use Case:</b> In a logging library, a factory method can create different logger instances (e.g., file logger, console logger, database logger) based on configuration or runtime conditions.
- <b>Benefits:</b>
  - Provides a hook for subclasses to create objects.
  - Supports polymorphism.
- <b>Liabilities:</b>
  - Can lead to subclass proliferation.
- <b>Related Patterns:</b> Abstract Factory, Prototype, Template Method.

<h3 id="builder">Builder</h3>

- <b>Intent:</b> Separate the construction of a complex object from its representation so that the same construction process can create different representations.
- <b>Use Case:</b> In a web application framework, a builder pattern can be used to construct complex HTML documents or database queries dynamically based on user input or configuration.
- <b>Benefits:</b>
  - Separates object construction from representation.
  - Supports different representations.
- <b>Liabilities:</b>
  - Requires more code due to additional builder classes.
- <b>Related Patterns:</b> Abstract Factory, Composite.

<h3 id="prototype">Prototype</h3>

- <b>Intent:</b> Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
- <b>Use Case:</b> In a document management system, a prototype pattern can be used to clone existing documents or templates to create new documents with similar structures and contents.
- <b>Benefits:</b>
  - Allows for cloning of objects.
  - Reduces subclassing.
- <b>Liabilities:</b>
  - Can be inefficient for complex objects with circular references.
- <b>Related Patterns:</b> Abstract Factory, Composite, Decorator.

<h3 id="singleton">Singleton</h3>

- <b>Intent:</b> Ensure a class has only one instance and provide a global point of access to that instance.
- <b>Use Case:</b> In a configuration manager, a singleton pattern can ensure that there is only one instance of the configuration object throughout the application, allowing global access to configuration settings.
- <b>Benefits:</b>
  - Ensures only one instance of a class.
  - Provides global access.
- <b>Liabilities:</b>
  - Can introduce global state.
  - Difficult to unit test.
- <b>Related Patterns:</b> Abstract Factory, Builder, Prototype.

<h2 id="structural_patterns">Structural Patterns</h2>
<h3 id="adapter">Adapter</h3>

- <b>Intent:</b> Convert the interface of a class into another interface clients expect. Allows classes with incompatible interfaces to work together.
- <b>Use Case:</b> In a legacy code integration project, an adapter pattern can adapt existing interfaces or APIs to work with modern libraries or frameworks, facilitating interoperability between different systems.
- <b>Benefits:</b>
  - Allows classes with incompatible interfaces to work together.
- <b>Liabilities:</b>
  - Can lead to a complex system with many adapters.
- <b>Related Patterns:</b> Bridge, Decorator, Proxy.

<h3 id="bridge">Bridge</h3>

- <b>Intent:</b> Decouple an abstraction from its implementation so that the two can vary independently.
- <b>Use Case:</b> In a graphics rendering engine, a bridge pattern can decouple the abstraction of drawing shapes from their implementations, allowing the engine to support different rendering backends (e.g., OpenGL, DirectX).
- <b>Benefits:</b>
  - Decouples abstraction from implementation.
  - Allows for independent evolution.
- <b>Liabilities:</b>
  - Can lead to a proliferation of classes.
- <b>Related Patterns:</b> Abstract Factory, Adapter.

<h3 id="composite">Composite</h3>

- <b>Intent:</b> Compose objects into tree structures to represent part-whole hierarchies. Clients can treat individual objects and compositions of objects uniformly.
- <b>Use Case:</b> In a file system application, a composite pattern can represent directories and files as a tree structure, allowing users to perform operations (e.g., copy, delete) on both individual files and entire directories.
- <b>Benefits:</b>
  - Treats individual objects and compositions uniformly.
  - Simplifies client code.
- <b>Liabilities:</b>
  - Can be difficult to restrict the types of components.
- <b>Related Patterns:</b> Chain of Responsibility, Decorator, Flyweight, Iterator, Visitor.

<h3 id="decorator">Decorator</h3>

- <b>Intent:</b> Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
- <b>Use Case:</b> In a text processing library, a decorator pattern can add formatting or encryption capabilities to streams or files, allowing users to apply multiple transformations to data streams.
- <b>Benefits:</b>
  - Allows for adding behavior dynamically.
  - Promotes single responsibility.
- <b>Liabilities:</b>
  - Can lead to a large number of small classes.
- <b>Related Patterns:</b> Adapter, Composite, Strategy.

<h3 id="facade">Facade</h3>

- <b>Intent:</b> Provide a unified interface to a set of interfaces in a subsystem. Simplifies a complex system by providing a higher-level interface.
- <b>Use Case:</b> In a customer relationship management (CRM) system, a facade pattern can provide a simplified interface for managing complex business processes such as customer accounts, orders, and invoices.
- <b>Benefits:</b>
  - Simplifies complex systems.
  - Provides a unified interface.
- <b>Liabilities:</b>
  - Can become a monolithic interface.
  - Hides complexity.
- <b>Related Patterns:</b> Abstract Factory, Mediator.

<h3 id="flyweight">Flyweight</h3>

- <b>Intent:</b> Use sharing to support large numbers of fine-grained objects efficiently.
- <b>Use Case:</b> In a graphical user interface (GUI) framework, a flyweight pattern can optimize memory usage by sharing common resources (e.g., fonts, icons) among multiple UI components.
- <b>Benefits:</b>
  - Reduces memory usage by sharing state.
  - Supports large numbers of objects.
- <b>Liabilities:</b>
  - Can introduce synchronization overhead.
  - Reduces encapsulation.
- <b>Related Patterns:</b> Composite, State, Strategy.

<h3 id="proxy">Proxy</h3>

- <b>Intent:</b> Provide a surrogate or placeholder for another object to control access to it.
- <b>Use Case:</b> In a remote service client, a proxy pattern can provide a local representation of a remote service interface, allowing clients to interact with the service transparently without needing to know its location or implementation details.
- <b>Benefits:</b>
  - Controls access to an object.
  - Adds functionality transparently.
- <b>Liabilities:</b>
  - Can introduce overhead.
  - Can complicate the system.
- <b>Related Patterns:</b> Adapter, Decorator.

<h2 id="behavioral_patterns">Behavioral Patterns</h2>
<h3 id="chain_of_responsibility">Chain of Responsibility</h3>

- <b>Intent:</b> Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until it is handled.
- <b>Use Case:</b> In a request processing pipeline, a chain of responsibility pattern can handle incoming requests by passing them through a series of handlers, each responsible for processing specific types of requests.
- <b>Benefits:</b>
  - Allows for flexible processing of requests.
  - Reduces coupling.
- <b>Liabilities:</b>
  - Can result in unhandled requests.
  - Can be difficult to debug.
- <b>Related Patterns:</b> Composite.

<h3 id="command">Command</h3>

- <b>Intent:</b> Encapsulate a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.
- <b>Use Case:</b> In a text editor application, a command pattern can encapsulate user actions (e.g., typing, deleting, formatting) as objects, allowing for undo/redo functionality and macro recording.
- <b>Benefits:</b>
  - Encapsulates requests as objects.
  - Supports undo/redo operations.
- <b>Liabilities:</b>
  - Can lead to a large number of command classes.
  - Can be complex to implement.
- <b>Related Patterns:</b> Composite, Memento.

<h3 id="interpreter">Interpreter</h3>

- <b>Intent:</b> Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
- <b>Use Case:</b> In a query language interpreter, an interpreter pattern can parse and evaluate queries expressed in a domain-specific language, converting them into executable commands or SQL statements.
- <b>Benefits:</b>
  - Represents language grammar and interprets sentences.
  - Supports extensibility.
- <b>Liabilities:</b>
  - Can be difficult to maintain.
  - Performance overhead.
- <b>Related Patterns:</b> Composite, Flyweight, Iterator, Visitor.

<h3 id="iterator">Iterator</h3>

- <b>Intent:</b> Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
- <b>Use Case:</b> In a collection library, an iterator pattern can provide a uniform way to traverse different types of collections (e.g., arrays, lists, trees) without exposing their internal structure.
- <b>Benefits:</b>
  - Provides a uniform way to traverse collections.
  - Supports multiple traversal algorithms.
- <b>Liabilities:</b>
  - Can be inefficient for certain data structures.
  - Increases complexity.
- <b>Related Patterns:</b> Composite, Factory Method, Memento.

<h3 id="mediator">Mediator</h3>

- <b>Intent:</b> Define an object that encapsulates how a set of objects interact. Promotes loose coupling by keeping objects from referring to each other explicitly.
- <b>Use Case:</b> In a chat application, a mediator pattern can facilitate communication between multiple users by centralizing message passing and routing logic, allowing users to send and receive messages without needing direct connections.
- <b>Benefits:</b>
  - Centralizes communication between objects.
  - Reduces coupling.
- <b>Liabilities:</b>
  - Can become complex with many mediated classes.
  - Can introduce a single point of failure.
- <b>Related Patterns:</b> Facade, Observer.

<h3 id="memento">Memento</h3>

- <b>Intent:</b> Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.
- <b>Use Case:</b> In a text editor application, a memento pattern can capture and store the state of the editor (e.g., text content, cursor position) so that users can undo/redo changes or restore previous editing sessions.
- <b>Benefits:</b>
  - Captures and restores an object's state.
  - Supports undo mechanisms.
- <b>Liabilities:</b>
  - Can introduce overhead.
  - May violate encapsulation.
- <b>Related Patterns:</b> Command, Iterator.

<h3 id="observer">Observer</h3>

- <b>Intent:</b> Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- <b>Use Case:</b> In a stock market monitoring system, an observer pattern can notify investors about changes in stock prices, allowing them to react to market fluctuations in real-time.
- <b>Benefits:</b>
  - Notifies dependent objects of changes.
  - Supports loose coupling.
- <b>Liabilities:</b>
  - Can lead to update overhead.
  - Can be difficult to debug.
- <b>Related Patterns:</b> Mediator, Singleton.

<h3 id="state">State</h3>

- <b>Intent:</b> Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
- <b>Use Case:</b> In a vending machine controller, a state pattern can represent different states of the machine (e.g., idle, selecting, dispensing) and transition between them based on user interactions and internal conditions.
- <b>Benefits:</b>
  - Allows an object to change its behavior dynamically.
  - Simplifies code.
- <b>Liabilities:</b>
  - Can lead to a proliferation of state classes.
  - Can be difficult to understand.
- <b>Related Patterns:</b> Singleton, Flyweight.

<h3 id="strategy">Strategy</h3>

- <b>Intent:</b> Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
- <b>Use Case:</b> In a sorting algorithm library, a strategy pattern can encapsulate different sorting algorithms (e.g., quicksort, mergesort) as strategies, allowing users to choose the appropriate strategy based on the size and nature of the data to be sorted.
- <b>Benefits:</b>
  - Defines a family of algorithms.
  - Promotes code reuse and flexibility.
- <b>Liabilities:</b>
  - Can introduce complexity with many strategy classes.
  - Can be difficult to choose the right strategy.
- <b>Related Patterns:</b> Flyweight.

<h3 id="template_method">Template Method</h3>

- <b>Intent:</b> Define the skeleton of an algorithm in the superclass but let subclasses override specific steps of the algorithm without changing its structure.
- <b>Use Case:</b> In a web framework, a template method pattern can define a skeletal structure for handling HTTP requests, with specific steps implemented by subclasses to handle different types of requests (e.g., GET, POST).
- <b>Benefits:</b>
  - Defines the skeleton of an algorithm.
  - Allows subclasses to customize certain steps.
- <b>Liabilities:</b>
  - Can lead to inflexible designs.
  - May violate the Liskov Substitution Principle.
- <b>Related Patterns:</b> Strategy, Factory Method.

<h3 id="visitor">Visitor</h3>

- <b>Intent:</b> Represent an operation to be performed on elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.
- <b>Use Case:</b> In a compiler or interpreter framework, a visitor pattern can traverse and analyze abstract syntax trees (ASTs), allowing for operations such as type checking, optimization, and code generation to be performed on the tree nodes.
- <b>Benefits:</b>
  - Separates operations from the objects on which they operate.
  - Supports adding new operations.
- <b>Liabilities:</b>
  - Can lead to a proliferation of visitor classes.
  - May violate encapsulation.
- <b>Related Patterns:</b> Composite, Interpreter.