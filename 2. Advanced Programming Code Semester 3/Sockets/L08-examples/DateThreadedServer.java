
import java.util.Date;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DateThreadedServer {//min 56 vid 14

  public static void main(String[] args) {
    ServerSocket serverSocket = null;

    System.out.println("Waiting for a connection on port 7654.");
    try {
      serverSocket = new ServerSocket(7654);
      while (true) {
        try {
          Socket connectionSocket = serverSocket.accept();
          Thread dateThread = new Thread(new DateThread(connectionSocket))
                  //dateThread is a class, we need to make an object
          // ;//new thread
          dateThread.start();
        } catch (IOException e) {
          System.out.println(e.getMessage());
        }
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        serverSocket.close();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}

class DateThread implements Runnable {

  Socket connSocket;

  public DateThread(Socket socket) {

    this.connSocket = socket;
  }

  public void run() {//in the run is where he puts the fnctions for the input and output
    BufferedReader clientInput;
    DataOutputStream clientOutput;

    Date now = new Date();
    try {
      clientInput = new BufferedReader(
              new InputStreamReader(this.connSocket.getInputStream()));
      clientOutput = new DataOutputStream(
              this.connSocket.getOutputStream());
      System.out.println("Connection made, waiting for client to send their name.");
      String clientText = clientInput.readLine();
      String replyText = "Welcome, " + clientText + ", Today is " + now.toString() + "\n";
      clientOutput.writeBytes(replyText);
      System.out.println("Sent: " + replyText);

      clientOutput.close();
      clientInput.close();
      this.connSocket.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
