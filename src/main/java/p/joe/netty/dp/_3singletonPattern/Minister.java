package p.joe.netty.dp._3singletonPattern;

/**
 * Created by CQ on 2017/8/28.
 */
public class Minister {
    public static void main(String[] args) {
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo();

        Emperor emperor2 = Emperor.getInstance();
        Emperor.emperorInfo();


        Emperor emperor3 = Emperor.getInstance();
        emperor2.emperorInfo();
    }
}
