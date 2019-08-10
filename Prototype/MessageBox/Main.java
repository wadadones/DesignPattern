import framework.*; //javacを行ったとこからの相対パス
class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register("under_pen", new UnderlinePen('-'));
        manager.register("under_john", new UnderlinePen('~'));
        manager.register("deco_pen", new MessageBox('*'));
        manager.register("deco_john", new MessageBox('+'));

        System.out.println(manager.getShowcase());

        Product p1 = manager.create("under_pen");
        Product p2 = manager.create("under_john");
        Product p3 = manager.create("deco_pen");
        Product p4 = manager.create("deco_john");

        p1.use("pen");
        p2.use("john");
        p3.use("pen");
        p4.use("john");
    }
}