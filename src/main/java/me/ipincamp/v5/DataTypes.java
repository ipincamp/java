package me.ipincamp.v5;

public class DataTypes {
    public static void main(String [] args) {
        /*
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        Primitive Data Types
        > byte, short, int, long, float, double, boolean, char

        Non-Primitive Data Types
        > String, Arrays, Classes
        */

        /*
        Byte - store whole number from -128 to 127
               can be used int or other integer types
        */
        byte numByte = 100;
        System.out.println(numByte);

        /*
        Short - store whole number from -32768 to 32767
        */
        short numShort = 5000;
        System.out.println(numShort);

        /*
        Int - store whole numbers from -2147483648 to 2147483647
              preferred data type when we create variables with a numeric value.
        */
        int numInt = 100000;
        System.out.println(numInt);

        /*
        Long - store whole numbers from -9223372036854775808 to 9223372036854775807
        Important: you should end the value with an "L"
        */
        long numLong = 15000000000L;
        System.out.println(numLong);

        /*
        Floating Point Types
        Can store fractional numbers from 3.4e−038 to 3.4e+038
        Important: you should end the value with an "f"
        */
        float numFloat = 5.23f;
        System.out.println(numFloat);

        /*
        Double - can store fractional numbers from 1.7e−308 to 1.7e+308
        Note that you should end the value with a "d"
         */
        double numDouble = 23.43d;
        System.out.println(numDouble);

        /*
        The accuracy of the float is only six or seven digits shattered,
        while the double variable has a precision of about 15 digits.
        It is therefore safer to use double for most calculations.
        */

        /*
        Boolean - true/false
        */
        boolean isNight = true;
        boolean isDay = false;
        System.out.println(isNight + " " + isDay);

        /*
        Char - store single character. Like 'A' 'a' 'e' 'D'
         */
        char myPart = 'A';
        System.out.println(myPart);

        /*
        String - store text. must be surrounded by double quotes.
         */
        String myName = "Nur Arifin";
        System.out.println(myName);

        /*
        The main differences between primitive and non-primitive data types are:

        > Primitive types are predefined (defined) in Java. Non-primitive types are
          created by programmers and not defined by Java (except for String).
        > Non-primitive types can be used to call methods to perform certain operations,
          whereas primitive types cannot.
        > Primitive types always have a value, while non-primitive types can be null.
        > Primitive types start with a lowercase letter,
          while non-primitive types start with an uppercase letter.
        > The size of primitive types depends on the data type,
          while non-primitive types have all the same size.
        */
    }
}
