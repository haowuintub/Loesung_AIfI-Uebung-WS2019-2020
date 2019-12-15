package uebung9;

class Doctor extends Person implements Coworker {

    private int moneyInBank = 0 ;
    private int treatedPatients = 0;

    Doctor(String name, int birthYear){
        super(name, birthYear);
    }

    void treatPatient() {
        treatedPatients++;

    }
    @Override
    public void paySalary() {
        moneyInBank += treatedPatients*SALARY;
        treatedPatients = 0 ;
    }

    @Override
    public int getMoneyInBank() {
        return moneyInBank ;
    }

}
