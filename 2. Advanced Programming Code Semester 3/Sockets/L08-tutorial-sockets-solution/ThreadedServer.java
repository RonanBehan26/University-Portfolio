
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadedServer { //vid 14 min 56 - it is different but the logic holds up
//SORRY, this is task 3 - can be done with the multiclient
  public static void main(String[] args) {
    int port = 8080; //port

    ServerSocket serverSocket = null;//socket server
    Socket connSocket;

    try {
      System.out.println("Waiting for a connection on port " + port + ".");
      serverSocket = new ServerSocket(port);
      while (true) {
        try { //accept connection, then new instance of thread, create thread, start thread
          connSocket = serverSocket.accept(); //socket created by accept
          Thread areaThread = new Thread(new AreaThread(connSocket));//answer client connection
          //area thread class below
          areaThread.start();
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

class AreaThread implements Runnable { //class need runnable to create new thread
  //new thread in this, 2 ways but we're doing the runnable interface herer

  Socket connSocket;

  //this part is important, everytime a client connects a thread is created
  public AreaThread(Socket connSocket) {
    this.connSocket = connSocket;
  }//thread accpets
  //acciated to a socket variable


  //implement
  public void run() {//where we implient ther establishing the input and output with client
    BufferedReader clientInput;
    DataOutputStream clientOutput;

    String radius;
    Double circleArea;

    try {
      clientInput = new BufferedReader(
              new InputStreamReader(connSocket.getInputStream()));
      clientOutput = new DataOutputStream(//data input/output
              connSocket.getOutputStream());
      System.out.println("Connection established.");
      radius = clientInput.readLine();//read
      System.out.println(radius);

      circleArea = Math.PI * Math.pow(Double.parseDouble(radius), 2);

      //Thread.sleep(1000); - does this in the vid, not taks 3 though

      clientOutput.writeBytes(circleArea.toString());//
      System.out.println("Circle area sent: " + circleArea.toString());

      clientOutput.close();
      clientInput.close();
      this.connSocket.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}

/*
public class DateThreadedServer {//15, 04.00

public static void main(String[] args) {
ServerSocket serverSocket = null;

System.out.println ("Waiting for a connection on port 7654.");
try{
serverSocket = new ServerSocket(7654);//specific port
while(true){//while loop to let the server accept from multiple servers
try{
Socket connectionSocket = serverSocket.accept();
Thread dateThread = new Thread(new DateThread(connectionSocket));//new thread, send connectionSocket, related to client
dateThread();
}catch(IOException e){
System.out.println(e.getMessage());
}
}
}catch(IOException e){
System.out.println(e.getMessage());
}finally{
try{
serverSocket.close();
}catch(IOException e){
System.out.println(e.getMessage());
}
}
}
}

class DateThread implements Runnable {

Socket connSocket;

public DateThread(Socket socket){//accepts socket as parameter in constructor
this.connSocket = socket;
}

public void run(){//parameter used to communicate with the client
BufferedReader clientInput; //input output from client
DataOutputStream clientOutput;

Date now new Date();
try{
clientInput = new BufferedReader(
new InputStreamReader(this.connSocket.getInputStream()));
clientOutput = new DataOutputStream(
this.connSocket.getOutputStream());
System.out.println("Connection made, waiting for client to send their name.");
String clientText = clientInput.readLine();
String replyText = "Welcome, " + clientText + ", Today is " + now.String() + "\n";
clientOutput.writeBytes(replyText);

Thread.sleep(10000);//multiple connections can be accepted by this server

System.out.println("Sent: " + replyText);

clientOutput.close();
clientInput.close();
this.connSocket.close();
}catch {Exception e) {
System.out.println(e.getMessage());
}





 */
