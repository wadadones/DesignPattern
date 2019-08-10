package framework;
import java.util.*;

public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, Product p) { //インスタンスを複製するための雛形を用意
        showcase.put(name, p);
    }

    public Product create(String name) { //雛形をベースにインスタンスをクローンして作成
        Product p = (Product)showcase.get(name);
        return p.createClone(); //クローンを呼びだす。実際にクローンを行うメソッドはProduct自身
    }

    public HashMap getShowcase() {
        return showcase;
    }
}