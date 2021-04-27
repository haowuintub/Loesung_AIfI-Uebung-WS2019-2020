package uebung11_2_3;

class BankAccount {

    private double balance ; // Kontostand

    BankAccount() {
        this.balance = 0. ;
    }

    void addMoney(double money) {
        this.balance += money;
    }

    void withdrawMoney(double money) throws YouHaveNoMoneyException {

        if (money > balance) {
            throw new YouHaveNoMoneyException();
        }

        this.balance -= money;
    }

    double getBalance() {
        return balance ;
    }

}


