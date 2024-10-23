class Animal {
void makeSound() {
System.out.println("Some generic animal sound");
}
}
class Dog extends Animal {
@Override
void makeSound() { 
  System.out.println("Woof! Woof!");
}
void display() {
System.out.println("This is a dog.");
}
void makeSuperSound() {
super.makeSound(); 
}
}
public class Main {
public static void main(String[] args) {
Dog dog = new Dog();
dog.display();
dog.makeSound();
dog.makeSuperSound(); 
}
}