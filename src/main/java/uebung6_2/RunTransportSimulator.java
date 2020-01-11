package uebung6_2;

import java.util.ArrayList;

public class RunTransportSimulator {

    public static void main(String[] args) {

        // Aufgabe 1b : Elevator
        Elevator elevator = new Elevator("elev", 0);

        System.out.println(elevator.toString());
        elevator.changeVerticalSpeed(5);
        elevator.move();
        System.out.println(elevator.toString());
        elevator.changeVerticalSpeed(-15);
        elevator.move();
        System.out.println(elevator.toString());


        // Aufgabe 1c : Ship
        Ship ship = new Ship("ship", 0, 0);

        System.out.println(ship.toString());
        ship.changeDirection(90);
        ship.changeHorizontalSpeed(10);
        ship.move() ;
        System.out.println(ship.toString());

        // Aufgabe 1d : Helicopter
        Helicopter helicopter = new Helicopter("heli", 0, 0, 0);
        System.out.println(helicopter.toString());
        helicopter.changeVerticalSpeed(50);
        helicopter.changeHorizontalSpeed(10);
        helicopter.changeDirection(Math.PI/2);
        helicopter.move();
        System.out.println(helicopter.toString());

        helicopter.changeVerticalSpeed(-200);
        helicopter.move();
        System.out.println(helicopter.toString());

        helicopter.move();
        System.out.println(helicopter.toString());


        // Aufgabe 2 : Collections
        ArrayList<Movable> movableFleet = new ArrayList<>();

        movableFleet.add(elevator);
        movableFleet.add(ship);
        movableFleet.add(helicopter);

        for (Movable movable : movableFleet) {
            if (movable instanceof CanMoveVertically) {
                System.out.println("Im an Elevator");
                CanMoveVertically elev = (CanMoveVertically) movable;
                elev.changeVerticalSpeed(10000);
            }
            movable.move();
            System.out.println(movable.toString());

        }

        // TransportSimulator
        TransportSimulator mySim = new TransportSimulator(movableFleet);

        movableFleet.add(new Elevator("elev2", 100));
        movableFleet.add(new Ship("ship2", 100, 100));
        movableFleet.add(new Helicopter("heli2", 100, 100, 100));
        mySim.simulate(10);

    }
}
