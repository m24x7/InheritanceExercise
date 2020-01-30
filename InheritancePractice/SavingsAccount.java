class SavingsAccount extends Account
{
    float interestRate;

    public SavingsAccount(int a, float interestRate)
    {
        super(a);
        this.interestRate = interestRate;
    }

    public void AddInterest()
    {
        deposit(getBalance()*interestRate);
    }
}