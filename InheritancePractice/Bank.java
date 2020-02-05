class Bank
{
    int[] AccNumbers;

    private Bank(int[] AccNumbers)
    {
        this.AccNumbers = AccNumbers;
    }

    private void CheckAccType()
    {
        int i = 0;
        if (AccNumbers[i] >= 9)
        {
            AccNumbers[i] /= 10;
        }
    }
}