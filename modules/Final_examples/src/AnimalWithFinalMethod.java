public class AnimalWithFinalMethod {
        final void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends AnimalWithFinalMethod {
    }

    class Demo {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.sound();
        }
    }


