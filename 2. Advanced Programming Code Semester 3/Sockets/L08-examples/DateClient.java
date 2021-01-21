
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DateClient {//min 10.07 vid 13, related to dateserver code

  public static void main(String[] args) {
    try {
      String hostname = "localhost";
      int port = 7654;

      System.out.println("Connecting to server on port " + port);
      Socket connSocket = new Socket(hostname, port);//requests server for connection

      BufferedReader serverInput = new BufferedReader(//input and output stream to server
              new InputStreamReader(connSocket.getInputStream()));
      DataOutputStream serverOutput = new DataOutputStream(
              connSocket.getOutputStream());
      System.out.println("Connection made, sending name.");
      serverOutput.writeBytes("Luis Gustavo Nardin\n");//sends name to server

      System.out.println("Waiting for reply.");
      String serverData = serverInput.readLine();//get info back from server
      System.out.println("Received: " + serverData);

      serverOutput.close();
      serverInput.close();
      connSocket.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
