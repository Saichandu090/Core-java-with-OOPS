public class InstanceofOperator
{
    int a=21;
}

class Hi extends InstanceofOperator
{
    String b="Hey all!!";
}

class Hey extends InstanceofOperator
{
    double sal=45.6;
}

class Many
{

    static void hey(InstanceofOperator s) {

        if (s instanceof Hey)
        {
            Hey h = (Hey) s;
            System.out.println(h.sal);
        }
        else if (s instanceof Hi)
        {
             Hi i = (Hi)s;
            System.out.println(i.b);
        }
        else if (s instanceof InstanceofOperator)
        {
           InstanceofOperator l=(InstanceofOperator)s;
           System.out.println(l.a);
        }
    }
    public static void main(String[] args) {

        hey(new Hi());

        hey(new Hey());

        hey(new InstanceofOperator());
    }
}
