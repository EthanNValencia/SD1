package Module2SD1;


import java.io.*;
import java.util.Scanner;

public class StringCleaner implements CONSTANTS{

    public static void cleanTheString(){
        File file = new File(downloadDirectory);
        try (Scanner scan = new Scanner(new FileInputStream(file))) {
            String reader = "";
            String content = "";

            String[] stringArray = new String[]{"<SPAN STYLE=\"margin-left: 20%\">", "<BR>", "<I>",
                    "&mdash", "</I>", "</SPAN>"}; // list of strings to delete

            char[] charArray = {',', '.', '\'', ';', '"', '!', '?'}; // list of chars to delete

            while (scan.hasNextLine()) {
                reader = scan.nextLine() + "\n";
                for (int i = 0; i <stringArray.length; i++){
                    if (reader.contains(stringArray[i])){
                        reader = reader.replaceAll(stringArray[i], "");
                    }
                }
                for (int i = 0; i < charArray.length; i++){
                    reader = reader.replace(charArray[i], ' ');
                }
                reader = reader.replaceAll("\\s+", " "); // deletes spaces
                reader = reader + "\n"; // ensures that it continues to the next line
                reader = reader.toUpperCase(); // converts all to upper case
                content = content.concat(reader); // saves all the changes to the content string
            }
            //System.out.println(content);
            WriteToFile.writeThisToFile(normalizedDirectory, content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
