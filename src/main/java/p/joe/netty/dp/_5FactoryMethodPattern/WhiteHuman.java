package p.joe.netty.dp._5FactoryMethodPattern;

/**
 * Created by CQ on 2017/8/28.
 */
public class WhiteHuman implements Human {
    public void laugh() {
        System.out.println("白色人类会哭");
    }

    public void cry() {
        System.out.println("白色人类会大笑，幸福呀！ ");
    }

    public void talk() {
        System.out.println("白色人类会说话，一般说的都是单字节");
    }
}
