package class10Hw;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integer type and store numbers in
         3 rows and 3 columns.
        Print the sum of all numbers.
         */
        int[][] numbers = {
                {1, 2, 3}, //6
                {4, 5, 6}, //15
                {7, 8, 9,}  //24
        };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < numbers[i].length; j++) {
                sum = sum + numbers[i][j];

            }
        System.out.println(sum);
    }
}
