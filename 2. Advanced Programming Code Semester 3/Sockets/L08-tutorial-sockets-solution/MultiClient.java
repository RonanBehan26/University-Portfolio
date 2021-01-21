
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MultiClient {

  public static void main(String[] args) {
    String hostname = "localhost";
    int port = 8080;

    Socket connSocket;
    BufferedReader serverInput;
    DataOutputStream serverOutput;

    String circleArea;

    // Send the radius to the server
    try {
      System.out.println("Connecting to server on port " + port);
      for (Integer radius = 10; radius < 30; radius++) {//for loop from 10 - 30, increments by 1
        connSocket = new Socket(hostname, port);

        serverInput = new BufferedReader(//create socket, in, out
                new InputStreamReader(connSocket.getInputStream()));
        serverOutput = new DataOutputStream(
                connSocket.getOutputStream());
        System.out.println("Connection established");

        serverOutput.writeBytes(radius.toString() + "\n");
        System.out.println("Waiting for reply.");
        circleArea = serverInput.readLine();
        System.out.println("Circle area is " + circleArea);

        serverOutput.close();
        serverInput.close();
        connSocket.close();
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
