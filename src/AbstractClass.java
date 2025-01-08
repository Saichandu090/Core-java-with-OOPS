public abstract class AbstractClass
{
    int animal;

    AbstractClass(int animal)
    {
        this.animal = animal;
    }

    public void see()
    {

    }

    public abstract void eat();

    //abstract class allows both concrete as well as abstract methods.
    //It can have constructor cause to reinitialize its instance variables.
    //We can't create an Object of abstract class.
}
