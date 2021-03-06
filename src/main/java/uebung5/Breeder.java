package uebung5;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;
import java.awt.Color;

public class Breeder extends DisposableBug {

    int age ;

    Breeder() {
        age = 0 ;
        this.setColor(Color.RED);
    }

    @Override
    public void move() {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();

        if (Math.random() <= 0.15) {
            BabyBug baby = new BabyBug();
            baby.putSelfInGrid(gr, loc);
        } else {
            Flower flower = new Flower(getColor());
            flower.putSelfInGrid(gr, loc);
        }
    }


    @Override
    public String toString() {
        return getClass().getName() + "[" + ",age=" + age + /*",location=" + location + ",direction="
                + direction + ",color=" + color +*/ "]";
    }

}
