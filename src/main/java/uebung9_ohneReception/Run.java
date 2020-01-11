package uebung9_ohneReception;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Run {

/*    private void addToWaitList(Person person){
        if (!waitList.contains(person)) {
            waitList.add(person);
        }
        file.add(person);
    }

    private void visitDoctor(Doctor doctor) {
        waitList.poll();
        doctor.treatPatient() ;
        file.add(doctor);
    }*/


    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Dr. Teng", 1975);
        Doctor doc2 = new Doctor("Dr. Schulz", 1999);

        Patient p1 = new Patient("johnny", 1995, 111);
        Patient p2 = new Patient("marie", 2000, 113);
        Patient p3 = new Patient("clara", 1980, 119);
        Patient p4 = new Patient("bob", 2096, 300);

        Queue<Person> waitList = new LinkedList<>();
        Set<Person> file = new TreeSet<>() ;

        Run reception = new Run() ;
        waitList.add(p1);
        file.add(p1);
        waitList.add(p2);
        file.add(p2);
        waitList.add(p3);
        file.add(p3);
        waitList.add(p4);
        file.add(p4);

        for (Person i : waitList) {
            System.out.println(i);
        }

        //改reception.visitDoctor(doc1);
        waitList.poll();
        doc1.treatPatient() ;
        file.add(doc1);

        //改reception.visitDoctor(doc2);
        waitList.poll();
        doc2.treatPatient() ;
        file.add(doc2);

        //改reception.visitDoctor(doc1);
        waitList.poll();
        doc2.treatPatient() ;
        file.add(doc1);

        System.out.println("\n");
        for (Person i : waitList) {
            System.out.println(i);
        }




/*        System.out.println("\n");
        for (Person i : reception.file) {
            System.out.println(i);
        }*/


        System.out.println("\n");
        System.out.println(doc1.getMoneyInBank());
        doc1.paySalary();
        System.out.println(doc1.getMoneyInBank());


        System.out.println("\n");
        for (Person i : file) {
            System.out.println(i);
        }



    }



}
