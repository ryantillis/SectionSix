public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

        //For overloaded constructor methods, it is best to have a single constructor which is called by the others
    }

    public Account() {
        this(12345, 0,"Default","Default", "Default");
        System.out.println("Empty account generated.");
    }

    public Account(String customerName, String email, String phoneNumber) {
        this(99999, 0.00, customerName, email, phoneNumber);
    }


    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int depositAmount) {
        setBalance(getBalance() + depositAmount);
    }

    public void withdrawFunds(int withdrawalAmount) {
        if (this.balance - withdrawalAmount >= 0) {
            this.balance = (this.balance - withdrawalAmount);
        } else {
            System.out.println("Insufficient Funds.");
        }
    }
}
