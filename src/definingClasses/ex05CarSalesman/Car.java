package definingClasses.ex05CarSalesman;

public class Car {

    private String model;
    private Engine engine;
    private int weight;    //optional
    private String color;  //optional

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, int weight, String color) {
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
        this.weight = 0;
    }

    @Override
    public String toString() {

        String weightToStr;
        if (this.weight == 0) {
            weightToStr = "n/a";
        } else {
            weightToStr = "" + this.weight;
        }

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.model).append(":").append("\n")
                .append(this.engine).append("\n")
                .append("Weight: ").append(weightToStr).append("\n")
                .append("Color: ").append(this.color);

        return stringBuilder.toString();
    }

}
