import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;

public class Connection{
      public static void main(String[] args) {
         String [] urls = {"https://www.google.com","https://www.youtube.com","https://www.facebook78k.com","https://www.imdb.com"};
         int  counter = 0;
         for(String url:urls){
        if (isInternetAvailable(url)) {
            System.out.println(url.replaceFirst("https://","") + " is accessible from your device");
        } else if(!isInternetAvailable(url)) {
            System.out.println(url.replaceFirst("https://","") + " is not accessible from your device");
            counter ++;
        }
        if(counter == urls.length){
         System.out.println("check your network connection");
        }
     }
    }

    private static boolean isInternetAvailable(String link) {
        try {
            final URL url = new URL(link);
            final URLConnection conn = url.openConnection();
            conn.connect();
            conn.getInputStream().close();
            return true;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            return false;
        }
    }
}

	
