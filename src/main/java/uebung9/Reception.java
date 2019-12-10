package uebung9;

import gridworld.framework.actor.Bug;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Reception {

    private Queue<Person> waitList = new LinkedList<>();
    private Set<Person> file = new TreeSet<>() ;

    void addToWaitList(Person person){
        if (!waitList.contains(person)) {
            waitList.add(person);
        }
        file.add(person);
    }

    void visitDoctor(Doctor doctor) {
        Person person = waitList.poll();
        person.setTreatingDoctor(doctor);
        doctor.treatPatient() ;
        file.add(doctor);
    }


    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Dr. Teng", 1975);
        Doctor doc2 = new Doctor("Dr. Schulz", 1999);

        Patient p1 = new Patient("johnny", 1995, 111);
        Patient p2 = new Patient("marie", 2000, 113);
        Patient p3 = new Patient("clara", 1980, 119);
        Patient p4 = new Patient("bob", 2096, 300);

        Reception reception = new Reception() ;
        reception.addToWaitList(p1);
        reception.addToWaitList(p2);
        reception.addToWaitList(p3);
        reception.addToWaitList(p4);

        for (Person i : reception.waitList) {
            System.out.println(i);
        }

        reception.visitDoctor(doc1);
        reception.visitDoctor(doc2);
        reception.visitDoctor(doc1);

        System.out.println("\n");
        for (Person i : reception.waitList) {
            System.out.println(i);
        }


        System.out.println(doc1.getMoneyInBank());
        doc1.paySalary();
        System.out.println(doc1.getMoneyInBank());

        for (Person i : reception.file) {
            System.out.println(i);
        }



    }



}
