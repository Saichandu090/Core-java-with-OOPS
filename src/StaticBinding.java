public class StaticBinding
{
    public void eat()
    {
        System.out.println("Eating");
    }

    public void eat(String s)
    {
        System.out.println("Eating "+s);
    }
}

class Second
{
    public static void main(String[] args) {
        StaticBinding s=new StaticBinding();
        s.eat();
        s.eat("Banana");
    }
}


//This is Static Binding also an example for Compile Time Polymorphism
