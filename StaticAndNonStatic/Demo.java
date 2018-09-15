class A
{
    int num1;
    static int num2;

    public void show()
    {
        num2 = 9;

        
    }

    public static void increment()
    {
        num1++;
    }
    // bottom line, can use static variable inside a non static method. Because all the non static members share the same static variable
    // but cannot use non static variables inside a static method
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

        // if i call A.increment(), which is a static method,  we're not sure which instances of num1 are being incremented

    }
}