package definingClasses.ex03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelConsumtion;
    private int distanceTravelled;

    public Car(String model, double fuelAmount, double fuelConsumtion) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelConsumtion = fuelConsumtion;
        this.distanceTravelled = 0;
    }

    public Boolean calculateDistance(int kmToMove) {
        double requiredFuel = kmToMove * this.fuelConsumtion;

        if (requiredFuel > this.fuelAmount) {
            return false;
        } else {
            this.fuelAmount -= requiredFuel;
            this.distanceTravelled += kmToMove;
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTravelled);
    }

}
