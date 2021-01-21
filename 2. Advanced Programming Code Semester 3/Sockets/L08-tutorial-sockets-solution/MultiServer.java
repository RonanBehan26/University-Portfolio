
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {//min 30

  public static void main(String[] args) {
    int port = 8080;

    //vars
    ServerSocket serverSocket;
    Socket connSocket;

    BufferedReader clientInput;
    DataOutputStream clientOutput;

    String radius = "";
    Double circleArea;

    try {
      System.out.println("Waiting for a connection on port " + port + ".");
      serverSocket = new ServerSocket(port);//connect to port
      while (!radius.equals("30")) {//will stop when it hits 30
        connSocket = serverSocket.accept();//server socket in a while loop

        clientInput = new BufferedReader(//iput and output to the client
                new InputStreamReader(connSocket.getInputStream()));
        clientOutput = new DataOutputStream(
                connSocket.getOutputStream());
        System.out.println("Connection established.");
        radius = clientInput.readLine();//read value that come from the client
        System.out.println(radius);

        circleArea = Math.PI * Math.pow(Double.parseDouble(radius), 2);//calculate the circle area

        clientOutput.writeBytes(circleArea.toString());//send the circle area back to the client
        System.out.println("Circle area sent: " + circleArea.toString());
        clientOutput.close();
        clientInput.close();
        connSocket.close();
      }
      serverSocket.close();//exceptions
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
