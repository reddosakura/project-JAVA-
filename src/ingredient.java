public class ingredient {
    private String name;
    private Integer price;

    public ingredient(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
