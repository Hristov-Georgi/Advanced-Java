package definingClasses.ex07Google;

public class Pokemon {
    private String pokemonName;
    private String type;

    public Pokemon(String pokemonName, String type) {
        this.pokemonName = pokemonName;
        this.type = type;
    }

    public String getName() {
        return this.pokemonName;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n").append(this.pokemonName).append(" ").append(this.type);

        return stringBuilder.toString();
    }
}
