package Class9HW;

public class Task5 {
    public static void main(String[] args) {
        /*
        Task5: Create an array of animals and store 5 elements into it.
        Using 2 different loops print all elements from the array.
         */

        // Array 1
        String[] animal = {"dog", "cat", "fish", "bear", "snake"};

        for (int i = 0; i < animal.length; i++){
            System.out.println(animal[i]);
        }
        System.out.println();
        // Array 2
        for (String s : animal) {
            System.out.println(s);
        }

    }
}
