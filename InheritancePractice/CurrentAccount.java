class CurrentAccount extends Account
{
    double overdraft;

    public CurrentAccount(int a, double overdraft)
    {
        super(a);
        this.overdraft = overdraft;
    }

    public void withdraw(double sum)
    {
        if (getBalance() - sum > -overdraft)
        {
            super.withdraw(sum);
        }
        else
        {
            System.out.println("Account.withdraw(...): " + "Overdraft limit hit" );
        }
    }
}