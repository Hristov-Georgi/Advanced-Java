package definingClasses.ex07Google;

public class Car {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return this.model;
    }

    public int getSpeed() {
        return  this.speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int carSpeed) {
        this.speed = carSpeed;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n").append(this.model).append(" ").append(this.speed);

        return stringBuilder.toString();
    }
}
