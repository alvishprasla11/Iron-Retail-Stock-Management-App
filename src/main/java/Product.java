import java.util.ArrayList;
import java.util.List;

public class Product {
    public static List<List<Object>> productsList = new ArrayList<>();
    public static List<Integer> quan = new ArrayList<>();
        public static void addProduct(String material, String shape, int width, int length, int thickness, int diameter, double costPerUnit, String date, int quantity) {
        quan.add(quantity-1);
            for (int i = 0; i < quantity; i++) {
            List<Object> details = new ArrayList<>();
            details.add(material);
            details.add(shape);
            details.add(width);
            details.add(length);
            details.add(thickness);
            details.add(diameter);
            details.add(costPerUnit);
            details.add(date);
            details.add(quantity); // Set the quantity in the loop to i + 1
            productsList.add(details);
        }
    }
    public static void clearLists() {
        productsList.clear();
        quan.clear();
    }
}

