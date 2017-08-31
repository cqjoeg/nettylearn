package p.joe.netty.dp._3singletonPattern;

/**
 * Created by CQ on 2017/8/28.
 */
public class SinglePattern {
    private static SinglePattern singlePattern = null;

//    private static final SinglePattern singlePattern = new SinglePattern();

    private SinglePattern() {
    }

    public SinglePattern getInstance() {
        if (this.singlePattern == null) {
            this.singlePattern = new SinglePattern();
        }
        return this.singlePattern;
    }
}
