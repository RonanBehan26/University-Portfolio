
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnectionExample {

  public static void main(String args[]) throws MalformedURLException, IOException {
    URL nci = new URL("http://ncirl.ie");

    HttpURLConnection conn = (HttpURLConnection) nci.openConnection();

    System.out.println("Request method: " + conn.getRequestMethod());

    System.out.println("Response code: " + conn.getResponseCode());

    System.out.println("Response message: " + conn.getResponseMessage());
  }
}
