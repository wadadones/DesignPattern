package idcard;
import framework.*;

public class IDCard extends Product {
    private String owner;
    private int cardNum;
    IDCard(String owner, int cardNum) { //idcard内からしか呼び出せない。つまりFactoryを経由しないといけない
        System.out.println("id:"+ cardNum +" "+ owner + "のカードを作ります");
        this.owner = owner;
        this.cardNum = cardNum;
    }
    public void use() {
        System.out.println("id:"+cardNum+" "+ owner + "のカードを使います");
    }

    public String getOwner() {
        return owner;
    }

    public int getCardNum() {
        return cardNum;
    }
}