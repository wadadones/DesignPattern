class Main {
    public static void main(String[] args) {
        AbstractDisplay chardis = new CharDisplay('a');
        AbstractDisplay stringdis = new StringDisplay("sdff");
        chardis.display();
        stringdis.display();
    }
}