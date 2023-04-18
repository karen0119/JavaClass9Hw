package class10Hw;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create 2D array of cars : american, german, korean, italian.
        Then retrieve all values from that array using 2 different loops
         */

        String[][] cars = {{"american", "german"},
                {"korean", "italian"}
        };
        //#1 for loop
        for (int row = 0; row < cars.length; row++) {
            for (int column = 0; column < cars[row].length; column++) {
                System.out.print(cars[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //#2 enhanced for loop
        for (String[] car : cars) {
            for (String type : car)
                System.out.print(type + " ");
        }
        System.out.println();
    }
}
