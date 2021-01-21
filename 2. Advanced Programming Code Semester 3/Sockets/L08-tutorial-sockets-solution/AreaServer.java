
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class AreaServer {

  public static void main(String[] args) {
    int port = 8080;

    ServerSocket serverSocket;
    Socket connSocket;

    String radius;
    Double circleArea;

    try {
      System.out.println("Waiting for a connection on port " + port + ".");
      serverSocket = new ServerSocket(port);
      connSocket = serverSocket.accept();

      BufferedReader clientInput = new BufferedReader(
              new InputStreamReader(connSocket.getInputStream()));
      DataOutputStream clientOutput = new DataOutputStream(
              connSocket.getOutputStream());
      System.out.println("Connection established.");
      radius = clientInput.readLine();
      System.out.println(radius);

      circleArea = Math.PI * Math.pow(Double.parseDouble(radius), 2);

      clientOutput.writeBytes(circleArea.toString());
      System.out.println("Circle area sent: " + circleArea.toString());

      clientOutput.close();
      clientInput.close();
      connSocket.close();
      serverSocket.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
