package p.joe.netty.dp._2ProxyPattern;

/**
 * Created by CQ on 2017/8/28.
 */
public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    public WangPo() {
        this.kindWomen = new PanJinLian();
    }

    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    public void makeEyeswithMan() {
        this.kindWomen.makeEyeswithMan();
    }

    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
