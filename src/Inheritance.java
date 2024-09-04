public class Inheritance
{

    int id=19;
    String jobRole="BackEnd Developer";
}

class B extends Inheritance
{
    public static void main(String[] args) {
        B b=new B();
        System.out.println("Single level Inheritance");
        System.out.println("Id :"+b.id);
        System.out.println("Role :"+b.jobRole);
    }
}

class C extends B
{
    public static void main(String[] args) {
        System.out.println("Multi level Inheritance ");
        C c=new C();
        System.out.println(c.id+" "+c.jobRole);
    }
}


class D extends B
{
    public static void main(String[] args) {

        System.out.println("Hirarichal level Inheritance");
        D d=new D();
        System.out.println(d.id+"::"+d.jobRole);
    }
}