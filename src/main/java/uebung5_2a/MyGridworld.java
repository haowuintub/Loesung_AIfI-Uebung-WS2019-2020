package uebung5_2a;

import gridworld.framework.actor.ActorWorld;


class MyGridworld {

    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        world.add(new DisposableBug());
        world.show();

    }

}
