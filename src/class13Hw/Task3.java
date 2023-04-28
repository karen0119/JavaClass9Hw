package class13Hw;

public class Task3 {
    public static void main(String[] args) {
        // How would you swap  2 strings without a temporary variable?

        String a = "first";
        String b = "second";
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.print(a + " " + b);

        // prints: second first
    }
}
