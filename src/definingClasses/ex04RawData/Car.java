package definingClasses.ex04RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String carModel;
    List<Engine> engineList;
    List<Cargo> cargoList;
    List<Tyres> tyresList;

    public Car(String carModel) {
        this.carModel = carModel;
        this.engineList = new ArrayList<>();
        this.cargoList = new ArrayList<>();
        this.tyresList = new ArrayList<>();
    }

    public List<Engine> getEngineList() {
        return engineList;
    }

    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public List<Tyres> getTyresList() {
        return tyresList;
    }
}
