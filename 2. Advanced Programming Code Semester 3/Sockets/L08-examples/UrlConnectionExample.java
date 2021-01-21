
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UrlConnectionExample {

  public static void main(String args[]) throws MalformedURLException, IOException {
    URL nci = new URL("http://www.ncirl.ie");

    URLConnection conn = nci.openConnection();

    long d = conn.getDate();
    System.out.print("Date: ");
    if (d == 0) {
      System.out.println("Not available");
    } else {
      System.out.println(new Date(d));
    }

    System.out.println("Content-Type: " + conn.getContentType());

    long exp = conn.getExpiration();
    System.out.print("Expires: ");
    if (exp == 0) {
      System.out.println("Not available");
    } else {
      System.out.println(new Date(exp));
    }

    long last = conn.getLastModified();
    System.out.print("Last-Modified: ");
    if (last == 0) {
      System.out.println("Not available");
    } else {
      System.out.println(new Date(last));
    }

    long len = conn.getContentLengthLong();
    System.out.print("Content-Length: ");
    if (len == 0) {
      System.out.println("Not available");
    } else {
      System.out.println(len);
    }
  }
}
