package uebung5_2b;

import gridworld.framework.actor.Bug;

import java.awt.*;

class DisposableBug extends Bug {

    private int steps = 1 ;

    DisposableBug() {
        super(Color.BLUE);
    }

    @Override
    public void act() {

        super.act();

        if (Math.random() <= 0.4) {
            this.turn();
        }

        if (Math.random() <= 0.8 && steps > 25) {
            this.removeSelfFromGrid();
        }

        steps ++ ;
    }

}
