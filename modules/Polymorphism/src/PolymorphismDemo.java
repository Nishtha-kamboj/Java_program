//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PolymorphismDemo {
    public static void main(String[] args) {

        // Reference type = AnimalBase
        // Object type = PolymorphicDog
        AnimalBase myPet = new PolymorphicDog();

        myPet.makeSound();   // Output: Woof!

        // Change the object
        myPet = new Cat();

        myPet.makeSound();   // Output: Meow!
    }
}

