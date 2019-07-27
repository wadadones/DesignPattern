// Adapter
// 二つのクラスを
// - extends + implements
// - (extends or implements) + has_one
// どちらかで繋ぐ

class PrintBanner implements Print {
    Banner banner;
    PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    public void printWeak() {
        banner.showWithParen();
    }
    public void printStrong() {
        banner.showWithAster();
    }
}