import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        /*
        Esto es un comentario de bloque
        bla
         */

        // byte -128 a 127
        byte number1 = 30;
        // short 2 bytes: -32768 a 32767
        short number2 = 30000;
        // int 4 bytes: -2147483648 a 2147483647
        int number3 = 2000000;
        //long 8 bytes -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        long number4 = -9223372036854775808l;
        //float 4 bytes :6 o 7 numeros decimales
        float number5 = 25.65f;
        //double 8 bytes: 15 decimales
        double number6 = 25.6578473;
        //1 bit
        boolean isTrue = true;
        char char1 = 'a';

        System.out.println(number5);

        //Operators
        System.out.println(10 + 5);
        System.out.println(number2 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        int result = 10 / 4;
        double resultDecimal = 10. / 4.;
        System.out.println(result);
        System.out.println(resultDecimal);
        System.out.println(10.0 / 4.0);
        System.out.println(10. % 4.);
        double myNumber = .10;

        int plus1 = 10;
        System.out.println(++plus1);
        System.out.println(plus1);
        plus1--;
        ++plus1;
        --plus1;

        plus1 += 10;
        plus1 = plus1 + 10;
        plus1 *= 5;
        plus1 -= 5;
        plus1 /= 7;

        int var1 = -5;

        if (var1 > 5) {
            System.out.println("It's bigger than 5!");
        } else if (var1 > 0) {
            System.out.println("It's bigger than 0!");
        } else {
            System.out.println("It's smaller than 0");
        }

        int dayOfTheWeek = 5;
        String whichDay = whichDayOfTheWeek(dayOfTheWeek);
        System.out.println(whichDay);


        Integer wrapper = 5;
        int number = 5;
        char char2 = 'a';
        String name = "Jaume";
        System.out.println("Hello, my name is " + name);
        System.out.println(name.charAt(4));


        System.out.println(name.contains("fdfd"));

        String productName = "    Lavavajillas premium 01    ";
        String date = "18/01/2022";

        String result2 = productFormatter(productName, date);
        System.out.println(result2);

        String[] names = {"Jaume", "Marina", "Néstor", "Jordi", "Dina"};


        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        int counter = 10;

        while (counter < 10) {
            System.out.println("Hola Clase");
            counter++;
        }

        counter = 0;

        do {
            System.out.println(counter + ". Hola clase");
            counter++;

        } while (counter < 10);

        for (String n : names) {
            System.out.println(n);
        }

        Arrays.stream(names).forEach((n) -> {
            System.out.println(n);
        });

        int[] x = {1, 2, 34, 3, 5, 3};

        int[] result3 = multiply(x);

        for (int i : result3) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(invert(x)));
        System.out.println(Arrays.toString(invert2(x)));

    }

    private static int[] multiply(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
                result[i] = nums[i] * nums[i + 1];
            }

        result[nums.length - 1] = nums[nums.length - 1] * nums[0];

        return result;
    }

    private static int[] invert(int[] nums) {
        int[] result = new int[nums.length];
        int counter = 0;

        for(int i = nums.length -1; i >= 0; i--) {
            result[counter++] = nums[i];
        }

        return result;
    }

    private static int[] invert2(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            result[i] = nums[nums.length - 1 - i];
        }

        return result;
    }

    private static String productFormatter(String productName, String date) {
        productName = productName.trim().toUpperCase();
        date = date.trim();
        String result = productName.concat("-").concat(date).replace(" ", "_");

        return result;
    }


    static String whichDayOfTheWeek(int dayOfTheWeek) {
        switch (dayOfTheWeek) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            default:
                if (dayOfTheWeek < 0) {
                    return "Incorrrect";
                } else {
                    return "Weekend!!";
                }
        }
    }

}
