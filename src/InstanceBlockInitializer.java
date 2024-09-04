public class InstanceBlockInitializer
{
    {
        System.out.println("First");
    }

    {
        System.out.println("Second");
    }

    public static void main(String[] args) {
        InstanceBlockInitializer i=new InstanceBlockInitializer();

        System.out.println("=============");

        InstanceBlockInitializer i1=new InstanceBlockInitializer();
    }

    {
        System.out.println("Third");
    }
}
