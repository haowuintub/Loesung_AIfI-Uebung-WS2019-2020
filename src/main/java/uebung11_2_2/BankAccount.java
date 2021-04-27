package uebung11_2_2;

class BankAccount {

    private double balance ; // Kontostand

    BankAccount() {
        this.balance = 0. ;
    }

    void addMoney(double money) {
        this.balance += money;
    }

    void withdrawMoney(double money)  {

        try {
            if (money > balance) {
                throw new YouHaveNoMoneyException();
            }
        }catch (YouHaveNoMoneyException e) {
            e.printStackTrace();
//            uncomment next line, if you want to program to terminate
//            throw new RuntimeException();
        }

        this.balance -= money;
    }

    double getBalance() {
        return balance ;
    }

}


