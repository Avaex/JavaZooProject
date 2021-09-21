# Object Oriented Programming (OOP) Java Zoo Project
This project is a simple text-based game designed to showcase the basic Object Oriented Programming (OOP) concepts of Java. This project uses and demonstrates 
the four fundamental concepts of Object Oriented Programming: inheritance, encapsulation, abstraction, and polymorphism.

## Topics Covered
This project uses and demonstrates the fundamental concepts of OOP in a variety of ways. The following information gives context as to the usage and importance of each
of these concepts:

### Inheritance
- Inheritance allows classes to inherit features of other classes. Put another way, parent classes extend attributes and behaviors to child classes. Basic attributes
and behaviors can be defined in the parent class, and the child classes can extend this functionality.
- In this project, the Animal class and each individual animal type (Aardvarks, Bats, Bears, Turtles) demonstrate inheritance.
- The abstract class Animal is the parent class for each animal.
- Because the Animal class is abstract, an instance of an Animal object cannot be created. The purpose of this Animal abstract class is to function as a base class
from which child classes, in this case the animal types, can extend and make use of the parent methods. 
- The child classes inherit and are able to use the parent class's fields and methods. In this case, the parent class's fields include animal name, species, hunger level, 
and age. The parent class's methods include various getter/setter methods for each field. 
- In addition, the Animal abstract class contains an abstract method call(). Abstract methods are not implemented by the parent class but instead pass that burden onto
any child class. In this case, because the call() method is abstract, each of the Aardvark, Bat, Bear, and Turtle classes must implement this method. This makes sense
as each animal should have a unique sound/call it makes. Abstract methods ensure the method is implemented in the child class. 

### Encapsulation
- Encapsulation is the concept of containing all important information inside an object and only exposing select information to the outisde world.
- Encapsulation hides the internal software code implementation inside a class and hides internal data inside objects. 
- This requires some class fields to be set to private. 
- In this project, the Animal, Aardvark, Bat, Bear, and Turtle classes make use of encapsulation.
- For each of these classes, fields are private. The only way to interact with each field is through the use of getter/setter methods.
- Ex: In order to get the name of an individual Animal, we need to first set the name using the setter method setName(String name). Then we can access this field 
through our getter method getName(). 
- Through this encapsulation of our Animal object fields, we do not allow the outside world to directly modify these fields.
- In our to access and/or modify an Animal's name, we can only do so through our getter and setter methods. 
- This is useful in preventing the outside world (in this case our Zoo class) from directly accessing and/or modifying our fields.
- Encapsulation is useful as it adds security and hides complexity from the end user.

### Abstraction
- Abstraction means the user interacts with only selected attributes and methods of an object. 
- Abstraction uses simple classes to represent complexity.
- In this project, the setter/getter methods for hunger level in the Animal class demonstrate abstraction.
- The end user does not need necesarrily know how the animal's hunger level is set, only that the method is working as intended.
- In this case, if the animal is fed and its hunger level reaches a certain point, it will become full. 
- The end user does not need to know how this hunger level is implemented, only that it works as intended.

### Polymorphism
- Polymorphism is the concept of designing objects to share behaviors. 
- Using inheritance, objects can override shared parent behaviors with specific child behaviors.
- Polymorphism allows the same method to execute different behaviors in two ways: method overriding and method overloading.
- Method overriding: in method overriding, a child class can provide a different implementation than its parent class.
- In this project, method overriding is used in the Bear class. The Bear class overrides the parent Animal class's setHungerLevel(int level) method. 
- This is done because bears can each much more than other animals, so the hunger level for bears to feel full is much higher compared to other animals.
- Method overloading: in method overloading, there can be two methods with the same name but different parameters. 
- In this project, the Animal class makes use of method overloading.
- When an animal is initially created, the constructor calls the setHungerLevel() method. This gives a default value to each animal's hunger level.
- When an animal is fed, then the setHungerLevel(int level) method is called. This instead adds whatever value was passed in to this animal's hunger level. It also
checks to see if the animal is full or not.


## Install
This project requires a version of Java to be installed on your local machine. To find out how to do that, click [here](https://java.com/en/download/help/download_options.html).

## Usage
To run this program, simply compile and run using Java's normal command line syntax. Simply navigate to the install location of the program and run the following:
- `javac ZooProject.java`
- `java ZooProject`

## Author
This project was created and coded by John Fessler.
- GitHub: https://github.com/Avaex
- LinkedIn: https://www.linkedin.com/in/john-fessler-327283163/
