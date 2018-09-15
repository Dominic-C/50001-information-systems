import java.util.Scanner;

public class Challenge1
{
    public static void main(String [] args)
    {
        System.out.print("Enter your name: ");
        Scanner scan1 = new Scanner(System.in);
        String name = scan1.next();

        System.out.print("Enter your age: ");
        Scanner scan2 = new Scanner(System.in);
        int age = scan2.nextInt();

        System.out.printf("Name: %s\nAge: %d\n", name, age);
        
    }
}