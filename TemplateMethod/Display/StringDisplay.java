class StringDisplay extends AbstractDisplay {
    private String string;

    StringDisplay(String string) {
        this.string = string;
    }
    public void open() {
        printLine();
    }
    public void print() {
        System.out.println("|" + string + "|");
    }
    public void close() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");
        for(int i = 0; i < string.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}