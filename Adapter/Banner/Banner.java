// Adaptee
// 実際に動いてるメソッド、既存のメソッド
// 交流電源
class Banner {
    String string;
    Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("("+ string +")");
    }

    public void showWithAster() {
        System.out.println("*"+ string +"*");
    }
}