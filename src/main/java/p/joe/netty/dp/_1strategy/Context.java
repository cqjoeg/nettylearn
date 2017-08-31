package p.joe.netty.dp._1strategy;

/**
 * Created by CQ on 2017/8/28.
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }
    public void operate(){
        this.strategy.operate();
    }
}
