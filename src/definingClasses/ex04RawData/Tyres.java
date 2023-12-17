package definingClasses.ex04RawData;

public class Tyres {
    private double tyrePressure_1;
    private int tyreAge_1;
    private double tyrePressure_2;
    private int tyreAge_2;
    private double tyrePressure_3;
    private int tyreAge_3;
    private double tyrePressure_4;
    private int tyreAge_4;

    public Tyres(double tyrePressure_1, int tyreAge_1, double tyrePressure_2, int tyreAge_2,
                 double tyrePressure_3, int tyreAge_3, double tyrePressure_4, int tyreAge_4) {
        this.tyreAge_1 = tyreAge_1;
        this.tyreAge_2 = tyreAge_2;
        this.tyreAge_3 = tyreAge_3;
        this.tyreAge_4 = tyreAge_4;
        this.tyrePressure_1 = tyrePressure_1;
        this.tyrePressure_2 = tyrePressure_2;
        this.tyrePressure_3 = tyrePressure_3;
        this.tyrePressure_4 = tyrePressure_4;
    }

    public double getTyrePressure_1() {
        return tyrePressure_1;
    }

    public double getTyrePressure_2() {
        return tyrePressure_2;
    }

    public double getTyrePressure_3() {
        return tyrePressure_3;
    }

    public double getTyrePressure_4() {
        return tyrePressure_4;
    }

    public Boolean fragileTyrePressure() {
        double tyrePressure = this.tyrePressure_1 + this.tyrePressure_2 + this.tyrePressure_3 + this.tyrePressure_4;
        if((tyrePressure / 4) < 1){
            return true;
        } else {
            return false;
        }
    }

}
