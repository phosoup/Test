import java.awt.Desktop;
import java.net.URI;

public class SampleDemo {
 public static void main (String args[]) throws Exception
 {

    Desktop d= Desktop.getDesktop();
    d.browse(new URI("http://.google.com"));

 }
}
