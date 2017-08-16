package p.joe.netty.BIO;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TimeServer {

    public static void main(String[] args) throws IOException {
        String[] args1 = {"8080"};
        int port = 8080;
        if (args1 != null && args1.length > 0) {
            try {
                port = Integer.valueOf(args1[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

        }

        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            System.out.println("The time server is start in port:" + port);
            Socket socket = null;
            TimeServerHandlerExecutePool singleExecutor = new TimeServerHandlerExecutePool(50, 10000);
            while (true) {
                socket = server.accept();
                singleExecutor.execute(new TimeServerHandler(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                System.out.println("The time server is closed!");
                server.close();
                server = null;
            }

        }


    }
}
