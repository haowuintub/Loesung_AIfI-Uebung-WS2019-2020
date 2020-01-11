package uebung9_Arztpraxis;

public class Doctor extends Person implements Coworker {

    public int treatedPatients ;
    private int moneyInBank ;

    void treatPatient() {
        treatedPatients++;
    }


    Doctor(String name, int birthYear) {
        super(name, birthYear);
        treatedPatients = 0 ;
        moneyInBank = 0 ;
    }

/*    void setTreatedPatients(int treatedPatients){
        this.treatedPatients = treatedPatients ;
    }*/

    @Override
    public void paySalary() {
        moneyInBank = moneyInBank + treatedPatients * SALARY ;
        treatedPatients = 0 ;
    }

    @Override
    public int getMoneyInBank() {
        return moneyInBank;
    }
}
