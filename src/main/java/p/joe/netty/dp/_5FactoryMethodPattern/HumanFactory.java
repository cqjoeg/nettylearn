package p.joe.netty.dp._5FactoryMethodPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CQ on 2017/8/28.
 */
public class HumanFactory {


    private static Map<String, Human> humans = new HashMap<String, Human>();

    public static Human createHuman(Class c) {
        Human human = null;

        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误！ ");
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人类找不到！ ");
        }

        return human;
    }


    public static Human createHumNew(Class c) {

        Human human = null;
        try {
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(), human);
            }
        } catch (InstantiationException e) {
            System.out.println("必须指定人类颜色!");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误!");
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人类找不到！");
        }
        return human;
    }
}
