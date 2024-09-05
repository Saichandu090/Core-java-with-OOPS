class ThisKeyword
{
    String company;

    ThisKeyword(String company)
    {
        this.company=company;  //Usage -1
    }

    ThisKeyword()
    {
        this("BriskPe");  //Usage-2
        System.out.println("Chaining");
        this.call(); //Usage-3
    }

    public void call()
    {
        String company="GoBrisk";
        System.out.println(company);

        System.out.println("=======");

        System.out.println(this.company);
    }

    public ThisKeyword have(Object k)
    {
       // have(this); //Usage-4
        return this; //Usage-5
    }


    class Anony
    {
       void print()
       {
           System.out.println("Hey "+ThisKeyword.this.company);
           ThisKeyword.this.call();  //If its a non static member make use this keyword for not creating an Object.

       }
    }
    public static void main(String[] args) {

        ThisKeyword t=new ThisKeyword();
        t.have(new ThisKeyword());

    }

}

//this keyword is used for initializing instance variables.