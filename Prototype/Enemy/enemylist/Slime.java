package enemylist;

import framework.*;
public class Slime implements Enemy {
    int hp;
    int atk;

    public Slime(int hp, int atk) {
        this.hp = hp;
        this.atk = atk;
    }

    public void show() {
        System.out.println("Slime");
        System.out.println("HP: " + hp);
        System.out.println("ATK: " + atk);
    }

    public Enemy createClone() {
        Enemy enemy = null;
        try {
            enemy = (Enemy)clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return enemy;
    }

}