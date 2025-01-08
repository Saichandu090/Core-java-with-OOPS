public class ObjectCloning
{
    int x;
    String y;
    public static void main(String[] args) {

        ObjectCloning o=new ObjectCloning();
        o.x=21;
        o.y="RangeRover";

        ObjectCloning o1=o;

        System.out.println(o1.x+" "+o1.y);
        System.out.println(o.x+" "+o.y);

        o1.x=37;

        System.out.println(o1.x+" "+o1.y);
        System.out.println(o.x+" "+o.y);

        o.y="Hoii";

        System.out.println(o1.x+" "+o1.y);
        System.out.println(o.x+" "+o.y);
    }
}

class Test
{
    int a;
    int b;
}

class Test2 implements Cloneable
{
    int x;
    int y;
    Test k=new Test();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Cherry
{
    public static void main(String[] args) throws CloneNotSupportedException {

        Test2 t=new Test2();
        t.x=21;
        t.y=56;
        t.k.a=78;
        t.k.b=456;

        System.out.println("============");
        System.out.println(t.x+" "+t.k.a+" "+t.y+" "+t.k.b);

        Test2 tt=(Test2)t.clone();

        tt.x=34;
        tt.k.a=99;

        System.out.println(t.x+" "+t.k.a+" "+t.y+" "+t.k.b);
        System.out.println(tt.x+" "+tt.k.a+" "+tt.y+" "+tt.k.b);

        //This is shallow copying using clone() from Object class.

        //Here the primitives of Test class values are not changing in copy of tt whereas the Object related (t) values are changing after reassigning it.
        //To overcome this we go to Deep copy to make deep copy in primitives of Test also.
    }
}

class Test3 implements Cloneable {
    int x;
    int y;

}