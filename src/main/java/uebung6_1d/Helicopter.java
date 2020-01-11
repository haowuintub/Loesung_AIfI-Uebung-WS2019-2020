package uebung6_1d;

import uebung6_1a.CanMoveHorizontally;
import uebung6_1a.CanMoveVertically;

public class Helicopter implements CanMoveHorizontally, CanMoveVertically {

    private String name ;
    private double direction;
    private double horizontalSpeed ;
    private double verticalSpeed ;
    private double x ;
    private double y ;
    private double z ;

    Helicopter(String name, double x, double y, double z){
        this.name = name ;
        this.direction = 0;
        this.horizontalSpeed = 0 ;
        this.verticalSpeed = 0 ;
        this.x = x ;
        this.y = y ;
        this.z = z ;
    }

    @Override
    public void changeHorizontalSpeed(double deltaSpeed) {
        this.horizontalSpeed += deltaSpeed ;
    }

    @Override
    public void changeVerticalSpeed(double deltaSpeed) {
        this.verticalSpeed += deltaSpeed ;
    }


    @Override
    public void changeDirection(double deltaDirection) {
        this.direction += deltaDirection;
    }


    @Override
    public void move() {
        this.y += this.horizontalSpeed * Math.sin(this.direction) ;
        this.x += this.horizontalSpeed * Math.cos(this.direction) ;

        if(this.z + this.verticalSpeed < 0){
            this.z = 0 ;
            this.verticalSpeed = 0 ;
            this.horizontalSpeed = 0 ;
            System.err.println("Emergency Landing of " + this.name);
        }else{
            this.z += this.verticalSpeed ;
        }

    }

    @Override
    public String getName() {
        return this.name;
    }


    public String ToString(){
        return this.name + " (helicopter) is at position x: " + this.x + ", y: " + this.y + ", z: " + this.z ;
    }

}
