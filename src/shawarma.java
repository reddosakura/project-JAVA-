import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class shawarma {
    private String name;
    private Integer price;
    private String size;
    private ArrayList<ingredient> ingrs;

    public shawarma(String name, Integer price, String size, ArrayList<ingredient> ingrs) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.ingrs = ingrs;
    }


    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<ingredient> getIngrs() {
        return ingrs;
    }
     public int GetTotallPrice(){
        int totalprice = price;
         for (var ing: ingrs) {
             totalprice += ing.getPrice();
         }
         return totalprice;
     }
     public String PrintAllIngredients(){
        List<String> ings = new ArrayList<>(List.of());
         for (var ing:ingrs) {
             ings.add(ing.getName());
         }
        return String.join( "\n\t", ings);
     }
}

