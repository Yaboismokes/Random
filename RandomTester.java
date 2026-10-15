import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Write a description of class Random here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random generator;

    /**
     * Constructor for objects of class Random
     */
    public RandomTester()
    {
        // initialise instance variables
        generator = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom()
    {
        // put your code here
        System.out.println(generator.nextInt(100));
    }

    public void printMultiRandom(int howMany) {
        int count = 0;
        while(count < howMany) {
            System.out.println(generator.nextInt(100));
            count ++;
        }
    }

    public int throwDice() {
        int random = generator.nextInt(6);
        return random+1;

    }

    public String getResponse() {
        ArrayList<String> response = new ArrayList<>();
        response.add("yes");
        response.add("no");
        response.add("maybe");
        int index = generator.nextInt(response.size());

        return response.get(index);

    }

    public int getUpToMax(int max) {
        int random = generator.nextInt(max);
        return random+1;

    }

    public int getInRange(int min, int max) {
        int random = generator.nextInt(max-min+1);

        return random+min;
    }

}