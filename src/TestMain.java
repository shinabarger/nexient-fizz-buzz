import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 3/31/17.
 */
public class TestMain {

    @org.junit.Test
    public void testIfFifteenReturnsFizzBuzz() throws Exception {
        String expected = "FizzBuzz";
        String actual = Main.fizzBuzz(15);
        assertEquals(expected, actual);
    }


    @org.junit.Test
    public void testIfFiveReturnsBuzz() throws Exception {
        String expected = "Buzz";
        String actual = Main.fizzBuzz(5);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testThreeReturnsFizz() throws Exception {
        String expected = "Fizz";
        String actual = Main.fizzBuzz(3);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testOneToOneHundred() throws Exception {
        int expected = 100;
        int actual = Main.getOneToOneHundred(0);
        assertEquals(expected, actual);
    }



}


