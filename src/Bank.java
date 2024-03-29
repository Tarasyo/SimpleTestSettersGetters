public class Bank {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String number;
    public Bank(){

        this(0,00.00, "Default name", "Default email", "-");

    }


    public Bank(int accountNumber, double balance, String name, String email, String number) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public void deposit(double add){

        this.balance += add;
        System.out.println("Than you for deposit, your balance now: "+balance);

    }

    public void windraw(int take){
        if(balance >= take){
           this.balance -= take;
           System.out.println("Your balance now: "+balance);
        }else{
            System.out.println("Sorry, not enough founds");
        }

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
