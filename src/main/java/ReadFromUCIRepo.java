import java.net.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadFromUCIRepo {

    public static void main(String[] args) throws Exception {
        URL link = null;
        try{
            link =  new URL(args[0]);
        } catch (Exception e){
            throw new IllegalArgumentException("Pass in URL from https://archive.ics.uci.edu/ml/index.php");
        }
        String[] pathList = link.getPath().split("/", 10);
        String setName = pathList[pathList.length - 1];
        setName = setName.replace(".data","");

        HttpURLConnection con = (HttpURLConnection) link.openConnection();
        con.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(link.openStream()));
        String stringPath = "./src/main/resources/<file>.csv";
        stringPath = stringPath.replace("<file>", setName);
        Path path = Paths.get(stringPath);
        FileWriter myWriter = new FileWriter(stringPath);
        String line;
        while ((line = reader.readLine()) != null)
        {
            try {
                myWriter.write(line);
                myWriter.write("\n");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        reader.close();
        myWriter.close();

        Files.deleteIfExists(path);
    }

}

