package polymorphism;

//Base class
class Animal {
 // Method to make animal sound
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass Dog
class Dog extends Animal {
 // Overriding makeSound method for Dog
// @Override
 public void makeSound() {
     System.out.println("Dog barks");
 }
}

//Subclass Cat
class Cat extends Animal {
 // Overriding makeSound method for Cat
 @Override
 public void makeSound() {
     System.out.println("Cat meows");
 }
}

public class Main {
 public static void main(String[] args) {
     // Creating objects of different types
     Animal animal1 = new Animal();
     Animal animal2 = new Dog();
     Animal animal3 = new Cat();

     // Calling makeSound method on different objects
     animal1.makeSound(); // Output: Animal makes a sound
     animal2.makeSound(); // Output: Dog barks
     animal3.makeSound(); // Output: Cat meows
 }
}
