class Triple {
    private static Triple[] triple = new Triple[] {//loadingは一回
        new Triple(),
        new Triple(),
        new Triple()
    };
    private static int count = 0;
    private int id;
    private Triple() {
        count++;
        id = count;
    }
    public static Triple getInstance(int id) {
        return triple[id];
    }

    public static void main(String[] args) {
        System.out.println(Triple.getInstance(0));
        System.out.println(Triple.getInstance(1));
        System.out.println(Triple.getInstance(2));

    }
}