package p.joe.netty.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by CQ on 2017/8/15.
 */
public class TimeClient {
    public static void main(String[] args) {
        String[] args1 = {"8080"};
        int port = 8080;
        if (args1 != null && args1.length > 0) {
            try {
                port = Integer.valueOf(args1[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        
    }
}
