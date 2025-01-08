public class InstanceofOperator
{
    int a=21;
}

class Ferrari extends InstanceofOperator
{
    String b="RangeRover all!!";
}

class RangeRover extends InstanceofOperator
{
    double sal=45.6;
}

class MainForInstanceOf
{
    static void hey(InstanceofOperator object) {

        if (object instanceof RangeRover)
        {
            RangeRover h = (RangeRover) object;
            System.out.println(h.sal);
        }
        else if (object instanceof Ferrari ferrari)
        {
            System.out.println(ferrari.b);
        }
        else if (object != null)
        {
           InstanceofOperator normalObj=(InstanceofOperator) object;
           System.out.println(normalObj.a);
        }
    }
    public static void main(String[] args) {

        hey(new Ferrari());

        hey(new RangeRover());

        hey(new InstanceofOperator());
    }
}
