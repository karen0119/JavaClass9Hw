package class10Hw;

public class Task6 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north america countries,
        south america countries, europe countries, asian countries,
        african countries. Then print all values from that array using 2
        different loops and calculate how many total countries been stored.
         */
        String[][]countries={
                {"USA","Canada","Guatemala","Mexico"},
                {"Colombia","Brasil","Peru","Chile"},
                {"Serbia","Italy","France","Spain"},
                {"China","India","Japan","Indonesia"},
                {"Congo","Mali","Nigeria","Egypt"}
        }; //#1 enhanced loop
        int count=0;
        for (String[]arr1:countries){
            for (String country:arr1){
                System.out.print(country+" "); //prints country names
                count++; //adds count

            }System.out.println();
        }
        System.out.println(count); //prints total number of countries

        //#2 for loop
        count=0;
        for (int i = 0; i <countries.length ; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" "); //prints country names
                count++;  //adds count
            }
            System.out.println();
        }
        System.out.println(count);  //prints total number of countries
    }
}
