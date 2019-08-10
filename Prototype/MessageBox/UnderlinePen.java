import framework.*;

public class UnderlinePen implements Product {
    char c;

    public UnderlinePen(char c) {
        this.c = c;
    }
    public void use(String s) {
        System.out.println(s);
        printLine(s.length(), c);
    }

    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch(CloneNotSupportedException e) {
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