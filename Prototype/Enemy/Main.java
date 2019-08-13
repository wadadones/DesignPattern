import framework.*;
import enemylist.*;

class Main {
    public static void main(String[] args) {
        Castle castle = new Castle();
        castle.register("slime1", new Slime(100,20));

        Enemy s1 = castle.create("slime1");
        Enemy s2 = castle.create("slime1");
        s1.show();
        s2.show();
    }
}