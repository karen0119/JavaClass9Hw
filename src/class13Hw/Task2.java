package class13Hw;

public class Task2 {
    public static void main(String[] args) {
        /*
        How would you check if String is palindrome or not? aba=> true
        Abbc =>false
        - Palindromes are strings that read the
        same backwards as forwards, regardless of letter case.
         */
        String palindrome = "bab";
        palindrome = palindrome.toLowerCase();
        StringBuilder str = new StringBuilder(palindrome);
        str.reverse();
        String newPalindrome = str.toString();
        if (palindrome.equals(newPalindrome)) {
            boolean check = true;
            System.out.println(check);
        } else {
            System.out.println("false");
        }
            // prints: true
    }
}
