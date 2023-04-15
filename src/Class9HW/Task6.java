package Class9HW;

public class Task6 {
    public static void main(String[] args) {
        /* Create an array on integers and
        calculate the sum of all elements in an array
         */

        int[] num = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        System.out.println(sum);
    }
}
