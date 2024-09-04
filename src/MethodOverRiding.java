public interface MethodOverRiding
{
    void add();
    void sub();
}

class Impl implements MethodOverRiding
{
    @Override
    public void add()
    {
        System.out.println("Adding");
    }

    @Override
    public void sub()
    {
        System.out.println("Subtracting");
    }

    public static void main(String[] args) {

        Impl a=new Impl();
        a.add();
        a.sub();
    }
}
