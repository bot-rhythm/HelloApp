public class UC5_EnhancedForLoop {
    public static void main(String[] args) {

        // Check if no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder sb = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                sb.append(name).append(", ");
            }

            // Remove last comma and space
            sb.setLength(sb.length() - 2);

            System.out.println("Hello, " + sb.toString() + "!");
        }
    }
}
