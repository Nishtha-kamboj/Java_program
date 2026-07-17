//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Reference type = Animal
        // Object type = Dog
        Animal myPet = new Dog();

        myPet.makeSound();   // Output: Woof!

        // Change the object
        myPet = new Cat();

        myPet.makeSound();   // Output: Meow!
    }
}