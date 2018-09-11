public class Fibonacci
{
    public static String counts(int n)
    {
        String ans = "0,1";
        int [] array;
        array = new int[n];
        for (int i =0; i < n; i++)
        {
            if (i == 0)
            {
                array[0] = 0;
//                System.out.println("0");
            }
            if (i == 1)
            {
                array[1] = 1;
//                System.out.println("1");
            }
            if (i > 1) // i when it's value is 2 and above
            {
                array[i] = array[i-2]+array[i-1];// new number is the sum of the previous two numbers
                ans = ans + "," + array[i];
//                System.out.println(array[i-2]+array[i-1]);
            }

        }
        return ans; // answer is a concatenated class
    }

    public static void main(String [] args)
    {
        // getting command line arguments, example from oracle website
        int firstArg = 0;

        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        // end of snippet
        String answer = counts(firstArg);
        System.out.println("Result is: " + answer);
    }
}