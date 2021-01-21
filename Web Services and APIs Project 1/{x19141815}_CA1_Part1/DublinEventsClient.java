/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dublineventsclient;

import java.io.*;
import java.net.*;
public class DublinEventsClient {
private static InetAddress host;
private static final int PORT = 1234;
private static DatagramSocket dgramSocket;
private static DatagramPacket inPacket, outPacket;
private static byte[] buffer;
public static void main(String[] args) {
try {
host = InetAddress.getLocalHost();
} catch(UnknownHostException e) {
System.out.println("Host ID not found!");
System.exit(1);
}
run();
}
private static void run() {
try {
dgramSocket = new DatagramSocket(); //datagram object

BufferedReader userEntry = new BufferedReader(
new InputStreamReader(System.in));
String message=null;
String response=null;


do {
    //enter in a date in any format you like, put a comma after it, this will be the key in the hashmap, then anything after will be info in an array in the hashmap
System.out.println("Enter the date first followed by a comma, then put in the info on the day: ");
message = userEntry.readLine();
if (!message.equals("exit")) {
outPacket = new DatagramPacket(
message.getBytes(),
message.length(),
host,
PORT); //create an outgoing datagram
dgramSocket.send(outPacket); //send the datagram message
buffer = new byte[256]; //put in a buffer for the datagram that arrives
inPacket = new DatagramPacket(
buffer,
buffer.length); //Step 5.
dgramSocket.receive(inPacket); //accept the datagram that arrives
response = new String(
inPacket.getData(),
        0,
inPacket.getLength()); //get the info from the buffer
System.out.println("\nSERVER> " + response);
}
} while (!message.equals("exit"));
} catch(IOException e) {
e.printStackTrace();
} finally {
System.out.println("\n* Closing connection... *");
dgramSocket.close(); //close down the socket
}
}
}