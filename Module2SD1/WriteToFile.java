package Module2SD1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {

    public static void writeThisToFile(String directory, String content) throws IOException {
        FileWriter fw = new FileWriter(directory);

        PrintWriter writer = new PrintWriter(directory); // this will erase the file
        writer.print("");
        writer.close();

        fw.write(content);
        fw.close();
    }
}
