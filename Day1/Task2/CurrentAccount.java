public class CurrentAccount extends Account {

    private float rateOfIntrerest;

    public CurrentAccount(String accNo, int balance, float rateOfIntrerest) {
        super(accNo, balance);
        this.rateOfIntrerest = rateOfIntrerest;
    }

    public float getRateOfIntrerest() {
        return rateOfIntrerest;
    }

    public void setRateOfIntrerest(float rateOfIntrerest) {
        this.rateOfIntrerest = rateOfIntrerest;
    }

    @Override
    public void printAccountDetails() {
        System.out.println("--- Current Account Details ---");
        System.out.println("Account number : "+this.getAccNo());
        System.out.println("Balance : "+this.getBalance());
        System.out.println("Rate of Interest :"+this.getRateOfIntrerest());

    }

    @Override
    public void printBankDetails() {
        System.out.println("Bank Details of Current Account");

    }
}
