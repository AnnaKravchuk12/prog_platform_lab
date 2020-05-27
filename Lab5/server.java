import java.net.*;
import java.io.*;
public class Server {
    public static final  int port = 9999;
    public static void main(String[] args) {

        try {
            PrintWriter writer = new PrintWriter("ServerLog.txt", "UTF-8");

            ServerSocket ss = new ServerSocket(port);
            System.out.println("Waiting for a client...");

            Socket socket = ss.accept(); // чекаю на підключення
            System.out.println("Client connected!");

//            InputStream sin = socket.getInputStream();
//            OutputStream sout = socket.getOutputStream();

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());



            String line = null;
            while(true) {
                line = in.readUTF(); // записування даних клієнта  в line
                String[] arr = line.split("\\s");
                String clientName = arr[0];
                System.out.println("Client name is : <<" + clientName + ">>" );
                System.out.println("Line from " + clientName +" : " + line);
                out.writeUTF(arr[1]); // відсилаю назад вже без імені
                out.flush(); // зупиняю потік
                System.out.println("Waiting for the next line...");

                writer.println("\"Client name is : <<\" + clientName + \">>\" ");
                writer.println("Line from " + clientName +" : " + line);
                writer.println(arr[1]);
                writer.println("Waiting for the next line...");
                writer.close();
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
