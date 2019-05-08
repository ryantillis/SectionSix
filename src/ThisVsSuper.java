public class ThisVsSuper {

    //Super is used to access or call parent class member
    //This is used to call current class members or methods
    //We can use both anywhere in a class except in static areas, this will lead to compile time errors

    //This is used in constructors and setters, optionally getters
    //This keyword is optional when there are no parameters
    //Super is often used for method overriding

    //this() is used to call a constructor from another overloaded constructor in the same class
    //The call to super must be the first statement in each constructor

    //even abstract classes have constructors although they cannot be instantiated
    //Abstract classes are super classes so the constructors run when a concrete subclass is instantiated

    //Constructors can call super() or this() but not both

    //IN the main constructor initiate all variables, then use this() to to construct the others
    //All variables will be initialized in the last constructor
    //This is called constructor chaining

    //Overloading is providing multiple methods with different parameters in the same class
    //Static and instance methods can be overloaded, subclasses can also be overloaded
    //Same method name, different parameters, may or may not have different return typs, modoifiers or exceptions

    //Overriding means defining a method that exists in the parent class within the child class
    //the method has the same parameters @Override is recommended to be placed above the method definition
    //Only instance methods can be overridden

    //Same name and arguments, return type can be a subtype
    //Cannot have a lower access modifier
    //Only inherited methods can be overridden

    //Can't use this() within a static method

}
