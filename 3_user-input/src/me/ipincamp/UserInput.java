package me.ipincamp;

import java.util.Scanner;

public class UserInput {
    public static void main(String [] args) {
        /**
         * The Scanner class is used to get user input, and it is found in the java.util package.
         *
         * To use the Scanner class, create an object of the class and
         * use any of the available methods found in the Scanner class documentation.
         *
         */
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        /**
         * For multiple words input
         *
         * String fullName = scanner.nextLine();
         * System.out.println(fullName);
         *
         */
        System.out.println(name);

        System.out.println("Please input your age: ");
        /**
         * Input in the same line
         *
         * System.out.print("Please input your age: ");
         *
         */
        int age = scanner.nextInt();
        /**
         * Input Types
         *
         * nextBoolean()	Reads a boolean value from the user
         * nextByte()	    Reads a byte value from the user
         * nextDouble()	    Reads a double value from the user
         * nextFloat()	    Reads a float value from the user
         * nextInt()	    Reads a int value from the user
         * nextLine()	    Reads a String value from the user
         * nextLong()	    Reads a long value from the user
         * nextShort()	    Reads a short value from the user
         */
        System.out.println(age);
    }
}
