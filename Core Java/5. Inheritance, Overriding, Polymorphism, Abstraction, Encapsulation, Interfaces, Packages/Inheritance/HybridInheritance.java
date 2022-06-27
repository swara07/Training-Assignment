class Bank
{
    String bankName="HDFC";
    void getData()
    {
            System.out.println("Bank name :"+bankName);
    }

}

interface SavingAccount
{
    void getBalance();
}

interface CurrentAccount
{
    void getWithdrawal();
}

class Person extends Bank implements SavingAccount , CurrentAccount
{
        public void getBalance()
        {
            System.out.println("Balance is 100000");
        }

        public void getWithdrawal()
        {
            System.out.println("Withdraw 1000");
        }

}


class HybridInheritance
{
    public static void main(String args[])
    {
        Person p=new Person();
        p.getData();
        p.getBalance();
        p.getWithdrawal();
    }
}