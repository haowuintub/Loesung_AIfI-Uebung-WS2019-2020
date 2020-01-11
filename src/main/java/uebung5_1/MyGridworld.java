package uebung5_1;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Rock;

class MyGridworld {

    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        world.add(new Bug());
        world.add(new Rock());
        world.show();

    }

}
