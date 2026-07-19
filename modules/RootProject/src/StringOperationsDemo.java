public class StringOperationsDemo {
    String name = "Java_my_first_program";
    public static void main(String s[])
    {
        StringOperationsDemo obj = new StringOperationsDemo();

        System.out.println(obj.name);

        System.out.println(obj.name.length());
        System.out.println(obj.name.toUpperCase());
        System.out.println(obj.name.charAt(0));
        System.out.println(obj.name.contains("Java"));
        System.out.println(obj.name.substring(3,8));
        System.out.println(obj.name.trim());
        System.out.println(obj.name.replace("J","k"));
    }
}

