public class FinalKeyword
{
    final int A=1;
    final int ID=237;
    final public void add()
    {
        System.out.println(A+1);
    }

    public static void main(String[] args) {
        FinalKeyword f=new FinalKeyword();
        f.add();
    }
}

final class Sai extends FinalKeyword
{
    //Final class can't be inherited.
    //Final variable(CONSTANT) can't be re-initialized.
    //Final method can't be over Ridden.
}
