package uebung5;

import gridworld.framework.actor.ActorWorld;

public class MyGridworld{

    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();

        world.add(new Breeder());
        world.show();

    }

}
