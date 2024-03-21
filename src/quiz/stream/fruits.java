package quiz.stream;

public class fruits {
    private String name;
    private String part;

    private int price;

    public fruits(String name, String part, int price) {
        this.name = name;
        this.part = part;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPart() {
        return part;
    }

    public int getPrice() {
        return price;
    }
}
