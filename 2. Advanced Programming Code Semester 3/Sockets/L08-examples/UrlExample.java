
import java.net.MalformedURLException;
import java.net.URL;

public class UrlExample {

  public static void main(String args[]) throws MalformedURLException {
    URL nci = new URL("http://ncirl.ie");

    System.out.println("Protocol: " + nci.getProtocol());
    System.out.println("Port: " + nci.getPort());
    System.out.println("Host: " + nci.getHost());
    System.out.println("File: " + nci.getFile());
  }
}
