public class Inheritance
{

    int id=19;
    String jobRole="BackEnd Developer";
}

class Ball extends Inheritance
{
    public static void main(String[] args) {
        Ball ball =new Ball();
        System.out.println("Single level Inheritance");
        System.out.println("Id :"+ ball.id);
        System.out.println("Role :"+ ball.jobRole);
    }
}

class Cricket extends Ball
{
    public static void main(String[] args) {
        System.out.println("Multi level Inheritance ");
        Cricket cricket =new Cricket();
        System.out.println(cricket.id+" "+ cricket.jobRole);
    }
}


class Dravid extends Ball
{
    public static void main(String[] args) {

        System.out.println("Hirarichal level Inheritance");
        Dravid d=new Dravid();
        System.out.println(d.id+"::"+d.jobRole);
    }
}