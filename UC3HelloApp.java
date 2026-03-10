public class UC3HelloApp {

    public static void main(String[] args) {

        // Use ternary operator to assign default value
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");

    }

}
