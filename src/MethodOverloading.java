public class MethodOverloading
{
    double balance;
    public void checkBalance()
    {
        System.out.println("Balance :"+balance);
    }

    public void checkBalance(int amount)
    {
        balance += amount;
        System.out.println("Balance :"+balance);
    }

    public void checkBalance(double withdraw)
    {
        balance -= withdraw;
        System.out.println("Balance :"+balance);
    }

    public static void main(String[] args) {

        MethodOverloading overloading=new MethodOverloading();
        overloading.checkBalance();
        overloading.checkBalance(5000);
        overloading.checkBalance(1000.0);

        System.out.println("============");
        MethodOverloading overloading1=new MethodOverloading();
        overloading1.checkBalance();
        overloading1.checkBalance(5600);
        overloading1.checkBalance(256.32);
    }
}
