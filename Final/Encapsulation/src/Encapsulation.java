import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();


        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();


        student.setName(name);
        student.setAge(age);


        System.out.println("\nStudent Details");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        sc.close();
    }
}
