import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ReadFromUCIRepo {

    public static void main(String[] args) throws Exception {
        URL link = null;
        try{
            link =  new URL(args[0]);
        } catch (Exception e){
            throw new IllegalArgumentException("Pass in URL from https://archive.ics.uci.edu/ml/index.php");
        }
        String[] pathList = link.getPath().split("/", 10);
        System.out.println(Arrays.asList(pathList));
        BufferedReader in = new BufferedReader(
                new InputStreamReader(link.openStream()));
        String pageHtml = new String();
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            pageHtml = pageHtml.concat(inputLine);
        in.close();
        Document html = Jsoup.parse(pageHtml);
        String title = html.title();
        String href = html.body().getElementsByTag("li").text();
        String[] arrOfStr = href.split(" ", 10);
        for (String temp : arrOfStr) {
            System.out.println(temp);
        }
    }
}

