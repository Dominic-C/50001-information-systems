public class Fibonacci
{
    public static void counts(int n)
    {
        int [] array;
        array = new int[n];
        for (int i =0; i < n; i++)
        {
            if (i == 0)
            {
                array[0] = 0;
                System.out.println("0");
            }
            if (i == 1)
            {
                array[1] = 1;
                System.out.println("1");
            }
            if (i > 1) // i when it's value is 2 and above
            {
                array[i] = array[i-2]+array[i-1];// new number is the sum of the previous two numbers
                System.out.println(array[i-2]+array[i-1]);
            }

        }
    }

    public static void main(String [] args)
    {
        counts(5);
    }
}