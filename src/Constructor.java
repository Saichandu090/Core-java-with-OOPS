public class Constructor
{

    Constructor()
    {
        System.out.println("Non-Parameterized Custom Constructor");
    }

    Constructor(int number)
    {
        System.out.println("Parameterized Custom Constructor");
    }

    public static void main(String[] args) {

        Constructor constructor1=new Constructor();

        System.out.println("===========");

        Constructor constructor2=new Constructor(4);
    }
}
