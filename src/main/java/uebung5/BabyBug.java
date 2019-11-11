package uebung5;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

import java.awt.*;

public class BabyBug extends DisposableBug {

    private int flowersEaten = 0 ;

    public BabyBug() {
        this.setColor(Color.YELLOW);
    }

    @Override
    public void act()
    {
        super.act();

        eatFlowerAhead() ;

        if (flowersEaten >= 3) {
            Location loc = this.getLocation() ;
            Grid gr = this.getGrid() ;
            this.removeSelfFromGrid();
            if (Math.random() <= 0.5) {
                DisposableBug bug = new DisposableBug();
                bug.putSelfInGrid(gr,loc) ;
            } else {
                Breeder breeder = new Breeder();
                breeder.putSelfInGrid(gr,loc) ;
            }
        }
    }

    @Override
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }

    private void eatFlowerAhead() {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return;

        Actor neighbor = gr.get(next);
        if (neighbor instanceof Flower) {
            neighbor.removeSelfFromGrid();
            flowersEaten++;
        }
    }
}
