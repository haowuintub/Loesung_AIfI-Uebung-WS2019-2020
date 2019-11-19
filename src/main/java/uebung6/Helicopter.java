package uebung6;

class Helicopter implements CanMoveVertically, CanMoveHorizontally {


    private String name ;
    private double x ;
    private double y ;
    private double z ;

    private double verticalSpeed ;
    private double horizontalSpeed ;
    private double horizontalDirection ;


    Helicopter(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.verticalSpeed = 0 ;
        this.horizontalSpeed = 0 ;
        this.horizontalDirection = 0 ;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void changeVerticalSpeed( double deltaSpeed ) {
        this.verticalSpeed += deltaSpeed ;
    }


    @Override
    public void changeHorizontalSpeed( double deltaSpeed ) {
        this.horizontalSpeed += deltaSpeed ;
    }

    @Override
    public void changeDirection( double deltaDirection ) {
        this.horizontalDirection += deltaDirection ;
    }

    @Override
    public void move() {
        this.x += this.horizontalSpeed * Math.cos( this.horizontalDirection );
        this.y += this.horizontalSpeed * Math.sin( this.horizontalDirection );

        if (this.z + this.verticalSpeed <0 ){
            this.z = 0 ;
            this.verticalSpeed = 0 ;
            this.horizontalSpeed = 0 ;
            System.err.println( "Emergency Landing of " + this.name);
        } else {
            this.z += this.verticalSpeed ;
        }
    }


    @Override
    public String toString(){
        return this.name + " (helicopter) is at position x: " + this.x + ", y: " + this.y + ", z: " + this.z ;
    }
}
