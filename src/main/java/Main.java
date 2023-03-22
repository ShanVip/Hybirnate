import javax.persistence.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Item item = new Item("Coffee", 25, "Tasty");
        int id = itemService.add(item);

    }

}
