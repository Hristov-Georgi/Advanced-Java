package definingClasses.ex07Google;

public class Children {
    private String name;
    private String birthday;

    public Children(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return  this.name;
    }

    public String getBirthday() {
        return this.birthday;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n").append(this.name).append(" ").append(this.birthday);

        return stringBuilder.toString();
    }
}
