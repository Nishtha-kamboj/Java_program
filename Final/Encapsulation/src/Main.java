//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Student student = new Student();

            // Setting values using setters
            student.setName("Nishtha");
            student.setAge(27);

            // Accessing values using getters
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());
        }
}
