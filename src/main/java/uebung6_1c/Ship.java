package uebung6_1c;

import uebung6_1a.CanMoveHorizontally;

public class Ship implements CanMoveHorizontally {

    private String name ;
    private double hight;
    private double direction;
    private double speed ;
    private double x ;
    private double y ;

    Ship(String name, double x, double y){
        this.name = name ;
        this.hight = 0 ;
        this.direction = 0;
        this.speed = 0 ;
        this.x = x ;
        this.y = y ;
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
    public void move() {
        this.y += this.speed * Math.sin(this.direction) ;
        this.x += this.speed * Math.cos(this.direction) ;
    }

    @Override
    public String getName() {
        return this.name;
    }


    public String ToString(){
        return this.name + " (ship) is at position x: " + this.x + ", y: " + this.y ;
    }

}
