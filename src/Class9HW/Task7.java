package Class9HW;

public class Task7 {
    public static void main(String[] args) {

        // From an array of integer elements find the largest number.

        int[] num = {1, 30, 100, 80, 50, 10};
        int largest = num[0];
        for (int i : num) {
            if (i > largest){
                largest = i;
            }
        }
        System.out.println(largest);


    }

}
