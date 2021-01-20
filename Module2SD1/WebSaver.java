package Module2SD1;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebSaver implements CONSTANTS {
    public static void writePageToFile() {
        try {
            URL url = new URL(websiteURL);
            Scanner scan = new Scanner(url.openStream());
            String reader = "";
            String content = "";
            while (scan.hasNextLine()) {
                reader = scan.nextLine() + "\n";
                    if (reader.contains("<BR>")) // all the lines of text I want contain <BR>
                        content = content.concat(reader);
            }
            WriteToFile.writeThisToFile(downloadDirectory, content);
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
