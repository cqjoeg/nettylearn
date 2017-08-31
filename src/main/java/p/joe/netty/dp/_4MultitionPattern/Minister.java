package p.joe.netty.dp._4MultitionPattern;

/**
 * Created by CQ on 2017/8/28.
 */
public class Minister {

    public static void main(String[] args) {
        int ministerNum = 10;

        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print((i+1) + ":");
            emperor.emperorInfo();
        }
    }
}
