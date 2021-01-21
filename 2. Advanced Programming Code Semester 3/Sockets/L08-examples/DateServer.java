
import java.util.Date;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//basic server, accepts 1 connection and dies
//!!!!min 1.10 - he adds a while loop, sticks at socket accept, client finishes, server continues
public class DateServer {//vid 13 min 1.04.07
//once client connects, server keeps going
  public static void main(String[] args) {
    Date now = new Date(); //date object
    try {
      System.out.println("Waiting for a connection on port 7654.");
      ServerSocket serverSock = new ServerSocket(7654);//server socket, random no.
      //needs to be in the accept state to accept
      Socket connectionSock = serverSock.accept();//waiting for the client to connect, when it is accept
  //data gets storeed in the connectionStock
      BufferedReader clientInput = new BufferedReader(
              new InputStreamReader(connectionSock.getInputStream()));//stream with client side
      DataOutputStream clientOutput = new DataOutputStream(
              connectionSock.getOutputStream());//get strem from client
      System.out.println("Connection made, waiting for client to send their name.");
      String clientText = clientInput.readLine();//wait for infor from client, different from slides
      //read info from client
      //client send info and server replies
      //then send info back
      String replyText = "Welcome, " + clientText + ", Today is " + now.toString() + "\n";
      clientOutput.writeBytes(replyText);
      System.out.println("Sent: " + replyText);
//then closes everything
      clientOutput.close();
      clientInput.close();
      connectionSock.close();
      serverSock.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
