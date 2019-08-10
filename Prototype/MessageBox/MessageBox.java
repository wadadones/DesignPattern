import framework.*;

public class MessageBox implements Product {
    char deco;

    public MessageBox(char deco) {
        this.deco = deco;
    }
    public void use(String s) {
        printLine(s.length() + 2, deco);
        System.out.println(deco + s + deco);
        printLine(s.length() + 2, deco);
    }
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

    private void printLine(int length, char c) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}