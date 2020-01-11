package uebung6_1b;


import uebung6_1a.CanMoveVertically;

class Elevator implements CanMoveVertically {

    private String name ;
    private double z ;
    private double speed ;


    Elevator(String name, double z) {
        this.name = name ;
        this.z = z ;
        this.speed = 0 ;
    }

    @Override
    public void move() {
        this.z += this.speed ;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void changeVerticalSpeed(double deltaSpeed) {
        this.speed += deltaSpeed;
    }


    public String toString(){
        return this.name + " (elevator) is height " + this.z;
    }

}
