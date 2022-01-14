package me.ipincamp;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input some name or word: ");
        String name = scanner.next();
        /**
         * For fullName right?
         *
         * String name = scanner.nextLine();
         */
        System.out.println(name);

        /**
         * Only specific input
         * Ex. Int
         *
         * For output in same line
         * System.out.print(age);
         */
        System.out.print("Please input number: ");
        int age = scanner.nextInt();
        System.out.println(age);
    }
}
