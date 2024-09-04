public class ThisKeyword
{
    String company;

    ThisKeyword(String company)
    {
        this.company=company;
    }

    public void call()
    {
        String company="GoBrisk";
        System.out.println(company);

        System.out.println("=======");

        System.out.println(this.company);
    }
    public static void main(String[] args) {

        ThisKeyword t=new ThisKeyword("BriskPe");

        t.call();
    }
}

//this keyword is used for initializing instance variables.