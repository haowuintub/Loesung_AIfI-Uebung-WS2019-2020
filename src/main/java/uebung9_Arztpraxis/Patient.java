package uebung9_Arztpraxis;

class Patient extends Person {

    int insuranceNumber;

    Patient(String name, int birthYear ,int insuranceNumber) {
        super(name, birthYear) ;
        this.insuranceNumber = insuranceNumber ;
    }

/*    int getInsuranceNumber() {
        return insuranceNumber;
    }*/

}
