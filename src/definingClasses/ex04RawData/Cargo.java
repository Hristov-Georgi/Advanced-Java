package definingClasses.ex04RawData;

public class Cargo {
    private int cargoWeight;
    private String cargoType;

    public Cargo(int cargoWeight, String cargoType){
        this.cargoType = cargoType;
        this.cargoWeight = cargoWeight;
    }

    public String getCargoType() {
        return this.cargoType;
    }

    public Boolean isFragile() {
        if(this.cargoType.equals("fragile")) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isFlamable() {
        if(this.cargoType.equals("flamable")) {
            return true;
        } else {
            return false;
        }
    }

}
