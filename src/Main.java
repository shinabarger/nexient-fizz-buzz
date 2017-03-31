public class Main {

    public static int getOneToOneHundred(int args) {
        System.out.println("Hello World!");
        int i;
        for (i = 1; i < 100; i++) {

            //check each digit 1-100, and call the FizzBuzz method
            System.out.println(fizzBuzz(i));
        }

        //return i to create test that for loop is looping correctly
        return i;

    }

    public static String fizzBuzz(int number) {

        String result = "";

        if ((number % 5 == 0) && (number % 3 == 0)) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        }
        //convert int number to string
        else result = Integer.toString(number);

        return result;
    }
}
