package uebung11_2_3;

import uebung9_ohneReception.Run;

class YouHaveNoMoneyException extends RuntimeException {

    YouHaveNoMoneyException() {
        super("Unfortunately, Jakob, you do not have enough money on your Account and we do not trust you enough, to let you have a negative balance. Sorry!");
    }

}
