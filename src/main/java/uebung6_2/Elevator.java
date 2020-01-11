package uebung6_2;

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
    public String getName() {
        return this.name;
    }

    @Override
    public void changeVerticalSpeed(double deltaSpeed) {
        this.speed += deltaSpeed;
    }

    @Override
    public void move() {
        this.z += this.speed ;
    }

    @Override
    public String toString(){
        return this.name + " (elevator) is height " + this.z;
    }

}
