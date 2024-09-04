public class Constructor
{

    Constructor()
    {
        System.out.println("Non-Parameterized Custom Constructor");
    }

    Constructor(int n)
    {
        System.out.println("Parameterized Custom Constructor");
    }

    public static void main(String[] args) {

        Constructor c=new Constructor();

        System.out.println("===========");

        Constructor c2=new Constructor(4);
    }
}
