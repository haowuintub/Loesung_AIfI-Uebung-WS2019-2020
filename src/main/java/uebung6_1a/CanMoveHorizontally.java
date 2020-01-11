package uebung6_1a;

public interface CanMoveHorizontally extends Movable {

    void changeHorizontalSpeed(double deltaSpeed) ; // implizit public
    void changeDirection(double deltaDirection) ;// implizit public

}
