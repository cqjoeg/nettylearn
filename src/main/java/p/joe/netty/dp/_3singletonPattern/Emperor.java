package p.joe.netty.dp._3singletonPattern;

/**
 * Created by CQ on 2017/8/28.
 */
public class Emperor {

    private static Emperor emperor = null;

    private Emperor() {
    }

    public static Emperor getInstance() {
        if (emperor == null) {
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo() {
        System.out.println("XXX");
    }
}
