public class Animal {
        final void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
    }

    class Demo {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.sound();
        }
    }

