package class10Hw;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you
        will store odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.
         */
        int[][] numbers = {
                {2, 8, 6, 7},
                {5, 12, 15, 99},
                {55, 199, 4, 100}
        };
        for (int i = 0; i < numbers.length; i++) { //rows
            for (int j = 0; j < numbers[i].length; j++) { //columns
                if (numbers[i][j] % 2 == 0) { //even numbers
                    System.out.println(numbers[i][j]);

                }


            }
        }
    }
}
