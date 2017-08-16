package p.joe.netty.nio;


public class TimeServer {

    public static void main(String[] args) {
        int port = 8080;
        String[] args1 = {"8080"};
        if (args1 != null && args1.length > 0) {
            port = Integer.valueOf(args1[0]);
        }

        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
        new Thread(timeServer, "NIO-MultiplexerTimeServer-001").start();
    }

}
