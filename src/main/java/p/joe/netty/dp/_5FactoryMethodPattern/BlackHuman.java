package p.joe.netty.dp._5FactoryMethodPattern;

/**
 * Created by CQ on 2017/8/28.
 */
public class BlackHuman implements Human {
    public void laugh() {
        System.out.println("黑色人类会哭");
    }

    public void cry() {
        System.out.println("黑色人类会大笑 ");
    }

    public void talk() {
        System.out.println("黑色人类会说话");
    }
}
