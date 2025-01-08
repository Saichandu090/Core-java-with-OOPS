public class RunTimePolymorphism
{
    public void call()
    {
        System.out.println("Police");
    }
}

class Mains extends RunTimePolymorphism  //Rule-1 IS-Bmw(inheritance)
{

    @Override  //Rule-2 OverRide
    public void call()
    {
        System.out.println("Doctor");
    }

    public static void main(String[] args) {

        RunTimePolymorphism r=new Mains(); //Rule-3 UpCasting
        r.call();
    }
}


//RTP is called as Dynamic Binding