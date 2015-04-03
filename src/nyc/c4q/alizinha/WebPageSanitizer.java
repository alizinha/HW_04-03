package nyc.c4q.alizinha;
import java.net.URL;
/**
 *  * Created by Jaellys Bales and Allison Bojarski on 4/1/15.

 */
public class WebPageSanitizer
{
    static String sanitize(String html){

        while(html.contains("<script")) {

            // Defining start and end positions for tags in html.
            int scrStart = html.indexOf("<script");
            int scrEnd = html.indexOf("</script>");

            html = html.replace((html.substring(scrStart, scrEnd + 9)), ("")); // Clearing what's inside, + 9 accounts for close tag.
        }

        return html;
    }

    public static void main(String[] args) {
        URL url = HTTP.stringToURL("http://www.google.com");
        String html = HTTP.get(url);

        System.out.println(sanitize(html));
    }
}
