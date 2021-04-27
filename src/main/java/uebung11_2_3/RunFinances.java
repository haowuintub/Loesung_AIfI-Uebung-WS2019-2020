package uebung11_2_3;

class RunFinances {

    public static void main(String[] args){

        BankAccount jakobsBankAccount = new BankAccount();

        System.out.println("balance: " + jakobsBankAccount.getBalance());


        jakobsBankAccount.addMoney(150.);

        System.out.println("balance: " + jakobsBankAccount.getBalance());


        jakobsBankAccount.withdrawMoney(400.);


        System.out.println("balance: " + jakobsBankAccount.getBalance());
    }
}


