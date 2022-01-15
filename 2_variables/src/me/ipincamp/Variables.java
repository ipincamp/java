package me.ipincamp;

public class Variables {
    public static void main(String [] args) {
        /**
         * There are 6 Data Types
         *
         * int - stores integers (whole numbers), without decimals, such as 123 or -123
         * double - used to represent floating-point numbers. It uses 64 bits to store
         *          a variable value and has a range greater than float type.
         * char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
         * String - stores text, such as "Hello". String values are surrounded by double quotes
         * boolean - stores values with two states: true or false
         * null - A primitive type has always a value, while non-primitive types can be null.
         *
         * How to make variable:
         * > type variableName = value;
         *
         * How to display variable:
         * > System.out.println(variableName);
         * > System.out.println("Hello " + variableName);
         *
         */
        int myAge = 21;

        System.out.println(myAge);

        /**
         * Add a variable to another variable
         */
        String startName = "arif";
        int myWeight = 53;

        System.out.println(startName + " " + myWeight);

        /**
         * Changing the value of the variable
         */
        String name = "ipincamp";
        name = "Nur Arifin";

        System.out.println(name);

        // Or you can just use the variable name
        String varName;
        varName = "this name";

        System.out.println(varName);

        /**
         * Final variables / constants
         */
        final int mySize = 27;
        // Cannot assign a value to final variable 'mySize'

        /**
         * Declare many variables
         */
        int myHeight = 165, lastYear = 163, nextYear = 168;

        System.out.println(myHeight + lastYear + nextYear);

        /**
         * The general rules for naming variables are:
         *
         * > Names can contain letters, digits, underscores, and dollar signs
         * > Names must begin with a letter
         * > Names should start with a lowercase letter and it cannot contain whitespace
         * > Names can also begin with $ and _ (but we will not use it in this tutorial)
         * > Names are case sensitive ("myVar" and "myvar" are different variables)
         * > Reserved words (like Java keywords, such as int or boolean) cannot be used as names
         *
         */
    }
}
