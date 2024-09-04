public class SuperKeyword
{
    int age=21;
    String myName="Chandu";
    void me()
    {
        System.out.println("Chandu");
    }

    SuperKeyword(int age)
    {
        this.age=age;
    }
}

class Main extends SuperKeyword
{
    int age;
    String myName;
    Main()
    {
        super(19);
        System.out.println("Sub Class");
        System.out.println(super.myName);
    }

    public static void main(String[] args) {

        Main m=new Main();
        System.out.println(m.age+","+m.myName);


    }
}
