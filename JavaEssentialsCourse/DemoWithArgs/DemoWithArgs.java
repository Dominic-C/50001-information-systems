public class DemoWithArgs
{
    public static void main (String [] args)
    {
        // enhanced for loop or sometimes called for-each loop to loop through arguments
        int i = 0;
        for (String x : args)
        {
            i++;
            System.out.printf("argumnet %d: %s\n", i, x);
        }
    }
}