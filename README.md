# IC26_VehicleInheritance
Create a base class called Vehicle that has the manufacturer's name (String), number of cylinders in the engine (int), horsepower (int) and owner (type Person from previous assignment).  

The Vehicle class should have 2 constructors:

1. Parameterized constructor (manufacturerName, numberCylinder, horsepower, owner)
2. Copy constructor

Now, create a class Truck that is derived from Vehicle and has additional instance variables: load capacity in tons (double) and towing capacity in tons (also type double).  

The Truck class should have 2 constructors:

1. Parameterized constructor (manufacturerName, numberCylinder, horsepower, owner, loadCapacity, towingCapacity)
2. Copy constructor

Give your classes a reasonable complement of accessor and mutator methods, an equals( ) method and a toString( ) method.  Write a driver (no pun intended) program to test both classes.

Below is an inheritance diagram in UML (Unified Modeling Language) of the three classes:

![vehicle inheritance](https://github.com/S33V/IC26_VehicleInheritance/blob/master/images/VehicleInheritance.png "vehicle inheritance")
