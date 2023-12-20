package bank_pacakage;

public class Bankaccount2 {
    private int accountNumber;
    private String name;
    private String phoneNumber;
    private String address;
    double balance;

    public void setAccountNumber(int aNumber) {
        accountNumber = aNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBalance(double balance1){
        if(balance1<0){
            System.out.println("you can not set a negative number");
        }else {
            balance=balance1;
        }
    }
    public double getBalance() {
        return balance;

    }

    public void withdraw(double amount) {
        if (amount > 1000) {
            System.out.println("you can not withdraw");
        } else {

            balance = balance - amount;
        }


    }

    public void deposit(double amount) {
        balance = balance + amount;


    }

}