class A
{
    int num1;
    static int num2;

    public void show()
    {
        num2 = 9;
    }
}

public class Demo
{
    public static void main()
    {
        A.num2 = 5;

        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();

        obj1.num1 = 1;
        obj2.num2 = 2;
        obj3.num3 = 3;
        
    }
}