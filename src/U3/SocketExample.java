package U3;
import java.net.*;
import java.io.*;
public class SocketExample {
    public static void main(String[] args) {
        try{
            System.out.println("Connecting to localhost on port 1234...");
            Socket client = new Socket("localHost", 1234);
            System.out.println("Connected to "+ client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Say Hi from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            System.out.println("Server: "+ in.readUTF());
            client.close();
        }
        catch(IOException e){e.printStackTrace();}
    }
}
