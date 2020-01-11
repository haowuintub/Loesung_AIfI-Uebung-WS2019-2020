package uebung9_Arztpraxis;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Run {

    public static void main(String[] args) {

        Patient p1 = new Patient("johnny", 1995, 111);
        Patient p2 = new Patient("marie", 2000, 113);
        Patient p3 = new Patient("clara", 1980, 119);
        Patient p4 = new Patient("bob", 2096, 300);

        Doctor doc1 = new Doctor("Dr. Teng", 1975);
        Doctor doc2 = new Doctor("Dr. Schulz", 1999);


        Reception reception = new Reception() ;

        reception.addToWaitList(p1);
        reception.addToWaitList(p2);
        reception.addToWaitList(p3);
        reception.addToWaitList(p4);
//        reception.addToWaitList(p2);

        for (Patient i : reception.waitList) {
            System.out.println(i);
        }

        reception.visitDoctor(doc1);
        reception.visitDoctor(doc2);
        reception.visitDoctor(doc1);

        System.out.println("\n");
        for (Patient i : reception.waitList) {
            System.out.println(i);
        }


/*        System.out.println("\n");
        for (Person i : reception.file) {
            System.out.println(i);*/


        System.out.println("\n");
        System.out.println(doc1.getMoneyInBank());
        doc1.paySalary();
        System.out.println(doc1.getMoneyInBank());

        System.out.println(doc2.getMoneyInBank());
        doc2.paySalary();
        System.out.println(doc2.getMoneyInBank());




        System.out.println("\n");
        reception.visitDoctor(doc2);

        System.out.println(doc2.getMoneyInBank());
        doc2.paySalary();
        System.out.println(doc2.getMoneyInBank());


        System.out.println("\n");
        for (Person i : reception.file) {
            System.out.println(i);

        }
    }

}
