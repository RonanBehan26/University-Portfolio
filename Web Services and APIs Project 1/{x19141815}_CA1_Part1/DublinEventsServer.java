/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dublineventsserver;


import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DublinEventsServer {
private static final int PORT = 1234;
private static DatagramSocket dgramSocket;
private static DatagramPacket inPacket, outPacket;
private static byte[] buffer;

public static void main(String[] args) {
System.out.println("Opening port...\n");
try {
dgramSocket = new DatagramSocket(PORT);//We need to create a datgram socket object for network communication
} catch(SocketException e) {
System.out.println("Unable to bind to port!");
System.exit(1);
}
run();
}

private static void run() {
try {
String messageIn,messageOut;
String date; 
String otherInfo; 
int numMessages = 0;


//So we want to create some arrays to store the info from the date and the otherInfo
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();

//Then we will store the arrays in the hashmap
HashMap<String, List> hashMap = new HashMap<String, List>();

do {
buffer = new byte[512]; //here we are creating the buffer for the incoming datagrams from the client
inPacket = new DatagramPacket(buffer, buffer.length); //we create a datagram packet object for the incoming datagrams
dgramSocket.receive(inPacket); //accept this datagram
InetAddress clientAddress = inPacket.getAddress(); //accept the address of the sender an the packet port
int clientPort = inPacket.getPort(); 

//clear the lists, from the last time it was used so we can start again
list1.clear();
list2.clear();
messageIn = new String(inPacket.getData(),0,inPacket.getLength()); //get the data from the buffer

//from the start of the sentence to the , will be the String date 
date = messageIn.substring( 0, messageIn.indexOf(","));

//after the comma will be the String otherInfo
otherInfo = messageIn.substring(messageIn.indexOf(",")+1, messageIn.length());


//then add the otherInfo to the array list 1
list1.add(otherInfo);

if (hashMap.containsKey(date)){ //if the hashmap already contains the date as the key
list2.addAll(list1); // put the elements of list 1 at the end of list 2

//then add the values of the key date
list2.addAll(hashMap.get(date));

//add full list 2 to value of the hashmap
hashMap.put(date, list2);
} else // or else it will be the date
{hashMap.put(date, list1);}
System.out.println("Message received.");
numMessages++;

messageOut = ("The day's events for "+ date +" are as follows: "+  hashMap.get(date).toString());
outPacket = new DatagramPacket(
messageOut.getBytes(),
messageOut.length(),
clientAddress,
clientPort); //this is the datagram you are going to send back
dgramSocket.send(outPacket); //send this datagram response
} while (true);
} catch(IOException e) {
e.printStackTrace();
} finally { //If exception thrown, close connection.
System.out.println("\n* Closing connection... *");
dgramSocket.close(); //close down the datagram
}
}
}
