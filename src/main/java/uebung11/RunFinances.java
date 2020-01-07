package uebung11;

class RunFinances {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        System.out.println("balance: " + bankAccount.getBalance());

        bankAccount.addMoney(150.);

        System.out.println("balance: " + bankAccount.getBalance());

        bankAccount.withdrawMoney(400.);

        System.out.println("balance: " + bankAccount.getBalance());

    }

}
