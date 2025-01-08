public class CovariantReturnType
{

}

class Bmw extends CovariantReturnType
{
    Bmw fun()
    {
        System.out.println("Fun of Bmw");
        return new Bmw();
    }
}

class Samsung extends Bmw
{
    @Override
    Samsung fun()
    {
        System.out.println("Fun of Samsung");
        return new Samsung();
    }
}

class Main2
{
    public static void main(String[] args) {

        Samsung samsung =new Samsung();
        samsung.fun();

        Bmw bmw =new Bmw();
        bmw.fun();
    }
}
