package class10Hw;

public class Task3 {
    public static void main(String[] args) {
        /*
     Using 2D array create a grocery list.
    Inside you should have an array of veggies, fruits, dairy and sweets.
    Retrieve all values from that array using 2 different loops
         */
        String[][] arr = {
                {"Broccoli", "Lettuce", "Carrots"},
                {"Orange", "Banana", "Strawberry"},
                {"Milk", "Yoghurt"},
                {"Bread", "Chocolate", "Caramel"}
        };
        //#1 for loop
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //#2 enhanced for loop
        for (String[] list : arr) {
            for (String grocery : list) {
                System.out.print(grocery + " ");
            }
            System.out.println();
        }
    }
}
