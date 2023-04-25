package class12Hw;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
           /*
      Write a program that reads two people's first
      names and if they expecting boy or girl?
      Based on the input suggests a name for a baby:
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is mom's first name?");
        String mom= scanner.next();
        System.out.println("What is dad's first name?");
        String dad= scanner.next();
        System.out.println("Is baby boy or girl?");
        String babyGender= scanner.next();

        String suggestedName="null";
        if (babyGender.equalsIgnoreCase("boy")){
            suggestedName=dad.substring(0,3)+(mom.substring(mom.length()-2));
            System.out.println("Suggested baby name:"+suggestedName.toUpperCase());}
        else if (babyGender.equalsIgnoreCase("girl")){
            suggestedName=mom.substring(0,2)+dad.substring(dad.length()-3);
            System.out.println("Suggested baby name:"+suggestedName.toUpperCase());
        }

    }
    }

