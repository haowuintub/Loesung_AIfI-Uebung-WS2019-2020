package uebung14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DynamicBinding {
    /**
     * The compiler sees v1, v2, and v3 having a compiletime-type of Vehicle. Method introduceYourself() is
     * implemented in Vehicle, so the compiler does not complain. During runtime, however, the runtime types of the
     * three objects are discovered, and the therefore the introduceYourself() methods of Vehicle, Airplane, and Ship
     * are used respectively.
     */

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
//        v1.introduceYourself();

        Vehicle v2 = new Airplane();
//        v2.introduceYourself();

        Vehicle v3 = new Ship();
//        v3.introduceYourself();

        //Aufgabe 2
        List<Vehicle> list = new ArrayList<>();
        list.add(v1);
        list.add(v2);
        list.add(v3);

        for(Vehicle vehicle : list){
            vehicle.introduceYourself();
        }

        // normale Schleifen
        for(int i = 0; i<list.size(); i++){
            Vehicle vehicle = list.get(i);
            vehicle.introduceYourself();
//            list.get(i).introduceYourself();
            list.remove(vehicle);
        }

        //Iterator
        for(Iterator<Vehicle> iter = list.iterator(); iter.hasNext();){
            Vehicle veh = iter.next();
            veh.introduceYourself();
            iter.remove();
        }
        System.out.println(list.size());




        //Aufgabe 3
/*        List<Vehicle> list = new ArrayList<>();
        list.add(v1);
        list.add(v2);
        list.add(v3);*/

        for(Vehicle vehicle : list){
            vehicle.introduceYourself();

            if(vehicle instanceof Airplane){
                ((Airplane) vehicle).flyAway();
            }else if(vehicle instanceof Ship){
                ((Ship) vehicle).sailAway();
            }

            
        }
    }
}




