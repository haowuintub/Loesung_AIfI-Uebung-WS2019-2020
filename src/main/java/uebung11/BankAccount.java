package uebung11;

class BankAccount {

    private double balance ; // Kontostand

    BankAccount() {
        this.balance = 0. ;
    }

    void addMoney(double money) {
        this.balance += money;
    }

    void withdrawMoney(double money) {
        this.balance -= money;
    }

    double getBalance() {
        return balance ;
    }



}
