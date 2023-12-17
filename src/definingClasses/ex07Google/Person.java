package definingClasses.ex07Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Car car;
    private Company company;
    private List<Children> childrenList;
    private List<Parents> parentsList;
    private List<Pokemon> pokemonList;

    public Person(String name) {
        this.name = name;
        this.childrenList = new ArrayList<>();
        this.parentsList = new ArrayList<>();
        this.pokemonList = new ArrayList<>();

    }

    public String getName() {
        return  this.name;
    }

    public Car getCar() {
        return this.car;
    }

    public Company getCompany() {
        return this.company;
    }

    public List<Children> getChildrenList() {
        return this.childrenList;
    }

    public List<Parents> getParentsList() {
        return this.parentsList;
    }

    public List<Pokemon> getPokemonList() {
        return this.pokemonList;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    private String printCompany() {
        if (this.company != null) {
            return this.company.toString();
        }
        return "";
    }

    private String printPokemon() {
        if (this.pokemonList.size() > 0) {
            return pokemonList.toString().replaceAll("[\\[\\],]", "");
        }
        return "";
    }

    private String printParents() {
        if (this.parentsList.size() > 0) {
            return parentsList.toString().replaceAll("[\\[\\],]", "");
        }
        return "";
    }

    private String printChildren() {
        if (this.childrenList.size() > 0) {
            return childrenList.toString().replaceAll("[\\[\\],]", "");
        }
        return "";
    }

    private String printCar() {
        if (this.car != null) {
            return this.car.toString();
        }
        return "";
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder();

       stringBuilder.append(this.name).append("\n")
               .append("Company:")
               .append(printCompany()).append("\n")
               .append("Car:")
               .append(printCar()).append("\n")
               .append("Pokemon:")
               .append(printPokemon()).append("\n")
               .append("Parents:")
               .append(printParents()).append("\n")
               .append("Children:")
               .append(printChildren()).append("\n");

       return stringBuilder.toString();
    }
}
