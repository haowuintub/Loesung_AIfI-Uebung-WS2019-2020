package uebung11_2_1;

class YouHaveNoMoneyException extends Exception {

    YouHaveNoMoneyException() {
        super("Unfortunately, Jakob, you do not have enough money on your Account and we do not trust you enough, to let you have a negative balance. Sorry!");
    }

}
