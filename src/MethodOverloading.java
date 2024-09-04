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

        MethodOverloading m=new MethodOverloading();
        m.checkBalance();
        m.checkBalance(5000);
        m.checkBalance(1000.0);

        System.out.println("============");
        MethodOverloading m2=new MethodOverloading();
        m2.checkBalance();
        m2.checkBalance(5600);
        m2.checkBalance(256.32);
    }
}
