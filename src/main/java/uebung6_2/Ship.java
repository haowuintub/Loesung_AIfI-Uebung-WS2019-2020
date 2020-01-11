package uebung6_2;

class Ship implements CanMoveHorizontally {

    private String name ;
    private double x ;
    private double y ;
    private double speed ;
    private double direction;


    Ship(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.speed = 0 ;
        this.direction = 0 ;
    }

    @Override
    public String getName() {
        return this.name ;
    }

    @Override
    public void move() {
        this.x += this.speed * Math.cos(this.direction);
        this.y += this.speed * Math.sin(this.direction);
    }

    @Override
    public void changeHorizontalSpeed(double deltaSpeed) {
        this.speed += deltaSpeed;
    }

    @Override
    public void changeDirection(double deltaDirection) {
        this.direction += deltaDirection;
    }

    @Override
    public String toString(){
        return this.name + " (ship) is at position x: " + this.x + ", y: " + this.y ;
    }
}
