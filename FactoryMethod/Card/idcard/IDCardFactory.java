package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    private static int cardNums = 0; 
    protected Product createProduct(String owner) {
        cardNums++;
        return new IDCard(owner, cardNums);
    }
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}