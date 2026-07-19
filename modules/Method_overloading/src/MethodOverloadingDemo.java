//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MethodOverloadingDemo {
    public static void main(String[] args) {

        OverloadingCalculator cal = new OverloadingCalculator();

        System.out.println(cal.add(10, 20));      // int version
        System.out.println(cal.add(5.9, 6.9));    // double version
    }
}
