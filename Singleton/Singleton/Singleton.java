public class Singleton {
    private static Singleton singleton = new Singleton(); // static: インスタンスを一個にするため
    private Singleton() { // private: 外部クラスからnewされないようにする
        System.out.println("インスタンスを生成しました");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}