package class9Hw;

public class Task4 {
    public static void main(String[] args) {

         /*
        Task 4: Create an array of cars and store 6 elements into it.
        Using 2 different loops print all values from the array.
         */

        // loop 1

        String[] cars = {"Hyundai", "Jeep", "Nissan", "Chevy", "Toyota"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");

        }

        System.out.println();

        // loop 2

        for (String car : cars) {
            System.out.print(car + " ");
        }




    }
}
