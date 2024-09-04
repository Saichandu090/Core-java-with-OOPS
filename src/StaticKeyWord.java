public class StaticKeyWord
{
    static int age;
    static String name;

    static void call()
    {
        System.out.println("Method :"+age+", "+name);
    }

    static {
        System.out.println("Hi ,I'm static block");
    }

    static {
        System.out.println("Hey this is second");
    }
    public static void main(String[] args)
    {
        name="Chandu";
        age=21;
        System.out.println(name+" "+age);
        name="Jenny";
        age=19;
        call();
    }

}
