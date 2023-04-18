package class9Hw;

public class Task2 {
    public static void main(String[] args) {
        /*
        Task 2: Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array).
         */

        String [] names = {"Danny", "Nicole", "Tom", "Ben", "Karen"};
        System.out.println(names[4]);

        System.out.println();

        String [] namesNew = new String[5];
        namesNew[0] = "Danny";
        namesNew[1] = "Nicole";
        namesNew[2] = "Tom";
        namesNew[3] = "Karen";
        namesNew[4] = "Ben";

        System.out.println(namesNew[3]);


    }
}
