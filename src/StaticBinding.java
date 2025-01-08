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
        StaticBinding staticBinding =new StaticBinding();
        staticBinding.eat();
        staticBinding.eat("Banana");
    }
}


//This is Static Binding also an example for Compile Time Polymorphism
