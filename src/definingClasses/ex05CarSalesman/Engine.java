package definingClasses.ex05CarSalesman;

public class Engine {

    private String model;
    private int power;
    private int displacement;  //optional
    private String efficiency; // optional

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
        this.displacement = 0;
    }

    @Override
    public String toString() {

        String displacementStr;

        if(this.displacement == 0) {
            displacementStr = "n/a";
        } else {
            displacementStr = "" + this.displacement;
        }

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.model).append(":").append("\n")
                .append("Power: ").append(this.power).append("\n")
                .append("Displacement: ").append(displacementStr).append("\n")
                .append("Efficiency: ").append(this.efficiency);

        return stringBuilder.toString();
    }

}
