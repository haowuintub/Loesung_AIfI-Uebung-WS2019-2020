package uebung6;

import java.util.ArrayList;

class TransportSimulator {

    private ArrayList<Movable> movableFleet;

    TransportSimulator() {
        this.movableFleet = new ArrayList<>( );
    }

    TransportSimulator(ArrayList<Movable> movableFleet) {
        this.movableFleet = movableFleet ;
    }

    void addVehicle(Movable movable) {
        this.movableFleet.add(movable);
    }

    void simulate(int steps) {
        for (int i = 1; i <= steps; i++) {
            for (Movable movable : movableFleet) {

                increaseSpeedbyRandom(movable);

                if (movable instanceof CanMoveHorizontally && Math.random() < 0.25) {
                    ((CanMoveHorizontally) movable).changeDirection(Math.PI / 2);
                }
                movable.move();

                System.out.println("step " + i + ", " + movable.toString());
            }
        }
    }

    private void increaseSpeedbyRandom(Movable movable) {

        if (movable instanceof CanMoveVertically) {
            ((CanMoveVertically) movable).changeVerticalSpeed(10 * Math.random() - 5);
        }

        if (movable instanceof CanMoveHorizontally) {
            ((CanMoveHorizontally) movable).changeHorizontalSpeed(100 * Math.random());

        }

    }
}
