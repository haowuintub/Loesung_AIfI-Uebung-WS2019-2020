package uebung9;

public class Patient extends Person {
    private int insuranceNumber;

    Patient(String name, int birthYear, int insuranceNumber) {
        super(name, birthYear);
        this.insuranceNumber = insuranceNumber;
    }



    int getInsuranceNumber() {
        return insuranceNumber;
    }
}
