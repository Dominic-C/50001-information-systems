// import java.io.*;
public class Puppy
{
    int puppyAge;
    // public modifier
    // https://www.cs.princeton.edu/courses/archive/spr96/cs333/java/tutorial/java/javaOO/methodaccess.html
    public Puppy(String name)
    {
        System.out.println("Puppy name: " + name);
    }

    public void setAge(int age)
    {
        puppyAge = age;
    }

    public int getAge()
    {
        System.out.println("Getter, age is : " + puppyAge);
        return puppyAge;
    }

    public static void main(String [] args)
    {
        Puppy mypuppy = new Puppy("Tommy");

        mypuppy.setAge(2);

        mypuppy.getAge();

        System.out.println("Variable Value: " + mypuppy.puppyAge);

    }
}