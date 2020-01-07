package uebung11;

class RunFinances {

    public static void main(String[] args){

        BankAccount jakobsBankAccount = new BankAccount();

        System.out.println("balance: " + jakobsBankAccount.getBalance());


        jakobsBankAccount.addMoney(150.);

        System.out.println("balance: " + jakobsBankAccount.getBalance());

        try {
            jakobsBankAccount.withdrawMoney(400.);
        } catch (YouHaveNoMoneyException e) {
            e.printStackTrace();
//            uncomment next line, if you want to program to terminate
//            throw new RuntimeException();
        }

        System.out.println("balance: " + jakobsBankAccount.getBalance());
    }
}


