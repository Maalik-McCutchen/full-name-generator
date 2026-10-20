package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = myScanner.nextLine().trim();

        System.out.print("Please enter your middle name: ");
        String middleName = myScanner.nextLine().trim();

        System.out.print("Please enter your last name: ");
        String lastName = myScanner.nextLine().trim();

        System.out.print("Please enter your suffix: ");
        String suffix = myScanner.nextLine().trim();

        String fullName = firstName;

        if (middleName.isEmpty()){

        } else {
            fullName = fullName + " " + middleName;
        }

            fullName = fullName + " " + lastName;

            if (suffix.isEmpty()){

        } else {
            fullName = fullName + ", " + suffix;
        }

            System.out.println(fullName);


    }
}
