public class stringBuilder {

    public static void main(String[] args) {
        // Create a StringBuilder object with an initial string
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string to the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at a specific position
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // Replace a portion of the string
        sb.replace(6, 10, "Beautiful");
        System.out.println("After replace: " + sb);

        // Delete a portion of the string
        sb.delete(6, 15);
        System.out.println("After delete: " + sb);

        // Reverse the entire string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Directly printing StringBuilder
        System.out.println("Final StringBuilder content: " + sb);
    }
}
