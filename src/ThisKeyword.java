public class ThisKeyword
{
    String company;

    ThisKeyword(String company)
    {
        this.company=company;
    }

    ThisKeyword()
    {
        this("IDeaS");
        System.out.println("Chaining");
        this.call();
    }

    public void call()
    {
        String company="IDeaS";
        System.out.println(company);

        System.out.println("=======");

        System.out.println(this.company);
    }


    public static void main(String[] args) {

        ThisKeyword t=new ThisKeyword();
    }
}

//this keyword is used for initializing instance variables.