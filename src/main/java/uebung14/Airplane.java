package uebung14;

class Airplane extends Vehicle{

    @Override
    void introduceYourself() {
        System.out.println("I fly high through the sky and produce a lot of CO2 - I'm an airplane...");
    }


    void flyAway() {
        System.out.println("I'm flying away");
    }

}
