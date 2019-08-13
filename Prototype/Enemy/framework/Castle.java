package framework;
import java.util.*;

public class Castle {
    private HashMap list = new HashMap();

    public void register(String name, Enemy enemy) {
        list.put(name, enemy);
    }
    public Enemy create(String name) {
        Enemy enemy = (Enemy)list.get(name);//getで返されるのはObjectなのでEnemyにキャスト
        return enemy.createClone();
    }
}