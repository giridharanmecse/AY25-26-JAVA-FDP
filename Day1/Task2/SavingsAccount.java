public class SavingsAccount extends Account {

    private float rateOfInterest;

    public SavingsAccount(String accNo, int balance, float rateOfInterest) {
        super(accNo, balance);
        this.rateOfInterest = rateOfInterest;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public void printAccountDetails() {
        System.out.println("--- Savings Account Details ---");
        System.out.println("Account number : "+this.getAccNo());
        System.out.println("Balance : "+this.getBalance());
        System.out.println("Rate of Interest :"+this.getRateOfInterest());
    }

    @Override
    public void printBankDetails() {
        System.out.println("Bank Details of Saving account");

    }
}
