package me.ipincamp;

public class DataTypes {
    public static void main(String [] args) {
        /**
         * int myNum = 5;               // Integer (whole number)
         * float myFloatNum = 5.99f;    // Floating point number
         * char myLetter = 'D';         // Character
         * boolean myBool = true;       // Boolean
         * String myText = "Hello";     // String
         *
         * Primitive Data Types
         * > byte, short, int, long, float, double, boolean, char
         *
         * Non-Primitive Data Types
         * > String, Arrays, Classes
         */

        /**
         * Byte - store whole number from -128 to 127
         * can be used int or other integer types
         */
        byte numByte = 100;
        System.out.println(numByte);

        /**
         * Short - store whole number from -32768 to 32767
         */
        short numShort = 5000;
        System.out.println(numShort);

        /**
         * Int - store whole numbers from -2147483648 to 2147483647
         * preferred data type when we create variables with a numeric value.
         */
        int numInt = 100000;
        System.out.println(numInt);

        /**
         * Long - store whole numbers from -9223372036854775808 to 9223372036854775807
         * Important: you should end the value with an "L"
         */
        long numLong = 15000000000L;
        System.out.println(numLong);

        /**
         * Floating Point Types
         * Can store fractional numbers from 3.4e−038 to 3.4e+038
         * Important: you should end the value with an "f"
         */
        float numFloat = 5.23f;
        System.out.println(numFloat);

        /**
         * Double - can store fractional numbers from 1.7e−308 to 1.7e+308
         * Note that you should end the value with a "d"
         */
        double numDouble = 23.43d;
        System.out.println(numDouble);

        /**
         * Ketepatan float hanya enam atau tujuh digit desimal,
         * sedangkan double variabel memiliki presisi sekitar 15 digit.
         * Oleh karena itu lebih aman digunakan double untuk sebagian besar perhitungan.
         */

        /**
         * Boolean - true/false
         */
        boolean isNight = true;
        boolean isDay = false;
        System.out.println(isNight + " " + isDay);

        /**
         * Char - store single character. Like 'A' 'a' 'e' 'D'
         */
        char myPart = 'A';
        System.out.println(myPart);

        /**
         * String - store text. must be surrounded by double quotes.
         */
        String myName = "Nur Arifin";
        System.out.println(myName);

        /**
         * Perbedaan utama antara tipe data primitif dan non-primitif adalah:
         *
         * Tipe primitif sudah ditentukan sebelumnya (sudah ditentukan) di Jawa. Tipe non-primitif dibuat oleh programmer dan tidak didefinisikan oleh Java (kecuali untuk String).
         * Tipe non-primitif dapat digunakan untuk memanggil metode untuk melakukan operasi tertentu, sedangkan tipe primitif tidak bisa.
         * Tipe primitif selalu memiliki nilai, sedangkan tipe non-primitif dapat berupa null.
         * Tipe primitif dimulai dengan huruf kecil, sedangkan tipe non-primitif dimulai dengan huruf besar.
         * Ukuran tipe primitif tergantung pada tipe data, sedangkan tipe non-primitif memiliki semua ukuran yang sama.
         */
    }
}
