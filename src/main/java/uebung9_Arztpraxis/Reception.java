package uebung9_Arztpraxis;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Reception {

    Queue<Patient> waitList = new LinkedList<>();
    Set<Person> file = new TreeSet<>();


    void addToWaitList(Patient patient){
        waitList.add(patient);
        /*if (!waitList.contains(patient)) {
            waitList.add(patient);
        }*/

        file.add(patient);
    }

    void visitDoctor(Doctor doctor) {
        doctor.treatPatient() ;
        waitList.poll();
        file.add(doctor);
    }



}