package p.joe.netty.dp._4MultitionPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by CQ on 2017/8/28.
 */
@SuppressWarnings("all")
public class Emperor {

    private static int maxNumOfEmperor = 2;
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);

    private static int countNumOfEmperor = 0;

    static {

        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor((i + 1) + ""));
        }
    }

    private Emperor() {
    }

    private Emperor(String info) {
        emperorInfoList.add(info);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    public static void emperorInfo() {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
